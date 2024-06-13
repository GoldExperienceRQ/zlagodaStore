const addProductForm = document.querySelector("form")
const productName = document.getElementById("product-name")
const productCategory = document.getElementById("category")
const characteristic = document.getElementById("characteristics")

addProductForm.addEventListener("submit", (e) => {
    let errors = []


    if(productName.value.trim() === "" || productName.value.length > 50){
        errors.push("Product name is required and must be less than 50 characters")
    }
    if(productCategory.value.trim() === "default"){
        errors.push("Category is required")
    }
    if(characteristic.value.trim() === "" || characteristic.value.length > 100){
        errors.push("Characteristics are required and must be less than 100 characters")
    }
    if(errors.length > 0){
        e.preventDefault()
        alert(errors.join("\n"))
    }
})