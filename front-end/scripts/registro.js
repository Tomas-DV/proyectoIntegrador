document.getElementById("registroForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const nombre = document.getElementById("nombre").value.trim();
  const email = document.getElementById("email").value.trim();
  const telefono = document.getElementById("telefono").value.trim();
  const password = document.getElementById("password").value.trim();
  const confirmPassword = document.getElementById("confirmPassword").value.trim();
  const fechaNacimiento = document.getElementById("fechaNacimiento").value;
  const terminos = document.getElementById("terminos").checked;
  const error = document.getElementById("error");

  if (!nombre || !email || !telefono || !password || !confirmPassword || !fechaNacimiento || !terminos) {
    error.textContent = "Por favor completa todos los campos correctamente.";
    return;
  }

  if (password !== confirmPassword) {
    error.textContent = "Las contraseñas no coinciden.";
    return;
  }

  // Simulación de registro exitoso (reemplazar por API en producción)
  alert("¡Registro exitoso! Ahora puedes iniciar sesión.");
  window.location.href = "login.html";
});
