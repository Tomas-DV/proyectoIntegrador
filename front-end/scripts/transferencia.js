document.getElementById("transferForm").addEventListener("submit", function (e) {
  e.preventDefault();

  const correo = document.getElementById("correo").value;
  const monto = document.getElementById("monto").value;

  alert(`Transferencia de $${monto} enviada a ${correo}`);
  // Aquí podrías hacer un fetch POST al backend en producción
});
