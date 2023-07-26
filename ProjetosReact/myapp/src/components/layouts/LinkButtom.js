import {Link} from "react-router-dom";
import style from "./LinkButtom.module.css";
export default function LinkButtom({to,text}){
    return(
        <Link className={style.btn} to ={to}>{text}</Link>
    )
}