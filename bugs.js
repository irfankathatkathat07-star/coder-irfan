# coder-irfan
js program
const express = require("express");
const mysql = require("mysql2");
const app = express();

app.use(express.json());

const db = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "bugtracker"
});

app.post("/bugs", (req, res) => {
  const { project_id, title, description, severity, assignee_id } = req.body;
  db.query(
    "INSERT INTO bugs (project_id, title, description, severity, status, assignee_id) VALUES (?,?,?,?,?,?)",
    [project_id, title, description, severity, "open", assignee_id],
    (err, result) => {
      if (err) throw err;
      res.json({ message: "Bug submitted successfully!" });
    }
  );
});

app.get("/bugs", (req, res) => {
  db.query("SELECT * FROM bugs", (err, results) => {
    if (err) throw err;
    res.json(results);
  });
});

app.listen(3000, () => console.log("Server running on port 3000"));
