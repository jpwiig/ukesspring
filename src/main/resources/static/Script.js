//opgave 1
function oppgave1() {
    const url = "/src/main/resources/static/index.html/?strengInn=" + $("#måneder").val();
    $.get(url, function (maaneden) {
        $("#temperatur").html(maaneden);
    })
}

//oppgave 2

function visArray(){
    const valuta= {
        navn: $("#valutaNavn").val(),
        kurs: $("#kurs").val(),
    };
    $.get("/utVal", valuta, function (data){
        $("#visVal").html(data);
    })
}


function oppgave2() {

    const valuta= {
        navn: $("#valutaNavn").val(),
        kurs: $("#kurs").val(),
    };
    $.get("/StringSum",valuta,function (data){
        $("#iNok").html(data);
    })

}
