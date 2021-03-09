
function anadeRegistro(id) {
	console.log('anadeRegistro>' + id);
	alert('Será redireccionado a un formulario para añadir el registro.');

	if (id != null) {
		location.href = 'editar-cliente?id=' + id; //-> editar 
	} else {
		location.href = 'crear-cliente';
	}
}

function mostrarProductos(id) {
	$.get("productos/" + id)
		.done(function(data) {
			console.log("Data Loaded: " + data);
			$('#tablaProductos').html(data);
		});
}


function eliminaRegistro(idFila) {
	console.log("eliminaRegistro-" + idFila);
	if (!confirm("¿Seguro que quieres eliminar en post?-88-")) {
		return;
	}

	$.post("eliminar-cliente/" + idFila)
		.done(function(data) {
			console.log("Data Loaded: " + data);

			if (data == 'OK') {
				var fila = document.getElementById("fila" + idFila);
				fila.parentNode.removeChild(fila);
				console.log("Fila eliminada");
			}
			else{
				alert( "No se pudo eliminar el cliente. Asegurese de que no tiene productos" );				
			}
		})
		.fail(function(data) {
    		alert( "No se pudo eliminar el cliente. Asegurese de que no tiene productos" + data );
  		});
}


function init() {
	console.log("init")
}

function ocultarMostrar() {

	if (document.fcontacto.Conocido[1].checked == true) {

		document.getElementById('desdeotro').style.display = 'block';

	} else {

		document.getElementById('desdeotro').style.display = 'none';
	}
}


function myFunction() {
	console.log("myfunction");
	var x = document.getElementById("div1");
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}