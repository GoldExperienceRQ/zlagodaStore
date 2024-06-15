const addEmplForm = document.querySelector("form");
const inputs = addEmplForm.querySelectorAll("input");

function validateInputs(errors){
    for(let input of inputs) {

        const notNecessary = true
        const list = {
            employee_id: 13,
            name: 50,
            surname: 50,
            patronymic: [50, notNecessary],
            position: 10,
            phone: 13,
            city: 50,
            street: 50,
            index: 50,
        }

        let inputIdValue = list[input.id]

        if(typeof inputIdValue === "object") {
            let amount = inputIdValue[0]
            if(input.value.trim().length >= amount){
                errors.push(`${input.id} must be less than ${amount} characters`)
            }
        }
        else if(input.id === "salary"){
            if(input.value <= 0){
                errors.push("Salary must be greater than 0")
            }
        }
        else if(input.type === "date"){
            if(input.value === ""){
                errors.push("Date of birth must be filled")
            }
        }
        else{
            if(input.value.trim().length >= inputIdValue || input.value.trim() === ""){
                errors.push(`${input.id} must be less than ${inputIdValue} characters`)
            }
        }
    }
}

addEmplForm.addEventListener("submit", (e) => {
    let errors = []
    validateInputs(errors);
    if (errors.length > 0) {
        e.preventDefault();
        alert(errors.join("\n"))
    }
})