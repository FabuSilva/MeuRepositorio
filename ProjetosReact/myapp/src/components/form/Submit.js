import style from "./Submit.module.css"
export default function Submit({text}){
    return(
        <div className={style.control}>
            <button className={style.btn}>{text}</button>
        </div>
    );
}