import style from "./Home.module.css";
import saving from "../../img/savings.svg"
import LinkButtom from "../layouts/LinkButtom";
export default function Home(){
    return(
        <section className={style.homeContainer}>
            <h1>Bem vindo ao cost</h1>
            <p>Comece a gerenciar seus projetos agora mesmo</p>
            <LinkButtom to="/newProject" text="Criar projetos"/>
            <img src={saving} alt="imagem"/>
        </section>
    )
}