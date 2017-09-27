package com.ao.pizzeria

import org.scalatra._

class pizzeria_home extends PizzeriaStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
}

object HomeTemplate {

 	def page(title:String, content:Seq[Node], url: String => String = identity _, head: Seq[Node] = Nil, scripts: Seq[String] = Seq.empty, defaultScripts: Seq[String] = Seq.empty = {
		<!DOCTYPE html>
		<!-- Website template by freewebsitetemplates.com -->
		<head>
			<title>title</title>
			<meta charset="utf-8">
			<link href="css/style.css" rel="stylesheet" type="text/css">
		</head>
		<body>
			<div id="header">
				<div>
					<a href={url("/index.html")}><img class="logo" src="images/logo.png" width="513" height="84" alt="" title=""></a>
					<a href={url("/index.html")}><img  src="images/waitress.png" width="332" height="205" alt="" title=""></a>
					<ul class="navigation">
						<li>
							<a class="active" href={url("/index.html")}>Home</a>
						</li>
						<li>
							<a href={url("about.html")}>About</a>
						</li>
						<li>
							<a href={url("burger.html")}>Menu</a>
						</li>
						<li>
							<a href={url("contact.html")}>Contact</a>
						</li>
						<li>
							<a href={url("blog.html")}>Blog</a>
						</li>
					</ul>
				</div>
			</div>
			<div id="body">
				<div class="featured"> <a href={url("burger.html")}><img src="images/burger-specials.png" width="960" height="590" alt=""></a>
					<h2>Welcome to Retro Diner!</h2>
					<p>
						This website template has been designed by 
					</p>
					<ul>
						<li>
							<a href={url("hotdog.html")}><img src="images/hotdogs.jpg" width="284" height="214" alt=""></a>
						</li>
						<li>
							<a href={url("shake.html")}><img src="images/shakes.jpg" alt="" width="284" height="214"></a>
						</li>
						<li>
							<a href={url("breakfast.html")}><img src="images/breakfast.jpg" alt="" width="284" height="214"></a>
						</li>
					</ul>
				</div>
			</div>
			<div id="footer">
				<div>
					<ul>
						<li class="first">
							<h2>Delivery Hotline</h2>
							<h3>Call 0-123-456-789</h3>
							<ul>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/facebook" class="facebook"></a>
								</li>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/twitter" class="twitter"></a>
								</li>
								<li>
									<a href="http://www.freewebsitetemplates.com/go/googleplus" class="googleplus"></a>
								</li>
							</ul>
						</li>
						<li>
							<a href={url("index.html")}><img class="logo" src="images/logo-footer.png" alt=""></a>
							<ul class="navigation">
								<li>
									<a href={url("/index.html")}>Home</a>
								</li>
								<li>
									<a href={url("about.html")}>About Us</a>
								</li>
								<li>
									<a href={url("menu.html")}>Menu</a>
								</li>
								<li>
									<a href={url("contact.html")}>Contact Us</a>
								</li>
							</ul>
							<span>&copy; 2023 RetroDiner.com. All Rights Reserved</span>
						</li>
						<li class="last">
							<h2>Follow Us By Email</h2>
							<form action={url("/index.html")}>
								<input type="text" name="subscribe" value="Enter Your Email Here...">
								<input type="submit" value="">
							</form>
						</li>
					</ul>
				</div>
			</div>
		</body>
		</html>
	}
}

object Template {

 	def page(title:String, content:Seq[Node], url: String => String = identity _, head: Seq[Node] = Nil, scripts: Seq[String] = Seq.empty, defaultScripts: Seq[String] = Seq.empty = {
	}
}

//Need Template

/* Site Map:
	1) Home Page:
		- Contains popular offers.
	2) Menu:
		- Veg and Non-Veg pizzas. (From Smokin' Joe's website *sorry*)
		- Pricing and addons.
		- Adding any Pizza to cart magically makes Cart button active.
	3) Cart:
		- Payments made through here.. 
		- Once one reaches here, a session is made! Session only cancelled by payout or cancel.
		- Shows which branch will provide pizza order.
		- Pay option leads to bogus page saying "Let's say you Payed. Your hypothetical order will be ready in 30 minutes."
		- Allows addition and removal of pizzas.
	4) Branches:
		- Shows all branches. (No MAPS!!!)
		- Addresses and Contact number.. (Take true things, bogusify)
	5) Contact Us:
		- Put credits of you.
*/