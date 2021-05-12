<html>
<body>
<h2>Hello World!</h2>
</body>
<h2><span style="color:red;">${message}</span></h2>
<form action="order.do" method="post">
<pre>
Order From <input type="text" name="orderFrom"/>


Phone Number <input type="text" name="phoneNo"/>


Card Type <select name="cardType">
<option>Marriage</option>
<option>Birthday</option>
<option>House Warming</option>
<option>Thithi Card</option>
<option>Pooja</option>
</select>


No Of Copies<input type="text" name="noOfCopies"/>


Content <textarea rows="5" cols="30" name="content"></textarea>
<input  type="submit" value="Order"/>
</pre>
</form>
<a href="orderSearch.do">Open Search </a>

</html>
