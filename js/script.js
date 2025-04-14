// Validate Login Function
function validateLogin() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (username === "amit111" && password === "amit111") {
        document.getElementById("loginPage").style.display = "none"; // Hide login page
        document.getElementById("mainContent").style.display = "block"; // Show main bookstore content
        return false; // Prevent form submission
    } else {
        alert("Invalid username or password!");
        return false;
    }
}

const books = [
    { filename: "download1", name: "Introduction to Computer Science", author: "Parry Donham", price: 200, bookId: 2301, stock: 50 },
    { filename: "download2", name: "IndoBangla | Handbook of Computer Science & IT", author: "Arihant Experts", price: 220, bookId: 2302, stock: 60 },
    { filename: "download3", name: "The History of Bangladesh", author: "Md.Mominul Haque", price: 250, bookId: 2303, stock: 70 },
    { filename: "download4", name: "আমার বাংলা বই,৫ম শ্রেণি", author: "NCTB", price: 180, bookId: 2304, stock: 40 },
    { filename: "download5", name: "আমার বাংলা বই,৩য় শ্রেণি", author: "Author 5", price: 300, bookId: 2305, stock: 30 },
    { filename: "download6", name: "Textbook Computer Science With Python", author: "V K Pandey", price: 150, bookId: 2306, stock: 80 },
    { filename: "download7", name: "HSC English", author: "Saifur Rahman Khan", price: 275, bookId: 2307, stock: 45 },
    { filename: "download8", name: "আজ আমি কোথায় যাবো", author: "হুমায়ূন আহমেদ", price: 350, bookId: 2308, stock: 100 },
    { filename: "download9", name: "Book 9", author: "Author 9", price: 400, bookId: 2309, stock: 55 },
    { filename: "download10", name: "Book 10", author: "Author 10", price: 450, bookId: 2310, stock: 60 },
    { filename: "download11", name: "Book 11", author: "Author 11", price: 500, bookId: 2311, stock: 90 },
    { filename: "download12", name: "Book 12", author: "Author 12", price: 600, bookId: 2312, stock: 30 },
    { filename: "download13", name: "Book 13", author: "Author 13", price: 700, bookId: 2313, stock: 25 },
    { filename: "download14", name: "Book 14", author: "Author 14", price: 800, bookId: 2314, stock: 15 },
    { filename: "download16", name: "Book 16", author: "Author 16", price: 350, bookId: 2316, stock: 20 },
    { filename: "download17", name: "Book 17", author: "Author 17", price: 400, bookId: 2317, stock: 30 },
    { filename: "download18", name: "Book 18", author: "Author 18", price: 450, bookId: 2318, stock: 25 },
    { filename: "download19", name: "Book 19", author: "Author 19", price: 500, bookId: 2319, stock: 10 },
    { filename: "download20", name: "Book 20", author: "Author 20", price: 550, bookId: 2320, stock: 80 },
    { filename: "download21", name: "Book 21", author: "Author 21", price: 600, bookId: 2321, stock: 90 },
    { filename: "download22", name: "Book 22", author: "Author 22", price: 650, bookId: 2322, stock: 60 },
    { filename: "download23", name: "Book 23", author: "Author 23", price: 700, bookId: 2323, stock: 50 },
    { filename: "download24", name: "Book 24", author: "Author 24", price: 750, bookId: 2324, stock: 40 },
    { filename: "download25", name: "Book 25", author: "Author 25", price: 800, bookId: 2325, stock: 30 },
    { filename: "download26", name: "Book 26", author: "Author 26", price: 850, bookId: 2326, stock: 20 },
    { filename: "download27", name: "Book 27", author: "Author 27", price: 900, bookId: 2327, stock: 10 },
    { filename: "download28", name: "Book 28", author: "Author 28", price: 1000, bookId: 2328, stock: 60 },
    { filename: "download29", name: "Book 29", author: "Author 29", price: 1100, bookId: 2329, stock: 20 },
    { filename: "download30", name: "Book 30", author: "Author 30", price: 1200, bookId: 2330, stock: 5 },
];

let cart = [];

function addToCart(bookId, quantity) {
    const book = books.find(book => book.bookId === bookId);
    const cartItem = cart.find(item => item.bookId === bookId);

    if (cartItem) {
        cartItem.quantity += quantity;
    } else {
        cart.push({ ...book, quantity });
    }

    updateCart();
}

function updateCart() {
    const cartCount = cart.reduce((acc, item) => acc + item.quantity, 0);
    const cartTotal = cart.reduce((acc, item) => acc + item.price * item.quantity, 0);
    document.getElementById("cartCount").textContent = cartCount;
    document.getElementById("cartTotal").textContent = cartTotal;
}

function displayBooks() {
    const bookListDiv = document.getElementById("bookList");

    books.forEach(book => {
        const bookDiv = document.createElement("div");
        bookDiv.className = "book";

        bookDiv.innerHTML = `
            <img src="images/${book.filename}.jpg" alt="${book.name}">
            <h3>${book.name}</h3>
            <p>Author: ${book.author}</p>
            <p>Price: ৳${book.price}</p>
            <input type="number" id="quantity-${book.bookId}" value="1" min="1" max="${book.stock}">
            <button onclick="addToCart(${book.bookId}, document.getElementById('quantity-${book.bookId}').value)">Add to Cart</button>
            <p class="availability-message">Stock Available: ${book.stock}</p>
        `;
        bookListDiv.appendChild(bookDiv);
    });
}

window.onload = function() {
    displayBooks();
};