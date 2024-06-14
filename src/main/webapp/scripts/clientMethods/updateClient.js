const updateClientBtns = document.querySelectorAll('.update-client-btn');

updateClientBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', (e) => {
            console.log(updateBtn.parentElement.querySelector("p").id)

            const paramsToUpdate = new URLSearchParams();

            paramsToUpdate.append('client-number', updateBtn.parentElement.querySelector("p").id);
            paramsToUpdate.append('client-name', prompt("Enter new client name"));
            paramsToUpdate.append('client-surname', prompt("Enter new client surname"));
            paramsToUpdate.append('client-patronymic', prompt("Enter new client patronymic"));
            paramsToUpdate.append('client-city', prompt("Enter new client city"));
            paramsToUpdate.append('client-street', prompt("Enter new client street"));
            paramsToUpdate.append('client-index', prompt("Enter new client index"));
            paramsToUpdate.append('client-phone', prompt("Enter new client phone"));
            paramsToUpdate.append('client-percent', prompt("Enter new client percent"));



            fetch("allClients/updateClient", {
                method: 'POST',
                headers: {
                    'Content-Type': "application/x-www-form-urlencoded",
                },
                body: paramsToUpdate
            })
                .then(response => {
                    if (response.ok) {
                        console.log(response.url)
                        console.log("successfully updated client");
                        window.location.reload();
                    } else {
                        response.json().then(data => {
                            alert(data.message);
                        });
                    }
                })
                .catch(error => {
                    console.error('Error:', error);
                });
        }
    );
});