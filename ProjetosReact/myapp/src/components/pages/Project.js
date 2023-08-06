import React from "react";
import { useLocation } from "react-router-dom";
import Message from "../layouts/Message";

export default function Project() {
    const location = useLocation();
    let msg ='';
    if(location.state){
        msg = location.state.msg;
    }
    console.log("Message:", msg);
    return (
        <div>
            <h1>Meus projetos</h1>
            {msg &&<Message msg={msg} type="success" />}
        </div>
    );
}
