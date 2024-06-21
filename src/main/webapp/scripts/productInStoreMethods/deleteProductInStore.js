const deleteProductInStoreBtns = document.querySelectorAll('.productInStore-delete-btn');

deleteProductInStoreBtns.forEach(btn => {
    btn.addEventListener('click', async () => {
        console.log("clicked")
        const params = new URLSearchParams();
        params.append('upc', btn.parentElement.querySelector("p").id);
        const response = await fetch(`allProductsInStore/deleteProductInStore`, {
            method: 'POST',
            body: params
        });
        if (response.status === 200) {
            window.location.reload();
        }else {
            console.error('Failed to delete product');
        }
    });
});