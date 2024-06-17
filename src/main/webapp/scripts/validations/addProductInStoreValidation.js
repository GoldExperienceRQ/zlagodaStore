const form = document.querySelector("form")

const upc = document.getElementById("upc")
const upcProm = document.getElementById("upc-prom")
const idProduct = document.getElementById("id-product")
const price = document.getElementById("price")
const quantity = document.getElementById("quantity")
const isPromotional = document.getElementById("is-promotional")

form.addEventListener("submit", (e) =>{
    let errors = []

    if(upc.value.length > 50 || upc.value.length < 1){
        errors.push("UPC is required")
    }

    if(idProduct.value.trim() === "default"){
        errors.push("Product ID is required")
    }

    if(price.value < 1){
        errors.push("Price is required")
    }

    if(quantity.value.length < 1){
        errors.push("Quantity is required")
    }

    if(errors.length > 0){
        e.preventDefault()
        alert(errors.join("\n"))
    }
})