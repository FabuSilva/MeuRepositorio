import { useEffect, useState } from "react";
import Input from "../form/InputComponent";
import Select from "../form/Select";
import Submit from "../form/Submit";
import style from "./ProjectForm.module.css";
import { useNavigate } from "react-router-dom";

export default function ProjectForm({ handleSubmit, textBt, projectData }) {
  const [categorias, setCategoria] = useState([]);
  const [project, setProject] = useState(projectData || []);
  const navigate = useNavigate();
  useEffect(() => {
    fetch("http://localhost:5000/categories", {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((res) => res.json())
      .then((data) => {
        setCategoria(data);
      })
      .catch((error) => console.log(error));
  }, []);

  const submit = (e) => {
    e.preventDefault();
    handleSubmit(project);
    navigate('/project',{msg:'Projeto criado com sucesso!'})
    
  };

  function handleChange(e) {
    setProject({ ...project, [e.target.name]: e.target.value });
    console.log(project);
  }

  function handleCategory(e) {
    setProject({ ...project, categorias:{
      id: e.target.value,
      name: e.target.options[e.target.selectedIndex].text,
    } });
  }

  return (
    <form onSubmit={submit} className={style.form}>
      <Input
        type="text"
        text="Nome do projeto"
        name="name"
        placeholder="Digite o nome do projeto"
        handleOnChange={handleChange}
        value={project.name?project.name:''}
      />
      <Input
        type="number"
        text="Orçamento"
        name="orcamento"
        placeholder="Digite o orçamento total"
        handleOnChange={handleChange}
        value={project.orcamento?project.orcamento:''}
      />
      <Select
        name="id_category"
        text="Selecione a categoria"
        options={categorias}
        handleOnChange={handleCategory}
        value={project.categorias? project.categorias.id:''}
      />
      <Submit text={textBt} />
    </form>
  );
}
