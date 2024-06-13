const addCategoryForm = document.querySelector("form");
const categoryName = document.getElementById("category-name")

addCategoryForm.addEventListener("submit", (e)=>{
    let errors = []

    if(categoryName.value.trim() === "" || categoryName.value.length > 50){
        errors.push("Category name is required and must be less than 50 characters")
    }
    if(errors.length > 0){
        e.preventDefault()
        alert(errors.join("\n"))
    }
})




