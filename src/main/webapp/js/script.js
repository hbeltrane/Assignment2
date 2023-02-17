/**
*
*/
const getDate = function(input) {
    const inputDate = document.querySelector(input);
    return new Date(inputDate.value); 
}

const isValidDepartDate = function() {
    let departDate = getDate("input[name=depart]");
    let today = new Date();
    return departDate > today;
 }

 const isValidReturnDate = function() {
    let returnDate = getDate("input[name=return]");
    let departDate = getDate("input[name=depart]");
    return returnDate > departDate
 }

const isRoundTrip = function() {
    const roundChk = document.querySelector("input[name=round]");
    return roundChk.checked;
}

function dateValidation () {
    if (!isValidDepartDate()) {
        alert('Please choose a valid date');
        return false;
    }
    if (isRoundTrip() && !isValidReturnDate()) {
        alert('Please choose a valid date');
        return false;
    }
    return true;
}

function FormValidation() {
    let destination = document.querySelector("select[name=to]");
    if(isRoundTrip() && destination.value == "") {
        alert('Please select a destination');
        destination.style.borderColor = "red";
        return false;
    }
    
    return true
}

document.querySelector("form").onsubmit = function() {
    if (!(dateValidation())){
        return false;
    }
    return FormValidation();
};