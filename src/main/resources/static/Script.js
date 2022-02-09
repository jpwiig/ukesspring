//opgave 1
function oppgave1(){
const url="/src/main/resources/static/index.html/?strengInn=" + $("#måneder").val();
$.get(url, function (maaneden){
    $("#temperatur").html(maaneden);
})
}
//oppgave 2
function oppgave2(){
const USD={
    navn:dollar,
    kurs: 8.80,
};
    const EUR={
        navn:Euro,
        kurs: 10.06,
    };
}