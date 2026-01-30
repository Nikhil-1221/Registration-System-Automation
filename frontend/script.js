document.addEventListener("DOMContentLoaded", function () {

  const submitBtn = document.getElementById("submitBtn");

  const firstName = document.getElementById("firstName");
  const lastName = document.getElementById("lastName");
  const email = document.getElementById("email");

  const country = document.getElementById("country");
  const state = document.getElementById("state");
  const city = document.getElementById("city");

  const password = document.getElementById("password");
  const confirmPassword = document.getElementById("confirmPassword");
  const terms = document.getElementById("terms");

  const locationData = {
    India: {
      Bihar: ["Patna", "Gaya"],
      Karnataka: ["Bangalore", "Mysore"]
    },
    USA: {
      California: ["Los Angeles", "San Diego"],
      Texas: ["Houston", "Dallas"]
    }
  };

  country.addEventListener("change", function () {
    state.innerHTML = '<option value="">Select State</option>';
    city.innerHTML = '<option value="">Select City</option>';

    if (this.value) {
      Object.keys(locationData[this.value]).forEach(st => {
        let option = document.createElement("option");
        option.value = st;
        option.textContent = st;
        state.appendChild(option);
      });
    }
  });

  state.addEventListener("change", function () {
    city.innerHTML = '<option value="">Select City</option>';

    if (this.value) {
      locationData[country.value][this.value].forEach(ct => {
        let option = document.createElement("option");
        option.value = ct;
        option.textContent = ct;
        city.appendChild(option);
      });
    }
  });

  document.addEventListener("input", function () {
    submitBtn.disabled = !(
      firstName.value &&
      lastName.value &&
      email.value.includes("@") &&
      country.value &&
      state.value &&
      city.value &&
      password.value.length >= 6 &&
      password.value === confirmPassword.value &&
      terms.checked
    );
  });

});
