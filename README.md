Online Shopping Application
---------------------------------------------------
This application will allow customers to purchase items from an online shopping environment

Description
---------------------------------------------------

The purpose of this application is to provide functionality for online shopping, providing a catalog of items and a checkout to the customer, and the ability to manage a store's inventory for the employees. Features such as item search, browsing by item type, ordering as a guest, returning an order, and canceling an order should be available. Additional features will be added such as allowing ordering of products from a vendor and processing customer returns as an employee, marking an inventory request as completed by a vendor, or resetting account passwords as an administrator.

This will be delivered as a web application using Java as the primary language. Inventory will be stored in either a SQL database or a JSON file on the server side. Logins will be available for customers, employees, vendors, and administrators through the same website.

Stakeholders and their Interests
----------------------------------------------------
System Administrator
 - Can change passwords for both employees and customers
 - Able to add an item or remove an item from the store's catalog

Shop Customers
 - Want an easy-to-use interface without much technical knowledge
 - Able to create an account to keep track of orders placed and status
 - Need to be able to contact a store worker to handle issues with order

Employees (Customer Service)
 - Want environment to feel easy-to-use and access even without extensive trainings 
 - Easy to modify orders, remove items from orders or cancel whole orders, and process returns
 - Ability to check internal stock information, order more product from vendors 
 
Employees (Remote workers)
 - Our employees want a platform that is easy to use and allows them to manage orders and inventory efficiently. They also want to be able to access customer information and order history.

Vendors
 - Need to be able to log into system to review requests for inventory
 - Need to be able to mark an inventory order as complete, allow changes to sent inventory as needed

Personas
----------------------------------------------------
Jeremy - Employee (Customer Service/Returns), written by Robin

Jeremy is a customer service employee whose job is to process order-related issues such as returns or missing items. Jeremy is familiar with working a computer and using a search engine to look up results within the store's system. Jeremy is a newer hire, so he is not as familiar with other aspects of customer service as he is still in training. 

Jeson - Employee (Tech-Savvy Student), written by Shukri 

Jason is newer hire a college student who is comfortable using technology and likes to shop online for fashion and electronics. He values a seamless mobile shopping experience, and is likely to be influenced by peer recommendations and social media. He appreciates a platform that offers fast and reliable shipping, and is willing to wait for a better deal. He is also interested in eco-friendly and sustainable products, and may look for certifications or ratings before making a purchase.He likes the store and is eager to get started.

Jesse - Customer, written by Diana

Jesse is an anime figure collector. He is very comfortable with computers and has been scouring the internet for the past few months trying to get his hands on all the previous figures he's missed out on. Now that his collection has caught up, he has been using the online shopping application to keep up with the new releases as they come out.

User Stories
----------------------------------------------------
User Story #1 (Jeremy, employee ), written by Robin 

As an employee, I want to be able to search a customer via email address & phone number so I can pull up order information for customers who do not have an order number on hand. 

Jeremy handles customer service and looks into issues occuring with an order. Sometimes, when a customer messages about a missing order or is requesting to cancel an order, they do not have the receipt or order information on hand. Jeremy would want some sort of method to look up an order via information that the customer would have entered during the checkout process.  

User Story #2 (Sarah, customer), written by Shukri 

Sarah was checking out, she realized that she had made a mistake in her order. She was worried that she would have to start all over again, but Jeson reassured her that they could fix the problem quickly. They updated her order on the spot, and made sure that everything was just right. Sarah was so grateful for the employees' help, and left the store with a smile on her face.

User Story #3 (Andy, customer), written by Shukri

Andy was planning a surprise birthday party for her friend and needed to purchase several items for the celebration. Andy was nervous about shopping online, but the store's friendly and knowledgeable employees put her at ease. They helped her find the perfect products, and even made suggestions for other items that would complement her selections.

User Story #4 (Francis, vendor), written by Robin

Francis is an employee at one of the vendors that does business with the store. Due to harsh weather, some of the trucks for the wholesaler were delayed, causing this vendor to not have any DVD's of a new movie release to send to the store. While fufilling the order, Francis changes the amount of DVD's sent on this truck to zero, and the invoice sent to the store is adjusted to accomodate the missing stock. 

User Story #5 (Jesse, customer), written by Diana

Jesse just saw on Twitter that his favorite anime was getting a new figure made and would be set to release in half a year. He checks his usual online store to check if they have preorders available and sees that they do. He preorders the item with minimal effort as he has previously used the site and it has his information stored. He completes the transaction confident that he will receive his order when it is set to release.

User Story #6 (Jesse, customer), written by Diana

Jesse had previously preordered a figure from the website and has been eagerly awaiting its arrival. He repeatedly checks his order information to see if there are any updates to his order and is hoping to see that they have shipped it. He gets an email a few days before the item is set to release saying that the order has shipped. A week passes and the tracking information on his order hasn't been updated since it shipped. He calls customer service, and they tell him that it might have gotten lost and to fill out a lost in transit form on the website if he doesn't receive the item in a few days. A few days later he accepts that he won't receive his order and fills out the lost in transit form asking for a refund.

Use Case Diagrams
----------------------------------------------------
![image](https://user-images.githubusercontent.com/122573491/218215009-23736350-ae6c-43a6-87c1-3655d8f8766b.png) Created by Shukri


Requirements
----------------------------------------------------
Functional
 1. Customers must be able to add items to a cart, change quantity of items, and remove an item from the cart
 2. Customers must have the ability to check out without creating an account (e.g. guest checkout)
 3. Employees must be able to look up a customer's order via order number and customer information. 
 4. Employees must have the ability to place an order for items from a vendor
 5. The system administrator must have the ability to add or remove an item from the store
 6. A search function for customers to easily find specific products.
 7. Vendors must have the ability to view inventory orders, change quantities, and mark orders as shipped. 
 8. The inventory must properly adjust upon successful order completions, item must reflect out-of-stock status when inventory is zero
 
Non-Functional
 1. Employees must have a different login than a normal customer, will have different experience than customer.
 2.	Compatibility with a wide range of devices and browsers.
 3. Fast and responsive site performance, even during peak traffic times.

Non-Requirements:
 1.	Physical store locations
 2. In-person customer support
 3. Cash-based payment options

Diagrams
----------------------------------------------------
Relational Database Diagram, designed by Robin:

This diagram shows an overview of the setup of the SQL database used for placing orders and updating inventory and how different tables are linked to one another.
![image](https://user-images.githubusercontent.com/21182688/221299451-566a5254-1a29-4a4f-aea8-08c89856a3f0.png)

Relational Database Diagram, designed by Shukri:

This sequence diagram shows the steps involved when a customer logs in and retrieves their account information. The application communicates with the database
to retrieve both item information and user information, and then display them to the customer.

![image](https://user-images.githubusercontent.com/122573491/221323611-2cd3d291-faa6-4165-bc87-12e9fac8fb51.png)


