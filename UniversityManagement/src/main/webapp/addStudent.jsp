<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Student - University Management</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
</head>

<body>
<div class="container">
    <div class="header">
        <h1>📝 Add New Student</h1>
        <p>Enter student information to register in the system</p>
    </div>

    <div class="nav">
        <a href="index.jsp">🏠 Home</a>
        <a href="viewStudents">👥 View Students</a>
    </div>

    <div class="form-container">
        <form action="addStudent" method="post">
            <div class="form-section">
                <h3>Student Information</h3>
                <div class="form-row">
                    <div class="form-group">
                        <label for="name">Full Name *</label>
                        <input type="text" id="name" name="name" required placeholder="Enter student's full name"/>
                    </div>
                    <div class="form-group">
                        <label for="age">Age *</label>
                        <input type="number" id="age" name="age" required min="16" max="100" placeholder="Enter age"/>
                    </div>
                </div>
            </div>

            <div class="form-section">
                <h3>Address Information</h3>
                <div class="form-row">
                    <div class="form-group">
                        <label for="city">City *</label>
                        <input type="text" id="city" name="city" required placeholder="Enter city name"/>
                    </div>
                    <div class="form-group">
                        <label for="state">State *</label>
                        <input type="text" id="state" name="state" required placeholder="Enter state name"/>
                    </div>
                </div>
                <div class="form-row">
                    <div class="form-group">
                        <label for="pincode">Pincode *</label>
                        <input type="text" id="pincode" name="pincode" required placeholder="Enter pincode" pattern="[0-9]{6}" maxlength="6"/>
                    </div>
                </div>
            </div>

            <div class="button-container">
                <button type="submit" class="btn btn-primary">
                    <span class="icon">✅</span> Add Student
                </button>
                <a href="index.jsp" class="btn btn-secondary">
                    <span class="icon">❌</span> Cancel
                </a>
            </div>
        </form>
    </div>
</div>
</body>
</html>