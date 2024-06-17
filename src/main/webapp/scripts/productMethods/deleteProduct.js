const deleteProductBtns = document.querySelectorAll('.product-delete-btn');

deleteProductBtns.forEach(btn => {
    btn.addEventListener('click', async (e) => {
        const params = new URLSearchParams();
        params.append('productId', btn.parentElement.querySelector("p").id);
        const response = await fetch("allProducts/deleteProduct", {
            method: 'POST',
            body: params
        });

        if (response.status === 200) {
            window.location.reload();
        } else {
            console.error('Failed to delete product');
        }
    });
});