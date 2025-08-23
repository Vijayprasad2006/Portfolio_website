const API_URL = "http://localhost:8080/api/auth";

document.getElementById("loginBtn").addEventListener("click", async () => {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const response = await fetch(`${API_URL}/login`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ email, password })
    });

    if (response.ok) {
        alert("✅ Login successful!");
        window.location.href = "http://localhost:8080";
    } else {
        alert("❌ Invalid email or password");
    }
});

document.getElementById("registerBtn").addEventListener("click", async () => {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    const response = await fetch(`${API_URL}/register`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ email, password })
    });

    if (response.ok) {
        alert("✅ Registered successfully! Please login.");
    } else {
        alert("❌ Registration failed (maybe user already exists)");
    }
});
