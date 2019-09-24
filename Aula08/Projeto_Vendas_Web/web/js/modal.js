var modal = document.getElementById("modalCadastroCliente");
var btn = document.getElementById("btnNovoCliente");
var saida = document.getElementsByClassName("close")[0];

btn.onclick = function(){
    modal.style.display = "block";
    
};

saida.onclick = function(){
    modal.style.display = "none";
};


window.onclick = function(event){
    if(event.target === modal){
        this.modal.style.display = "none";
    }   
};