const updateEmployeeBtns = document.querySelectorAll('.employee-update-btn');

updateEmployeeBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', (e) => {
    const params = new URLSearchParams();
    params.append('id', updateBtn.parentElement.querySelector("p").id);
    params.append('name', prompt("Enter new employee name"));
    params.append('surname', prompt("Enter new employee surname"));
    params.append('patronymic', prompt("Enter new employee patronymic"));
    params.append('role', prompt("Enter new employee role"));
    params.append('salary', prompt("Enter new employee salary"));
    params.append("dateOfStart", prompt("Enter new employee date of start"));
    params.append("dateOfBirth", prompt("Enter new employee date of birth"));
    params.append('phone', prompt("Enter new employee phone"));
    params.append('city', prompt("Enter new employee city"));
    params.append('street', prompt("Enter new employee street"));
    params.append('index', prompt("Enter new employee index"));
    fetch("allEmployees/updateEmployee", {
        method: "POST",
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: params
    }).then(res =>{
        if(res.ok){
            console.log("Successfully updated employee");
            window.location.reload();
        } else {
            res.json().then(data => {
                alert(data.message);
            });
        }
    }).catch(error => {
        console.error('Error:', error);

    })
    });
});