<%double num1 = Double.parseDouble(request.getParameter("num1"));
double num2 = Double.parseDouble(request.getParameter("num2"));
String op = request.getParameter("operation");
double result = 0;
if(op.equals("add"))
{
    result = num1 + num2;
}
else if(op.equals("sub"))
{
    result = num1 - num2;
}
else if(op.equals("mul"))
{
    result = num1 * num2;
}
else if(op.equals("div"))
{
    result = num1 / num2;
}
request.setAttribute("result", result);
RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
rd.forward(request, response);%>