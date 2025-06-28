document.getElementById("loginForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const email = document.getElementById("email").value.trim();
  const password = document.getElementById("password").value.trim();
  const error = document.getElementById("error");

  // Simulación de validación básica (luego se reemplaza por API)
  if (email === "cliente@fintech.com" && password === "1234") {
    alert("¡Inicio de sesión exitoso!");
    // Aquí rediriges a la dashboard del cliente
    window.location.href = "dashboard.html";
  } else {
    error.textContent = "Correo o contraseña incorrectos.";
  }
});
