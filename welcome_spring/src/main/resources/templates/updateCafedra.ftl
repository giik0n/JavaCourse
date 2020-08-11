<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Cafedra</title>
    <link rel="stylesheet"
          type="text/css" href="<@spring.url '/css/style.css'/>"/>
</head>
<body>

<div>
    <fieldset>
        <legend>Update cafedra</legend>
        <form name="cafedra" action="" method="POST">
            Name:<@spring.formInput "cafedraForm.name" "" "text"/>
            <br>
            Description:<@spring.formInput "cafedraForm.desc" "" "text"/>
            <br>
            Chief:<@spring.formInput "cafedraForm.chief" "" "text"/>
            <br>
            <input type="submit" value="Update"/>
        </form>
    </fieldset>
</div>

</body>
</html>