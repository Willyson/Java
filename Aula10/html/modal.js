var modal = document.getElementById("modalCadastroUsuario");
var btn = document.getElementById("btnNovoUsuario");
var saida = document.getElementsByClassName("close")[0];

btn.onclick = function(){
    modal.style.display = "block";
}

saida.onclick = function(){
    modal.style.display = "none";
}


window.onclick = function(event){
    if(event.target == modal){
        this.modal.style.display = "none";
    }
}