import { useEffect, useState } from "react";
import Input from "../form/InputComponent";
import Select from "../form/Select";
import Submit from "../form/Submit";
import style from "./ProjectForm.module.css"
export default function ProjectForm() {
  const [categorias, setCategoria] = useState([]);
  useEffect(() =>{
    fetch("http://localhost:5000/categories",{
      method:"GET",
      headers:{
        'Content-Type':'application/json'
      }
    })
    .then((res) =>res.json())
    .then((data) =>{ setCategoria(data)})
    .catch((error) => console.log(error))
  },[]);

  return (
    <form className={style.form}>
      <Input type="text" text="Nome do projeto" name="name" placeholder="Digite o nome do prpjeto"/>
      <Input type="number" text="Orçamento" name="orcamento" placeholder="Digite o orçamento total"/>
      <Select name="id_category" text="Selecione a categoria" options={categorias}/>
      <Submit text="Criar projeto"/>
    </form>
  );
}
