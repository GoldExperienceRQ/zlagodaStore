const updateProductBtns = document.querySelectorAll('.product-update-btn');
updateProductBtns.forEach(btn => {
    btn.addEventListener("click", async (e) => {
        const productId =  btn.parentElement.querySelector("p").id;
        const response = await fetch(`allProducts/updateProduct?productId=${productId}`, {
            method: "GET",
        });
        if (response.status === 200) {
            console.log('Product is updating');
            window.location.href = `allProducts/updateProduct?productId=${productId}`;
        } else {
            console.error('Failed to update product');
        }
    })
});