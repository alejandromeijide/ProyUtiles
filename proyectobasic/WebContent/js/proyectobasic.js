

function anadeRegistro(){
	
	
	
	
	location.href='formulariocliente.html';
	
	

	
	alert('Será redireccionado a un formulario para añadir el registro');
	
	
	
}
function actualizaRegistro(){
	
	//
	alert('Registro actualizado');
}
function eliminaRegistro(idFila){
console.log("pruebapost");
	if (!confirm("Seguro que quieres eliminar?")){
		return;
	}
	
	  $.ajax({
            type: "POST",
            url: "/eliminar-cliente/{codigo}",
          //  data: dataString,
            success: function(response) {			
               // $('.alert-success').empty();
                //$('.alert-success').append(response).fadeIn("slow");
                $('#'+parent).fadeOut("slow");
            }
        });
	
	
	
// 	var fila =document.getElementById(idFila);
//	fila.parentNode.removeChild(fila);

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







