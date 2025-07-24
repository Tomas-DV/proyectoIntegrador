function transferir() {
  fetch("http://localhost:8000/transferir", {
    method: "POST"
  })
  .then(response => response.text())
  .then(data => {
    alert(data);
  })
  .catch(error => {
    console.error("Error:", error);
    alert("No se pudo completar la transferencia de dinero.");
  });
}

function ingresar() {
  fetch("http://localhost:8000/ingresar", {
    method: "POST"
  })
  .then(response => response.text())
  .then(data => {
    alert(data);
  })
  .catch(error => {
    console.error("Error:", error);
    alert("No se pudo completar el ingreso de dinero.");
  });
}

function verMovimientos() {
  fetch("http://localhost:8000/consultar", {
    method: "POST"
  })
  .then(response => response.text())
  .then(data => {
    alert(data);
  })
  .catch(error => {
    console.error("Error:", error);
    alert("No se pudo realizar la consulta de dinero.");
  });
}
