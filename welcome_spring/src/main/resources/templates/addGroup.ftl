<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Group</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<style>
    .container {
        height: 200px;
        position: relative;
        border: 3px solid black;
    }

    .center {
        margin: 0;
        position: absolute;
        top: 50%;
        left: 50%;
        -ms-transform: translate(-50%, -50%);
        transform: translate(-50%, -50%);
    }
</style>


<body>
<div class="container">
<div class="center">
    <fieldset style="display: inline-block">
        <legend>Add Group</legend>
        <form name="group" action="" method="POST">
            <table>
                <tr>
            <td>Name</td><td><@spring.formInput "groupForm.name" "" "text"/></td>
                </tr>
            <tr>
            <td>Description</td><td><@spring.formInput "groupForm.desc" "" "text"/></td>
            </tr>
                <tr>
            <td>Group</td><td><@spring.formSingleSelect "groupForm.cafedra", movs, ""/></td>
            </tr>
            </table>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>
</div>
</body>
</html>
