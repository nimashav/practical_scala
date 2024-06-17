def AreaOfDisk(r:Double)=math.Pi*math.pow(r,2)

def Fahrenheit(x:Double)=x*1.8+32

def VolumeOfSphere(r:Double):Double=(4.0/3.0)*math.Pi*math.pow(r,3)

def BookPrice(n:Int):Double=n*24.95
 def Discount(n:Double)=n*0.4*24.95
 def price(n:Int):Double=BookPrice(n)-Discount(n)
 def shippingCost(n:Int):Double={
    if(n<50){
      3 } 
     else{
      0.75*(n-50) + 3}}
 def total(n:Int):Double=price(n)+shippingCost(n) 

 def EasyPace(d:Double)=8*d
 def Tempo(l:Double)=7*l
 def Totaltime(d:Double,l:Double)=2*EasyPace(d)+Tempo(l)

 



