// Ice Growth Calculator

float iceGrowth =0;
float totalIce = 0;

while(true)
{
float highTemp = PopUpIO.getFloat("Please enter the high temp for the day.");
float lowTemp = PopUpIO.getFloat("Please enter the low temperature.");
float averageTemp = (highTemp + lowTemp)/2;

if(lowTemp>highTemp)
{ 
  println("Invalid response");
  break;
}

else
println("The average temperature for that day is: "+ averageTemp + " degrees");
  
if(averageTemp > 32)
{
println("No fricken ice today, damn it!");
}
 
if (averageTemp <=30 && averageTemp > 25)
{
 iceGrowth = 0.4; 
}
else if (averageTemp <=25 && averageTemp > 20)
{
  iceGrowth = 0.7;
}
else if (averageTemp <=20 && averageTemp > 10)
{
  iceGrowth = 2.1;
}
else if (averageTemp <=10 && averageTemp > 0)
{
 iceGrowth = 3;
}

else if (averageTemp <=0 && averageTemp > -20)
{
 iceGrowth = 4;
}

if(averageTemp < -20)
println("You'll have ice");

if (iceGrowth >=0)
totalIce += iceGrowth;

println("The ice for today is: " + iceGrowth);
println("The whole ice should be: " + String.format("%.2f",totalIce) + " inches thick");

if(highTemp == 200)
break;
}