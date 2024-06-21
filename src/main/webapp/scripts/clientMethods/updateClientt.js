const updateClientBtns = document.querySelectorAll('.update-client-btn');

updateClientBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', (e) => {
            console.log("Clicked")
            const clientNumber = updateBtn.parentElement.querySelector("p").id
            fetch(`allClients/updateClient?clientNumber=${clientNumber}`, {
                method: 'GET',
            })
                .then(response => {
                    if (response.ok) {
                        console.log(response.url)
                        window.location.href = `allClients/updateClient?clientNumber=${clientNumber}`;
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