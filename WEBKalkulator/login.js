document.getElementById("login-form").addEventListener("submit", function (e) {
    e.preventDefault();

    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username === "1" && password === "1") {
        window.location.href = "index.html";
    } else {
        alert("Login gagal. Coba lagi.");
    }
});
