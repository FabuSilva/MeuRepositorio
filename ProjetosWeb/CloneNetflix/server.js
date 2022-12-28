const express = require("express")
const path = require("path")
const port = 3333

let intialPath = path.join(__dirname, "public")
let app = express()

app.use(express.static(intialPath))
app.get("/", (req,res)=>{
    res.sendFile(path.join(intialPath, "index.html"))
})

app.listen(port,()=>{
    console.log("Funcionou!!!")
})