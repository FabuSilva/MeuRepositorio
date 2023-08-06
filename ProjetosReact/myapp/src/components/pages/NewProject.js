import ProjectForm from "../project/ProjectForm";
import style from "./NewProject.module.css";
export default function NewProject(){
    function createPost(project){
        project.cost = 0;
        project.services = [];
        fetch("http://localhost:5000/projects",{
            method:'POST',
            headers:{
                'Content-type':'application/json',
            },
            body: JSON.stringify(project),
        }).then((res) => res.json()).then((data) =>{console.log(data)})
        .catch((error) =>{console.log(error)})
    } 
    return(
        <div className={style.container}>
            <h1>Criar projetos</h1>
            <p>Crie seus projetos para adicionar seus serviços</p>
            <ProjectForm handleSubmit={createPost} textBt="Criar projeto"/>
        </div>
    )
}