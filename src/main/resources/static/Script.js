//opgave 1
function oppgave1() {
    const url = "/src/main/resources/static/index.html/?strengInn=" + $("#måneder").val();
    $.get(url, function (maaneden) {
        $("#temperatur").html(maaneden);
    })
}

//oppgave 2

function visArray(){
    const kurs= {
        navn: $("#valutaNavn").val(),
        kurs: $("#kurs").val(),
    };
    $.get("/src/main/resources/static/index.html/utVal", function (data){
        $("#visVal").html(data);
    })
}

function oppgave2() {
    const url="/src/main/resources/static/index2.html/?=" + $("#Uvaluta")
    const kurs= {
        navn: $("#valutaNavn").val(),
        kurs: $("#kurs").val(),
    };
}