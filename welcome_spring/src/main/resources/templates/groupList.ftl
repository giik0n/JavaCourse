<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cafedras List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<a href="/">Home</a>
<div>
<form method="post">
    <input type="text" value="" name="search">
    <input type="submit" value="Go" onclick="">
</form>
    <table class="table table-striped table-dark">
        <tr>
            <th>Name</th>
            <th>Description </th>
            <th>Cafedra</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.name}</td>
                <td>${item.desc}</td>
                <td>${item.cafedra.name}</td>
                <td><a href="http://localhost:8080/web/group/update/${item.id}">
                        <input type="button" value="update" class="btn-primary">
                    </a>
                </td><td><a href="http://localhost:8080/web/group/delete/${item.id}">
                        <input type="button" value="delete" class="btn-danger">
                    </a> </td>
            </tr>
        </#list>
    </table>
    <div>
        <a href="/web/group/create">
        <input type="button" value="Create Group From" style="
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
