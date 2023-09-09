
const loginForm = document.getElementById("login-form");
const usernameInput = document.getElementById("username");
const passwordInput = document.getElementById("password");
const message = document.getElementById("message");

loginForm.addEventListener("submit", function (e) {
    e.preventDefault();

    const enteredUsername = usernameInput.value;
    const enteredPassword = passwordInput.value;

    // Check if the entered credentials match the stored credentials
    const storedUsername = localStorage.getItem("username");
    const storedPassword = localStorage.getItem("password");

    if (enteredUsername === storedUsername && enteredPassword === storedPassword) {
        message.textContent = "Login successful!";
    } else {
        message.textContent = "Login failed. Please check your credentials.";
    }
});

const registerForm = document.getElementById("register-form");
const regUsernameInput = document.getElementById("reg-username");
const regPasswordInput = document.getElementById("reg-password");
const regMessage = document.getElementById("reg-message");

registerForm.addEventListener("submit", function (e) {
    e.preventDefault();

    const regUsername = regUsernameInput.value;
    const regPassword = regPasswordInput.value;

    // Check if the username already exists in local storage
    const existingUser = localStorage.getItem(regUsername);

    if (!existingUser) {
        // Store the registration data in local storage
        localStorage.setItem(regUsername, regPassword);
        regMessage.textContent = "Registration successful!";
    } else {
        regMessage.textContent = "Username already exists. Please choose a different one.";
    }
});
