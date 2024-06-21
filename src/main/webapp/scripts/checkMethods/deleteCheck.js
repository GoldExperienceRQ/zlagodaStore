const deleteCheckBtns = document.querySelectorAll('.check-delete-btn');

deleteCheckBtns.forEach((btn) => {
    btn.addEventListener("click", async () => {
        const checkNumber = btn.parentElement.querySelector("p").id
        const params = new URLSearchParams();
        params.append('checkNumber', checkNumber);
        const response = await fetch(`allChecks/deleteCheck`, {
            method: 'POST',
            headers: {
                'Content-Type': "application/x-www-form-urlencoded",
            },
            body: params
        })
        if(response.status === 200){
            window.location.reload();
        }
        else{
            console.error("Failed to delete check");
        }
    })
});