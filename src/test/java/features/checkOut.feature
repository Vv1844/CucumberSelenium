Feature: User 	Adding items in cart
@cart
Scenario Outline: User selecting an item and adding them in cart
Given User is on the home page
When User searches a product with short name "<Name>" and extracted the text
And Added 3 times to cart and User proceeds to cart item
Then Validating that user have option to entry promo code and place order
And validating that "<Name>" in the cart are same that we ordered

Examples:
|	Name	|
|	Tom		|
|	Beet	|