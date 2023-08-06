import style from "./Message.module.css";
import { useState, useEffect } from "react";

export default function Message({ msg, type }) {
  const [visible, setVisible] = useState(false);
  useEffect(() =>{
    if(!msg){
        setVisible(false);
        return
    }
    setVisible(true)
    const time = setTimeout(() =>{
        setVisible(false)
    },3000);

    return () => clearTimeout(time);
  },[msg]);
  console.log("Visible:", visible); // Adicione este console.log
  return (
    <>
      {visible && (
      <div className={`${style.message} ${style[type]}`}>{msg}</div>)}
    </>
  );
}
