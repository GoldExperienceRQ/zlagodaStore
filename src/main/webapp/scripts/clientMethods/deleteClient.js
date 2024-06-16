const deleteCLientBtns = document.querySelectorAll('.delete-client-btn');

deleteCLientBtns.forEach(deleteBtn => {
    deleteBtn.addEventListener('click', (e) => {
        console.log("clicked")
            console.log(deleteBtn.parentElement.querySelector("p").id)
            const params = new URLSearchParams();
            params.append('client-number', deleteBtn.parentElement.querySelector("p").id);
            fetch("allClients/deleteClient", {
                method: 'POST',
                headers: {
                    'Content-Type': "application/x-www-form-urlencoded",
                },
                body: params
            })
                .then(response => {
                    if (response.ok) {
                        console.log(response.url)
                        console.log("successfully deleted client");
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