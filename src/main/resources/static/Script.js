function oppgave1(){
const url="/?innmnd" + $("#måneder").val();
$.get(url, function (maaneden){
    $("#temperatur").html(maaneden);
})
}