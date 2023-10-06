const pokeContainer = document.querySelector(".pokemons");

const fetchPokemon = async () => {
    for (let i = 1; i <= 20; i++) {
        const data = await getPokemon(i);
        createPokemonCard(data); // Cria e adiciona um cartão de Pokémon ao HTML
    }
}

const getPokemon = async (id) => {
    const url = `https://pokeapi.co/api/v2/pokemon/${id}`;
    const response = await fetch(url);
    if (!response.ok) {
        throw new Error('Resposta da rede não foi bem-sucedida');
    }
    const data = await response.json();
    return data;
}

const createPokemonCard = (data) => {
    const pokemonCard = document.createElement("li");
    pokemonCard.classList.add("pokemon");

    const numberSpan = document.createElement("span");
    numberSpan.classList.add("number");
    numberSpan.textContent = `#${data.id.toString().padStart(3, '0')}`;

    const nameSpan = document.createElement("span");
    nameSpan.classList.add("name");
    nameSpan.textContent = data.name;

    const typesList = document.createElement("ol");
    typesList.classList.add("types");
    data.types.forEach((typeData) => {
        const typeItem = document.createElement("li");
        typeItem.classList.add("type");
        typeItem.textContent = typeData.type.name;
        typesList.appendChild(typeItem);
    });

    const image = document.createElement("img");
    image.src = data.sprites.versions['generation-v']['black-white']['animated']['front_default'];
    image.alt = data.name;

    const detailDiv = document.createElement("div");
    detailDiv.classList.add("detail");
    detailDiv.appendChild(numberSpan);
    detailDiv.appendChild(nameSpan);
    detailDiv.appendChild(typesList);
    detailDiv.appendChild(image);

    pokemonCard.appendChild(detailDiv);

    pokeContainer.appendChild(pokemonCard);
}

fetchPokemon();
