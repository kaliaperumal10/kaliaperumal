<style type="text/css">
body{
color: white;
text-align: center;
}
.sub{
 background-color: green;
 color: white;
}
</style>
<body >
<form action="/con/log" method="get">
<input type="hidden" name="name" value="${names}">
<input type="hidden" name="pass" value="${passs}">
<input class="sub" type="submit" value="Logout">
</form>
</body>