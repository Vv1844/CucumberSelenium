Feature: Searching product in our carry mart application

#Making these as a paremeterized feature file
@shop
Scenario Outline: Searching product name
Given User is on the home page
When User searches a product with short name "<Name>" and extracted the text
Then User type the same name in deal page and check with same short name "<Name>"
And Compare both offer and home page showing same texts or not

Examples:
|Name		|
|tom		|
|Beet		|