#Author: Arulpragasam
Feature: One and two dimensional data Table with and wih out header.
Scenario: This is the testing of mult dimensional table
Given This is one dimension without Header.
|Course|Java|Arul|
When Its one dimensional with header. 
|Name|
|Shalini|

And This Two dimensional with Header. 
|Name |Company Name|
|Arul|CellarStone|

Then Two dimensional without Header. 
|Shalini|Arul|
|Arul|Shalini|

And Data Table is over. 