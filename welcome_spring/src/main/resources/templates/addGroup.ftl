<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Group</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Add cafedra</legend>
        <form name="group" action="" method="POST">
            Name:<@spring.formInput "groupForm.name" "" "text"/>
            <br>
            Description:<@spring.formInput "groupForm.desc" "" "text"/>
            <br>
            Group:<@spring.formSingleSelect "groupForm.cafedra", movs, ""/>
            <br>
            <input type="submit" value="Create"/>
        </form>
    </fieldset>
</div>

</body>
</html>
