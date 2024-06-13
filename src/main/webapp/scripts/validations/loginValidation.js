const loginForm = document.querySelector("form")
const loginNameInput = document.getElementById("login-name");
const passwordInput = document.getElementById("password")

loginForm.addEventListener("submit", (e) =>{

    let isValid = true;

    if(loginNameInput.value.trim() === ""){
        console.log("Login Name is required")
        isValid = false;

    }

    if(passwordInput.value.trim() === ""){
        console.log("Password is required");
        isValid = false;
    }

    if(!isValid){
        console.log("Login data is incorrect")
        e.preventDefault()
    }
})
