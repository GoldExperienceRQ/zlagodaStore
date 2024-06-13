const deleteBtns = document.querySelectorAll('.delete-category-btn');


deleteBtns.forEach(deleteBtn => {
    deleteBtn.addEventListener('click', (e) => {
            console.log(deleteBtn.parentElement.querySelector("p").id)
            const params = new URLSearchParams();
            params.append('category-id', deleteBtn.parentElement.querySelector("p").id);
            fetch("allCategories/deleteCategory", {
                method: 'POST',
                headers: {
                    'Content-Type': "application/x-www-form-urlencoded",
                },
                body: params
            })
                .then(response => {
                    if (response.ok) {
                        console.log(response.url)
                        console.log("successfully deleted category");
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
})

