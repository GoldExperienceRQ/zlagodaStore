const updateEmployeeBtns = document.querySelectorAll('.employee-update-btn');

updateEmployeeBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', (e) => {
    const employeeId = updateBtn.parentElement.querySelector("p").id;

    fetch(`allEmployees/updateEmployee?employeeId=${employeeId}`, {
        method: "GET",
    }).then(res =>{
        if(res.ok){
            console.log("Employee is updating");
            window.location.href = `allEmployees/updateEmployee?employeeId=${employeeId}`;
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