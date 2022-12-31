const setupScrooling = () =>{
    const container = [... document.querySelectorAll(".movie-container")]
    
    const next_btm = [... document.querySelectorAll(".next-btm")]
    const pre_btm = [... document.querySelectorAll(".pre-btm")]

    container.forEach((item, i) =>{
        let containerDimensions = item.getBoundingClientRect()
        let containerWith = containerDimensions.width

        next_btm[i].addEventListener('click', () =>{
            item.scrollLeft += containerWith
        })

        pre_btm[i].addEventListener('click', () =>{
            item.scrollLeft -= containerWith
        })
    })
}