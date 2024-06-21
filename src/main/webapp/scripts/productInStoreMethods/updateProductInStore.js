const updateProductInStoreBtns = document.querySelectorAll('.productInStore-update-btn');
updateProductInStoreBtns.forEach(btn => {
    btn.addEventListener("click", async () => {
        const upc = btn.parentElement.querySelector("p").id;
        const response = await fetch(`allProductsInStore/updateProductInStore?upc=${upc}`, {
            method: "GET",
        });
        if(response.status === 200) {
            console.log('Product in store is updating');
            window.location.href = `allProductsInStore/updateProductInStore?upc=${upc}`;
        } else {
            console.error('Failed to update product in store');
        }
    });
});