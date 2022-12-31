fetch(geres_list_http + new URLSearchParams({
    api_key: api_key
}))
.then(res => res.json())
.then(data => {
    data.genres.forEach(item => {
        fetchMovieList(item.id, item.name)
    });
})

const fetchMovieList = (id, genres) =>{
    fetch(geres_list_http + new URLSearchParams({
        api_key:api_key,
        with_genres:id,
        page:Math.floor(Math.random()*3)+1
    }))
    .then(res => res.json())
    .then(data => {
        makeCategory(`${genres}_movies`,data.results)
    })
    .catch(err => console.log(err))
}

const main = document.querySelector(".main")
const makeCategory = (category, data) =>{
    main.innerHTML +=`
    <div class="movie-list">

            <button class="pre-btm">
                <img src="img/prev.png" alt="previous button">
            </button>

            <h1 class="movie-category">${category.replace("_"," ")}</h1>

            <div class="movie-container" id="${category}">
                
            </div>

            <button class="next-btm">
                <img src="img/next.png" alt="next button">
            </button>
        </div>
    `
}