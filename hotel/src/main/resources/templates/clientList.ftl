<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <script src="https://use.fontawesome.com/7158ac61f7.js"></script>

</head>
<body>
<div>
    <table class="table table-striped table-dark">
        <tr>
            <th>Name</th>
            <th>Surname </th>
            <th>Patronymic</th>
            <th>Passport</th>
            <th>Comment</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.surname}</td>
                <td>${item.patronymic}</td>
                <td>${item.passport}</td>
                <td>${item.comment}</td>
               <!-- <td><a href="http://localhost:8080/web/client/get/${item.id}">
                        <input type="button" value="info" class="btn btn-primary" onclick=alert("IHateWeb")>
                    </a> </td>
                <td><a href="http://localhost:8080/web/client/update/${item.id}">
                        <input type="button" value="update" class="btn-primary">
                    </a> </td>-->
                <td><a href="http://localhost:8080/web/client/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a></td>
            </tr>
        </#list>
    </table>
    <div>
        <a href="/web/client/create">
            <input type="button" value="Create Client From" style="
                        background-color: aquamarine;
                        border-color: aqua;
                        border-radius: 30px;
                        border-width: 10px;
                ">
        </a>
    </div>
</div>
</body>

</html>
