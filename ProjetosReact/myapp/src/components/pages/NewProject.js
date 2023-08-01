import ProjectForm from "../project/ProjectForm";
import style from "./NewProject.module.css";
export default function NewProject(){
    return(
        <div className={style.container}>
            <h1>Criar projetos</h1>
            <p>Crie seus projetos para adicionar seus serviços</p>
            <ProjectForm/>
        </div>
    )
}