<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Student" %>
<%
    Student s = (Student)request.getAttribute("student");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Student - University Management</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>
<div class="container">
    <div class="header">
        <h1>✏️ Edit Student</h1>
        <p>Update student information in the system</p>
    </div>

    <div class="student-info">
        <span>Editing Student</span>
        <span class="student-id">ID: #<%= s.getId() %></span>
    </div>

    <div class="nav">
        <a href="index.jsp">🏠 Home</a>
        <a href="viewStudents">👥 View Students</a>
        <a href="addStudent.jsp">➕ Add New Student</a>
    </div>

    <div class="form-container">
        <form action="updateStudent" method="post">
            <input type="hidden" name="id" value="<%=s.getId()%>"/>

            <div class="form-section">
                <h3>Student Information</h3>
                <div class="form-row">
                    <div class="form-group">
                        <label for="name">Full Name *</label>
                        <input type="text" id="name" name="name" required value="<%= s.getName() %>" placeholder="Enter student's full name"/>
                    </div>
                    <div class="form-group">
                        <label for="age">Age *</label>
                        <input type="number" id="age" name="age" required min="16" max="100" value="<%= s.getAge() %>" placeholder="Enter age"/>
                    </div>
                </div>
            </div>

            <div class="form-section">
                <h3>Address Information</h3>
                <div class="form-row">
                    <div class="form-group">
                        <label for="city">City *</label>
                        <input type="text" id="city" name="city" required value="<%= s.getAddress()!=null ? s.getAddress().getCity() : "" %>" placeholder="Enter city name"/>
                    </div>
                    <div class="form-group">
                        <label for="state">State *</label>
                        <input type="text" id="state" name="state" required value="<%= s.getAddress()!=null ? s.getAddress().getState() : "" %>" placeholder="Enter state name"/>
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group">
                        <label for="pincode">Pincode *</label>
                        <input type="text" id="pincode" name="pincode" required value="<%= s.getAddress()!=null ? s.getAddress().getPincode() : "" %>" placeholder="Enter pincode" pattern="[0-9]{6}" maxlength="6"/>
                    </div>
                </div>
            </div>

            <div class="button-container">
                <button type="submit" class="btn btn-primary">
                    <span class="icon">💾</span> Update Student
                </button>
                <a href="viewStudents" class="btn btn-secondary">
                    <span class="icon">❌</span> Cancel
                </a>
                <a href="deleteStudent?id=<%=s.getId()%>" class="btn btn-danger"
                   onclick="return confirm('Are you sure you want to delete this student? This action cannot be undone.')">
                    <span class="icon">🗑️</span> Delete Student
                </a>
            </div>
        </form>
    </div>
</div>
</body>
</html>