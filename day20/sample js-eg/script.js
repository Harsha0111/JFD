const convert = (kg) => {
  let pounds = kg * 2.2046;
  document.getElementById("weightInPounds").innerHTML = pounds.toFixed(0);
};