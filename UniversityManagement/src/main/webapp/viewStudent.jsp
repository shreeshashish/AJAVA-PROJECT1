<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,model.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Students - University Management</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>
<div class="container">
    <div class="header">
        <h1>👥 All Students</h1>
        <p>View and manage student records</p>
    </div>

    <div class="nav">
        <div class="nav-links">
            <a href="index.jsp">🏠 Home</a>
            <a href="addStudent.jsp">➕ Add Student</a>
        </div>
        <div class="stats">
<span class="stat-badge">
Total Students: <%= ((List<Student>)request.getAttribute("students")).size() %>
</span>
        </div>
    </div>

    <div class="table-container">
        <%
            List<Student> list = (List<Student>)request.getAttribute("students");

            if (list != null && !list.isEmpty()) {
        %>

        <table class="students-table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>City</th>
                <th>Actions</th>
            </tr>
            </thead>
            <tbody>
            <%
                for(Student s : list) {
            %>
            <tr>
                <td class="student-id">#<%= s.getId() %></td>
                <td class="student-name"><%= s.getName() %></td>
                <td><span class="student-age"><%= s.getAge() %> years</span></td>
                <td class="student-city">
                    <span class="city-icon"></span>
                    <%= s.getAddress() != null ? s.getAddress().getCity() : "N/A" %>
                </td>
                <td>
                    <div class="action-buttons">
                        <a href="editStudent?id=<%=s.getId()%>" class="btn btn-edit">
                            ✏️ Edit
                        </a>
                        <a href="deleteStudent?id=<%=s.getId()%>" class="btn btn-delete"
                           onclick="return confirm('Are you sure you want to delete this student?')">
                            🗑️ Delete
                        </a>
                    </div>
                </td>
            </tr>
            <%
                }
            %>
            </tbody>
        </table>

        <%
        } else {
        %>

        <div class="empty-state">
            <h3>📚 No Students Found</h3>
            <p>There are no students registered in the system yet.</p>
            <a href="addStudent.jsp" class="btn btn-add">
                ➕ Add First Student
            </a>
        </div>

        <%
            }
        %>
    </div>
</div>
</body>
</html>