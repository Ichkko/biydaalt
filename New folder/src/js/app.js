
let categories = document.querySelector(".dropdown-content");


async function fetchcategiries(url) {
    try {


        let data = await fetch(url);
        let angilal = await data.json();
        for (let i = 0; i < angilal.length; i++) {
            let name = angilal[i].name;

            categories.innerHTML += `
             <div class="category">
                        <a href="/src/angilal/${name}.html">${name}</a>
                       
                    </div>
           `;
        }
    } catch (err) {
        console.log(err);
    }
}

fetchcategiries("http://localhost:8080/api/categories");

let products = document.querySelector(".bagts-content");


async function fetchcustomers(url) {
    try {


        let data = await fetch(url);
        let response = await data.json();
        for (let i = 0; i < response.length; i++) {
            let name = response[i].name;
            let price = response[i].price;
            let description = response[i].description;
            products.innerHTML += ` <div class="bagts">

                <img src="/dist/img/${name}.png" alt="">
                <div>
                <div style=" text-align: center; ">${name}<br>
          
           <div style="color:rgb(67, 67, 66); font-weight: 700; font-size: 13px;"> ${price}
            </div><small style="font-size: 8px; font-weight: 700;">MNT</small></div>
          
           <div style="font-size: 11px; font-weight: 600;  text-align: center; ">Турк</div>
          <div><a class="udur" href="zahialga.html">Захиалга өгөх</a> </div>
           </div>
          </div> `;
        }
    } catch (err) {
        console.log(err);
    }
}

fetchcustomers("http://localhost:8080/api/products");

