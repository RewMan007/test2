<%-- 
    Document   : index
    Created on : Oct 14, 2023, 2:22:19 PM
    Author     : ratchaphum
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Products"%>
<%@page import="controller.ProductTable"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
        body {
            background-color: #333;
            color: #fff;
        }
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: #111;
            color: #fff;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        h1 {
            text-align: center;
        }
        .center-button {
            text-align: center;
        }
        .orange-button {
            background-color: orange;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 10px 0;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>DVD Catalog!</h1>
     <form name="AddToCart" action="AddToShoppingCart" method="POST">
    <table>
        <thead>
            <tr>
                <th>name</th>
                <th>rate</th>
                <th>year</th>
                <th>price</th>
                <th>q</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<Products> prolist1 = ProductTable.findAllProduct();
            int index = 0; // เริ่มต้นค่า index ที่ 1
            for (Products product : prolist1) {
            %>
            <tr>
                <td><input type="checkbox" name="productCheckbox" value="<%= product.getMovie() %>"><%= product.getMovie() %></td>
                <td><%= product.getRating() %></td>
                <td><%= product.getYearcreate() %></td>
                <td><%= product.getPrice() %></td>
                <td><input type="text" name="QuantityInput<%= index %>" value="" /></td>
            </tr>
            <%
                index++; // เพิ่มค่า index ในแต่ละรอบ
            }
            %>
        </tbody>
    </table>
    <div class="center-button">
        <input type="submit" class="orange-button" value="Add To Cart" />
    </div>
     </form>
</body>
</html>
