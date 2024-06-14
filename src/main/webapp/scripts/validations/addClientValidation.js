 const addClientForm = document.querySelector("form")
const inputs = document.querySelectorAll("input")

function validateInputs(errors) {
    for (const input of inputs) {

        const notNecessary = true
        const list = {
            number: 13,
            name: 50,
            surname: 50,
            patronymic: [50, notNecessary],
            phone: 13,
            city: [50, notNecessary],
            street: [50, notNecessary],
            index: [9, notNecessary],
        }
        let inputIdValue = list[input.id]
        if (typeof inputIdValue === "object") {
            let amount = inputIdValue[0]

            if(input.value.trim().length >= amount){
                errors.push(`${input.id} must be less than ${amount} characters`)
            }
        }
        else if(input.id === "percent"){
            if(input.value <= 0 || input.value > 100){
                errors.push("Percent must be between 0 and 100")
            }
        }
        else {
            if(input.value.trim().length >= inputIdValue || input.value.trim() === ""){
               errors.push(`${input.id} is required and must be less than ${inputIdValue} characters`)
            }
        }
    }
}

addClientForm.addEventListener("submit", (e) => {
    let errors = []
    validateInputs(errors)
    if (errors.length > 0) {
        e.preventDefault()
        alert(errors.join("\n"))
    }
})