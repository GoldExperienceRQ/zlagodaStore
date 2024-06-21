const updateCheckBtns = document.querySelectorAll('.check-update-btn');

updateCheckBtns.forEach((btn) => {
    btn.addEventListener('click', async() => {

        const checkNumber = btn.parentElement.querySelector("p").id

        const response=  await fetch(`allChecks/updateCheck?checkNumber=${checkNumber}`, {
            method: 'GET',
        });
        if(response.status === 200) {
            console.log('Check is updating');
            window.location.href = `allChecks/updateCheck?checkNumber=${checkNumber}`;
        }else{
            console.error('Failed to update check');
        }

    });
});