# coder-irfan
js program
document.getElementById("bugForm").addEventListener("submit", function(e) {
  e.preventDefault();
  const title = e.target.title.value;
  const severity = e.target.severity.value;
  const description = e.target.description.value;

  const bug = { title, severity, description, status: "open" };

  // Display bug in list (demo purpose)
  const bugList = document.getElementById("bugList");
  const div = document.createElement("div");
  div.innerHTML = `<strong>${bug.title}</strong> [${bug.severity}] - ${bug.status}<br>${bug.description}`;
  bugList.appendChild(div);

  // TODO: Send bug to backend via fetch()
});
