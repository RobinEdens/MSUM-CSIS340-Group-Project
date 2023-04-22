const socket = io(); // create a WebSocket connection to the server

const form = document.getElementById("chat-form");
const inputMessage = document.getElementById("input-message");
const messages = document.getElementById("messages");

form.addEventListener("submit", (event) => {
    event.preventDefault(); // prevent the form from submitting via HTTP request

    const message = inputMessage.value.trim();
    if (message) {
        socket.emit("chat-message", message); // send the message to the server via the WebSocket connection
        inputMessage.value = "";
    }
});

socket.on("chat-message", (message) => {
    const li = document.createElement("li");
    li.textContent = message;
    messages.appendChild(li);
});
