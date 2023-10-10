Feature:online shopping 
@Regression 
Scenario Outline:buy the ladies clothes
Given go the shop website 
When buy the saree "<name>"
Then process <price>and pay the bill
Examples:
|id |name|bill|
|101|ladies|30000|

