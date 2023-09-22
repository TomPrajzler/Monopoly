const roll = document.getElementById("roll");
const dice1 = document.getElementById("dice1");
const dice2 = document.getElementById("dice2");

roll.addEventListener("click", () => {
    fetch("/game/roll")
        .then(response => response.json())
        .then(data => {
            dice1.src = `dice${data.first}.png`;
            dice2.src = `dice${data.second}.png`;
        })
        .catch(error => {
            console.error("Error fetching data:", error);
        });
});