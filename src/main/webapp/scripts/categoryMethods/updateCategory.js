const updateBtns = document.querySelectorAll('.update-category-btn');

updateBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', (e) => {
        let name = prompt("Enter new category name");
        if(name !=null && name != "") {
            const params = new URLSearchParams();
            params.append("category-id", updateBtn.parentElement.querySelector("p").id);
            params.append('category-name', name);

            fetch("allCategories/updateCategory", {
                method: 'POST',
                headers: {
                    'Content-Type': "application/x-www-form-urlencoded",
                },
                body: params
            })
                .then(response => {
                    if (response.ok) {
                        console.log(response.url)
                        console.log("successfully updated category");
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

        }else{
            console.log("Category name is required")
        }
    });
});