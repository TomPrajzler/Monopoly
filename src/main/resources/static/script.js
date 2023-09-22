const roll = document.getElementById("roll");
const dice1 = document.getElementById("dice1");
const dice2 = document.getElementById("dice2");
const position0 = document.getElementById("0")
const position1 = document.getElementById("1")
const position2 = document.getElementById("2")
const position3 = document.getElementById("3")
const position4 = document.getElementById("4")
const position5 = document.getElementById("5")
const position6 = document.getElementById("6")
const position7 = document.getElementById("7")
const position8 = document.getElementById("8")
const position9 = document.getElementById("9")
const position10 = document.getElementById("10")
const position11 = document.getElementById("11")
const position12 = document.getElementById("12")
const position13 = document.getElementById("13")
const position14 = document.getElementById("14")
const position15 = document.getElementById("15")
const position16 = document.getElementById("16")
const position17 = document.getElementById("17")
const position18 = document.getElementById("18")
const position19 = document.getElementById("19")
const position20 = document.getElementById("20")
const position21 = document.getElementById("21")
const position22 = document.getElementById("22")
const position23 = document.getElementById("23")
const position24 = document.getElementById("24")
const position25 = document.getElementById("25")
const position26 = document.getElementById("26")
const position27 = document.getElementById("27")
const position28 = document.getElementById("28")
const position29 = document.getElementById("29")
const position30 = document.getElementById("30")
const position31 = document.getElementById("31")
const position32 = document.getElementById("32")
const position33 = document.getElementById("33")
const position34 = document.getElementById("34")
const position35 = document.getElementById("35")
const position36 = document.getElementById("36")
const position37 = document.getElementById("37")
const position38 = document.getElementById("38")
const position39 = document.getElementById("39")
const position66 = document.getElementById("66")
const redPlayer = document.getElementById("red-player");
const bluePlayer = document.getElementById("blue-player");
const yellowPlayer = document.getElementById("yellow-player");
const greenPlayer = document.getElementById("green-player");
let playerRed = {
   position : 0,
    element : redPlayer
}
let playerBlue = {
    position : 0,
    element: bluePlayer
}
let playerYellow = {
    position : 0,
    element : yellowPlayer
}
let playerGreen = {
    position : 0,
    element : greenPlayer
}
let playerOnTurn = playerRed;

roll.addEventListener("click", () => {
    fetch("/game/roll")
        .then(response => response.json())
        .then(data => {
            dice1.src = `dice${data.first}.png`;
            dice2.src = `dice${data.second}.png`;
            const sum = data.first + data.second;
            if(playerOnTurn.position + sum < 40){
                playerOnTurn.position += sum;
            }else{
                playerOnTurn.position = playerOnTurn.position + sum -40;
            }
            playerOnTurn.element.remove();
            let positionElement = document.getElementById(playerOnTurn.position.toString());
            positionElement.append(playerOnTurn.element);
            if(playerOnTurn === playerRed){
                playerOnTurn = playerBlue;
            } else if(playerOnTurn === playerBlue){
                playerOnTurn = playerYellow;
            } else if(playerOnTurn === playerYellow){
                playerOnTurn = playerGreen;
            }else if(playerOnTurn === playerGreen){
                playerOnTurn = playerRed;
            }
        })
        .catch(error => {
            console.error("Error fetching data:", error);
        });
});