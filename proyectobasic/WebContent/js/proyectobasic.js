function anadeRegistro(){
	
	
	
	
	location.href='formulariocliente.html';
	
	

	
	alert('Será redireccionado a un formulario para añadir el registro');
	
	
	
}
function actualizaRegistro(){
	
	//
	alert('Registro actualizado');
}
function eliminaRegistro(idFila){
	
	if (!confirm("Seguro que quieres eliminar?")){
		return;
	}
	
 	var fila =document.getElementById(idFila);
	fila.parentNode.removeChild(fila);

	console.log("Fila eliminada")
	
	
	
	
	
	
}
function init(){
	console.log("init")
}

function ocultarMostrar(){

	if (document.fcontacto.Conocido[1].checked == true) {
	
	document.getElementById('desdeotro').style.display='block';
	
	} else {
	
	document.getElementById('desdeotro').style.display='none';
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







