const updateBtns = document.querySelectorAll('.update-category-btn');

updateBtns.forEach(updateBtn => {
    updateBtn.addEventListener('click', async (e) => {
        const id = updateBtn.parentElement.querySelector("p").id;

        const response = await fetch(`allCategories/updateCategory?categoryId=${id}`, {
            method: 'GET',
        });
        if(response.status === 200) {
            console.log('Category is updating');
            window.location.href = `allCategories/updateCategory?categoryId=${id}`;
        }
        else {
            console.error('Failed to update category');
        }
    });
});