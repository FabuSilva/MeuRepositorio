import style from './Container.module.css';
export default function component(props){
    return(
        <div className={`${style.container} ${style[props.customClass]}`}>
            {props.children}
        </div>
    )
}