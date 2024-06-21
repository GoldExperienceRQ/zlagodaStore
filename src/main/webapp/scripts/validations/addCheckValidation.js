const addCheckForm = document.querySelector('form');
const checkNumber = document.getElementById('check-number');
addCheckForm.addEventListener('submit', (e) => {
    let errors = [];

    if (checkNumber.value.length < 1 || checkNumber.value.length > 10) {
        errors.push('Check number must be between 1 and 10 characters');
    }

    if (errors.length > 0) {
        e.preventDefault();
        const errorElement = document.getElementById('error');
        console.error(errors.join(', \n'));
    }
});