const emplDeleteBtns = document.querySelectorAll('.employee-delete-btn');

emplDeleteBtns.forEach(btn => {
    btn.addEventListener('click', (e) => {
        const employeeId = btn.parentElement.querySelector("p").id;
        const params = new URLSearchParams();
        params.append('employeeId', employeeId);
        fetch("allEmployees/deleteEmployee", {
            method: "POST",
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: params
        }).then(res =>{
            if(res.ok){
                console.log("Successfully deleted employee");
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