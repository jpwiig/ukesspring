function oppgave1(){
const url="/?strengInn=" + $("#måneder").val();
$.get(url, function (maaneden){
    $("#temperatur").html(maaneden);
})
}