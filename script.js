const menuToggle = document.getElementById("menuToggle");
const navLinks = document.getElementById("navLinks");

menuToggle.addEventListener("click", () => {
  const open = navLinks.classList.toggle("open");
  menuToggle.setAttribute("aria-expanded", String(open));
});

navLinks.querySelectorAll("a").forEach((link) => {
  link.addEventListener("click", () => {
    navLinks.classList.remove("open");
    menuToggle.setAttribute("aria-expanded", "false");
  });
});

document.getElementById("copyCode").addEventListener("click", async () => {
  const code = document.getElementById("javaSource").innerText;
  const button = document.getElementById("copyCode");
  try {
    await navigator.clipboard.writeText(code);
    button.textContent = "Copied!";
  } catch {
    button.textContent = "Select code to copy";
  }
});
