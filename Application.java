package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) 
	{
		
		System.err.println("---------Welcome To Pizza Factory---------");
		PizzaFactory p=new PizzaFactory();
		for(;;)
		{
			System.out.println("1.Order Pizza   2.Order Sides     3.Confirm Order(Make Bill)      4.Exit");
			int z=p.sc.nextInt();
			if(z==1) {
				System.out.println("-----------------------");
				System.out.println("Choose Pizza Category");
				System.out.println("1.Veg Pizza  2.Non-veg Pizza");
			switch(p.sc.nextInt())
			{
			case 1:{
		        p.VegPizza();
		        System.out.println("");
		        System.out.println("");
		        System.out.println("");
		        System.out.println("");
                int name=0;		        
		        System.out.println("Pizza Name                Pizza Size         ");
		        System.out.println("------------------     ----------------      ");
		        for(int i=0;i<p.p1.size();i++) 
		        {
		        	int pi=(int)p.p1.get(i);
		        	int si=(int)p.s1.get(i);
		        	if(pi==1&&si==150)
		    		{
		    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
		    		}
		    		else if(pi==1&&si==200) 
		    		{
		    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
		    		}
		    		else if(pi==1&&si==325) 
		    		{
		    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
		    		}
		    		else if(pi==2&&si==175)
		    		{
		    		System.out.println("Cheese&Corn           Regular(Rs.175)");
		    		}
		    		else if(pi==2&&si==375) 
		    		{
		    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
		    		}
		    		else if(pi==2&&si==475) 
		    		{
		    		System.out.println("Cheese&Corn           Large(Rs.475)");	
		    		}
		    		else if(pi==3&&si==160)
		    		{
		    		System.out.println("Panner Tikka           Regular(Rs.160)");
		    		}
		    		else if(pi==3&&si==290) 
		    		{
		    		System.out.println("Panner Tikka           Medium(Rs.290)");	
		    		}
		    		else if(pi==3&&si==340) 
		    		{
		    		System.out.println("Panner Tikka           Large(Rs.340)");	
		    		}
		    		else if(pi==4&&si==190)
		    		{
		    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
		    		}
		    		else if(pi==4&&si==325) 
		    		{
		    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
		    		}
		    		else if(pi==4&&si==425) 
		    		{
		    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
		    		}
		    		else if(pi==5&&si==210)
		    		{
		    		System.out.println("Chicken Tikka         Regular(Rs.210)");
		    		}
		    		else if(pi==5&&si==370) 
		    		{
		    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
		    		}
		    		else if(pi==5&&si==500) 
		    		{
		    		System.out.println("Chicken Tikka          Large(Rs.500)");	
		    		}
		    		else if(pi==6&&si==220)
		    		{
		    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
		    		}
		    		else if(pi==6&&si==380) 
		    		{
		    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
		    		}
		    		else if(pi==6&&si==525) 
		    		{
		    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
		    		}
		        }
		        
		        System.out.println("");
		        System.out.println("");
		        System.out.println("Toppings");
		        System.out.println("------------");
		        for(int j=0;j<p.l.size();j++)
		        {
		        	int t=(int)p.l.get(j);
		        if(t==20) 
		        {
		        	System.out.println("Black Olive(Rs.20)");
		        }
		        else if(t==25) 
		        {
		        	System.out.println("Capsicum(Rs.25)");
		        }
		        else if(t==35) 
		        {
		        	System.out.println("Paneer(Rs.35)");
		        }
		        else if(t==30) 
		        {
		        	System.out.println("Mushroom(Rs.30)");
		        }
		        else if(t==10) 
		        {
		        	System.out.println("Fresh Tomato(Rs.10)");
		        }
		        else {
		        	System.out.println("No Topping is Added");
		        }
		        }
		        
		        System.out.println("");
		        System.out.println("Crust Type");
		        System.out.println("-------------");
		        for(int i=0;i<p.Crust.size();i++)
		        {
		        	int ct=(int)p.Crust.get(i);
		        	
			        if(ct==1) {
			        System.out.println("New Hand Tossed");
		        }
			        if(ct==2) {
				        System.out.println("Wheat Thin Crust");
			        }
			        if(ct==3) {
				        System.out.println("Cheese Burst");
			        }
			        if(ct==4) {
				        System.out.println("Fresh Pan Pizza");
			        }
		        
		        }
		        
		        System.out.println("");
				System.out.println("");
	
			 }break;
			case 2:{
				p.NonVeg();
				System.out.println("");
				System.out.println("");
				System.out.println("Pizza Name                Pizza Size         ");
		        System.out.println("------------------     ----------------      ");
		        for(int i=0;i<p.p1.size();i++) 
		        {
		        	int pi=(int)p.p1.get(i);
		        	int si=(int)p.s1.get(i);
		        	if(pi==1&&si==150)
		    		{
		    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
		    		}
		    		else if(pi==1&&si==200) 
		    		{
		    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
		    		}
		    		else if(pi==1&&si==325) 
		    		{
		    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
		    		}
		    		else if(pi==2&&si==175)
		    		{
		    		System.out.println("Cheese&Corn           Regular(Rs.175)");
		    		}
		    		else if(pi==2&&si==375) 
		    		{
		    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
		    		}
		    		else if(pi==2&&si==475) 
		    		{
		    		System.out.println("Cheese&Corn           Large(Rs.475)");	
		    		}
		    		else if(pi==3&&si==160)
		    		{
		    		System.out.println("Panner Tikka           Regular(Rs.160)");
		    		}
		    		else if(pi==3&&si==290) 
		    		{
		    		System.out.println("Panner Tikka           Medium(Rs.290)");	
		    		}
		    		else if(pi==3&&si==340) 
		    		{
		    		System.out.println("Panner Tikka           Large(Rs.340)");	
		    		}
		    		else if(pi==4&&si==190)
		    		{
		    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
		    		}
		    		else if(pi==4&&si==325) 
		    		{
		    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
		    		}
		    		else if(pi==4&&si==425) 
		    		{
		    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
		    		}
		    		else if(pi==5&&si==210)
		    		{
		    		System.out.println("Chicken Tikka         Regular(Rs.210)");
		    		}
		    		else if(pi==5&&si==370) 
		    		{
		    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
		    		}
		    		else if(pi==5&&si==500) 
		    		{
		    		System.out.println("Chicken Tikka          Large(Rs.500)");	
		    		}
		    		else if(pi==6&&si==220)
		    		{
		    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
		    		}
		    		else if(pi==6&&si==380) 
		    		{
		    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
		    		}
		    		else if(pi==6&&si==525) 
		    		{
		    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
		    		}
		        }
		        
		        System.out.println("");
		        System.out.println("");
		        System.out.println("Toppings");
		        System.out.println("------------");
		        for(int j=0;j<p.l.size();j++)
		        {
		        	int t=(int)p.l.get(j);
		        if(t==20) 
		        {
		        	System.out.println("Black Olive(Rs.20)");
		        }
		        else if(t==25) 
		        {
		        	System.out.println("Capsicum(Rs.25)");
		        }
		        else if(t==35) 
		        {
		        	System.out.println("Chicken Tikka(Rs.35");
		        }
		        else if(t==30) 
		        {
		        	System.out.println("Mushroom(Rs.30)");
		        }
		        else if(t==10) 
		        {
		        	System.out.println("Fresh Tomato(Rs.10)");
		        }
		        else if(t==45) 
		        {
		        	System.out.println("Barbeque Chicken(Rs.45)");
		        }
		        else if(t==40) 
		        {
		        	System.out.println("Grilled Chicken(Rs.40)");
		        }
		        else {
		        	System.out.println("No Topping is Added");
		        }
		        }
		        
		        System.out.println("");
		        System.out.println("Crust Type");
		        System.out.println("-------------");
		        for(int i=0;i<p.Crust.size();i++)
		        {
		        	int ct=(int)p.Crust.get(i);
		        	
			        if(ct==1) {
			        System.out.println("New Hand Tossed");
		            }
			        if(ct==2) {
				        System.out.println("Wheat Thin Crust");
			        }
			        if(ct==3) {
				        System.out.println("Cheese Burst");
			        }
			        if(ct==4) {
				        System.out.println("Fresh Pan Pizza");
			        }
		        }
				
				
				
		         
		        System.out.println("");
				System.out.println("");
				
			}break;
			case 3:System.out.println("Please Enter Correct Number");
			
			}

		 }else if(z==2){
			 if(p.p1.size()>0) {
			 p.Side();
			 System.out.println("");
			 System.out.println("");
			 int name=0;		        
		        System.out.println("Pizza Name                Pizza Size         ");
		        System.out.println("------------------     ----------------      ");
		        for(int i=0;i<p.p1.size();i++) 
		        {
		        	int pi=(int)p.p1.get(i);
		        	int si=(int)p.s1.get(i);
		        	if(pi==1&&si==150)
		    		{
		    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
		    		}
		    		else if(pi==1&&si==200) 
		    		{
		    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
		    		}
		    		else if(pi==1&&si==325) 
		    		{
		    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
		    		}
		    		else if(pi==2&&si==175)
		    		{
		    		System.out.println("Cheese&Corn           Regular(Rs.175)");
		    		}
		    		else if(pi==2&&si==375) 
		    		{
		    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
		    		}
		    		else if(pi==2&&si==475) 
		    		{
		    		System.out.println("Cheese&Corn           Large(Rs.475)");	
		    		}
		    		else if(pi==3&&si==160)
		    		{
		    		System.out.println("Panner Tikka           Regular(Rs.160)");
		    		}
		    		else if(pi==3&&si==290) 
		    		{
		    		System.out.println("Panner Tikka           Medium(Rs.290)");	
		    		}
		    		else if(pi==3&&si==340) 
		    		{
		    		System.out.println("Panner Tikka           Large(Rs.340)");	
		    		}
		    		else if(pi==4&&si==190)
		    		{
		    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
		    		}
		    		else if(pi==4&&si==325) 
		    		{
		    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
		    		}
		    		else if(pi==4&&si==425) 
		    		{
		    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
		    		}
		    		else if(pi==5&&si==210)
		    		{
		    		System.out.println("Chicken Tikka         Regular(Rs.210)");
		    		}
		    		else if(pi==5&&si==370) 
		    		{
		    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
		    		}
		    		else if(pi==5&&si==500) 
		    		{
		    		System.out.println("Chicken Tikka          Large(Rs.500)");	
		    		}
		    		else if(pi==6&&si==220)
		    		{
		    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
		    		}
		    		else if(pi==6&&si==380) 
		    		{
		    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
		    		}
		    		else if(pi==6&&si==525) 
		    		{
		    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
		    		}
		        }
		        
		        System.out.println("");
		        System.out.println("");
		        System.out.println("Toppings");
		        System.out.println("------------");
		        for(int j=0;j<p.l.size();j++)
		        {
		        	int t=(int)p.l.get(j);
		        if(t==20) 
		        {
		        	System.out.println("Black Olive(Rs.20)");
		        }
		        else if(t==25) 
		        {
		        	System.out.println("Capsicum(Rs.25)");
		        }
		        else if(t==35) 
		        {
		        	System.out.println("Chicken Tikka(Rs.35)");
		        }
		        else if(t==30) 
		        {
		        	System.out.println("Mushroom(Rs.30)");
		        }
		        else if(t==10) 
		        {
		        	System.out.println("Fresh Tomato(Rs.10)");
		        }
		        else if(t==45) 
		        {
		        	System.out.println("Barbeque Chicken(Rs.45)");
		        }
		        else if(t==40) 
		        {
		        	System.out.println("Grilled Chicken(Rs.40)");
		        }
		        else {
		        	System.out.println("No Topping is Added");
		        }
		        }
		        
		        System.out.println("");
		        System.out.println("Crust Type");
		        System.out.println("-------------");
		        for(int i=0;i<p.Crust.size();i++)
		        {
		        	int ct=(int)p.Crust.get(i);
		        	
			        if(ct==1) {
			        System.out.println("New Hand Tossed");
		        }
			        if(ct==2) {
				        System.out.println("Wheat Thin Crust");
			        }
			        if(ct==3) {
				        System.out.println("Cheese Burst");
			        }
			        if(ct==4) {
				        System.out.println("Fresh Pan Pizza");
			        }
		        
		        }
		        
		        System.out.println("");
		        System.out.println("Sides Type");
		        System.out.println("---------------");
		        for(int  i=0;i<p.Sides.size();i++)
		        {
		        	int sd=(int)p.Sides.get(i);
		        	if(sd==55)
		        	{
		        		System.out.println("Cold Drink(Rs.55)");
		        	}
		        	else if(sd==90)
		        	{
		        		System.out.println("Mousse Cake(Rs.90)");
		        	}
		        	else
		        	{
		        		System.out.println("No Sides Is  Orderd");
		        	}
		        }
		        
		        System.out.println("");
				System.out.println("");
		 }else {
			 System.err.println("First Order The Pizza");
		 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 else if(z==3){	
			 	 if(p.p1.size()>0) {
				 System.out.println("");
				 System.out.println("");
				 int name=0;		        
			        System.out.println("Pizza Name                Pizza Size                                                               Total");
			        System.out.println("------------------     ----------------                                                    ---------------------");
			        for(int i=0;i<p.p1.size();i++) 
			        {
			        	int pi=(int)p.p1.get(i);
			        	int si=(int)p.s1.get(i);
			        	if(pi==1&&si==150)
			    		{
			    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
			    		}
			    		else if(pi==1&&si==200) 
			    		{
			    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
			    		}
			    		else if(pi==1&&si==325) 
			    		{
			    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
			    		}
			    		else if(pi==2&&si==175)
			    		{
			    		System.out.println("Cheese&Corn           Regular(Rs.175)");
			    		}
			    		else if(pi==2&&si==375) 
			    		{
			    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
			    		}
			    		else if(pi==2&&si==475) 
			    		{
			    		System.out.println("Cheese&Corn           Large(Rs.475)");	
			    		}
			    		else if(pi==3&&si==160)
			    		{
			    		System.out.println("Panner Tikka           Regular(Rs.160)");
			    		}
			    		else if(pi==3&&si==290) 
			    		{
			    		System.out.println("Panner Tikka           Medium(Rs.290)");	
			    		}
			    		else if(pi==3&&si==340) 
			    		{
			    		System.out.println("Panner Tikka           Large(Rs.340)");	
			    		}
			    		else if(pi==4&&si==190)
			    		{
			    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
			    		}
			    		else if(pi==4&&si==325) 
			    		{
			    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
			    		}
			    		else if(pi==4&&si==425) 
			    		{
			    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
			    		}
			    		else if(pi==5&&si==210)
			    		{
			    		System.out.println("Chicken Tikka         Regular(Rs.210)");
			    		}
			    		else if(pi==5&&si==370) 
			    		{
			    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
			    		}
			    		else if(pi==5&&si==500) 
			    		{
			    		System.out.println("Chicken Tikka          Large(Rs.500)");	
			    		}
			    		else if(pi==6&&si==220)
			    		{
			    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
			    		}
			    		else if(pi==6&&si==380) 
			    		{
			    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
			    		}
			    		else if(pi==6&&si==525) 
			    		{
			    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
			    		}
			        }
			        int PizzaPrice=0;
			        for(int i=0;i<p.s1.size();i++)
			        {
			        	int g=(int)p.s1.get(i);
			        	PizzaPrice=PizzaPrice+g;
			        }
			        System.out.println("                                                                                           Pizza Total Rs."+PizzaPrice);
			        
			        System.out.println("");
			        System.out.println("");
			        System.out.println("Toppings");
			        System.out.println("------------");
			        for(int j=0;j<p.l.size();j++)
			        {
			        	int t=(int)p.l.get(j);
			        if(t==20) 
			        {
			        	System.out.println("Black Olive(Rs.20)");
			        }
			        else if(t==25) 
			        {
			        	System.out.println("Capsicum(Rs.25)");
			        }
			        else if(t==35) 
			        {
			        	System.out.println("Chicken Tikka(Rs.35)");
			        }
			        else if(t==30) 
			        {
			        	System.out.println("Mushroom(Rs.30)");
			        }
			        else if(t==10) 
			        {
			        	System.out.println("Fresh Tomato(Rs.10)");
			        }
			        else if(t==45) 
			        {
			        	System.out.println("Barbeque Chicken(Rs.45)");
			        }
			        else if(t==40) 
			        {
			        	System.out.println("Grilled Chicken(Rs.40)");
			        }
			        else if(p.l1.size()==0){
			        	System.out.println("No Topping is Added");
			        }
			        }
			        int ToppingsPrice=0;
			        for(int i=0;i<p.l1.size();i++)
			        {
			        	int g=(int)p.l1.get(i);
			        	ToppingsPrice=ToppingsPrice+g;
			        }
			        if(ToppingsPrice==0)
			        	System.out.println("No Extra Toppings Are Added                                                                Extra Toppings Rs."+ToppingsPrice);
			        else
			            System.out.println("                                                                                           Extra Toppings Rs."+ToppingsPrice);
			        
			        System.out.println("");
			        System.out.println("Crust Type");
			        System.out.println("-------------");
			        for(int i=0;i<p.Crust.size();i++)
			        {
			        	int ct=(int)p.Crust.get(i);
			        	
				        if(ct==1) {
				        System.out.println("New Hand Tossed");
			        }
				        if(ct==2) {
					        System.out.println("Wheat Thin Crust");
				        }
				        if(ct==3) {
					        System.out.println("Cheese Burst");
				        }
				        if(ct==4) {
					        System.out.println("Fresh Pan Pizza");
				        }
			        
			        }
			        
			        System.out.println("");
			        System.out.println("Sides Type");
			        System.out.println("---------------");
			        for(int  i=0;i<p.Sides.size();i++)
			        {
			        	int sd=(int)p.Sides.get(i);
			        	if(sd==55)
			        	{
			        		System.out.println("Cold Drink(Rs.55)");
			        	}
			        	else if(sd==90)
			        	{
			        		System.out.println("Mousse Cake(Rs.90)");
			        	}
			        	else if(p.Sides.size()==0)
			        	{
			        		System.out.println("No Sides Is  Orderd");
			        	}
			        }
			        int SidePrice=0;
			        for(int i=0;i<p.Sides.size();i++)
			        {
			        	int g=(int)p.Sides.get(i);
			        	SidePrice=SidePrice+g;
			        }
			        if(SidePrice==0)
			        	System.out.println("No Extra Sides Are Added                                                                  Extra Sides Rs."+SidePrice);
			        else
			            System.out.println("                                                                                           Extra Sides Rs."+SidePrice);
			        System.out.println("");
			        System.out.println("");
			        int ExtraCheese=0;
			        for(int i=0;i<p.Sides.size();i++)
			        {
			        	int g=(int)p.Sides.get(i);
			        	ExtraCheese=ExtraCheese+g;
			        }
			        if(ExtraCheese==0)
			        	System.out.println("No Extra Cheese Added                                                                  Extra Cheese Rs."+ExtraCheese);
			        else
			            System.out.println("                                                                                       Extra Cheese Rs."+ExtraCheese);
			        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			        int Tp=PizzaPrice+ToppingsPrice+SidePrice+ExtraCheese;
			        System.out.println("                                                                                            Total Bill : "+Tp);
			  
			        System.out.println("");
					System.out.println("");
					System.exit(0);
			 }else {
				 System.out.println("First Order The Pizza");
			 }
			 
			 
			 
			 
			 
			 
			 
		 }else if(z==4) {
			 System.exit(0);
		 }else {
			 System.out.println("Enter Correct Number");
		 }
	    }
	}
	
	
	
	
	public static void Bill()
	{
	 
	}
	
	
	
	
	public static void Back()
	{
		PizzaFactory p=new PizzaFactory();
		System.out.println("-----------------------");
		System.out.println("Choose Pizza Category");
		System.out.println("1.Veg Pizza  2.Non-veg Pizza   ");
	switch(p.sc.nextInt())
	{
	case 1:{
        p.VegPizza();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int name=0;		        
        System.out.println("Pizza Name                Pizza Size         ");
        System.out.println("------------------     ----------------      ");
        for(int i=0;i<p.p1.size();i++) 
        {
        	int pi=(int)p.p1.get(i);
        	int si=(int)p.s1.get(i);
        	if(pi==1&&si==150)
    		{
    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
    		}
    		else if(pi==1&&si==200) 
    		{
    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
    		}
    		else if(pi==1&&si==325) 
    		{
    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
    		}
    		else if(pi==2&&si==175)
    		{
    		System.out.println("Cheese&Corn           Regular(Rs.175)");
    		}
    		else if(pi==2&&si==375) 
    		{
    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
    		}
    		else if(pi==2&&si==475) 
    		{
    		System.out.println("Cheese&Corn           Large(Rs.475)");	
    		}
    		else if(pi==3&&si==160)
    		{
    		System.out.println("Panner Tikka           Regular(Rs.160)");
    		}
    		else if(pi==3&&si==290) 
    		{
    		System.out.println("Panner Tikka           Medium(Rs.290)");	
    		}
    		else if(pi==3&&si==340) 
    		{
    		System.out.println("Panner Tikka           Large(Rs.340)");	
    		}
    		else if(pi==4&&si==190)
    		{
    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
    		}
    		else if(pi==4&&si==325) 
    		{
    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
    		}
    		else if(pi==4&&si==425) 
    		{
    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
    		}
    		else if(pi==5&&si==210)
    		{
    		System.out.println("Chicken Tikka         Regular(Rs.210)");
    		}
    		else if(pi==5&&si==370) 
    		{
    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
    		}
    		else if(pi==5&&si==500) 
    		{
    		System.out.println("Chicken Tikka          Large(Rs.500)");	
    		}
    		else if(pi==6&&si==220)
    		{
    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
    		}
    		else if(pi==6&&si==380) 
    		{
    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
    		}
    		else if(pi==6&&si==525) 
    		{
    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
    		}
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Toppings");
        System.out.println("------------");
        for(int j=0;j<p.l.size();j++)
        {
        	int t=(int)p.l.get(j);
        if(t==20) 
        {
        	System.out.println("Black Olive(Rs.20)");
        }
        else if(t==25) 
        {
        	System.out.println("Capsicum(Rs.25)");
        }
        else if(t==35) 
        {
        	System.out.println("Paneer(Rs.35)");
        }
        else if(t==30) 
        {
        	System.out.println("Mushroom(Rs.30)");
        }
        else if(t==10) 
        {
        	System.out.println("Fresh Tomato(Rs.10)");
        }
        }
        
        System.out.println("");
        System.out.println("Crust Type");
        System.out.println("-------------");
        for(int i=0;i<p.Crust.size();i++)
        {
        	int ct=(int)p.Crust.get(i);
        	
	        if(ct==1) {
	        System.out.println("New Hand Tossed");
        }
	        if(ct==2) {
		        System.out.println("Wheat Thin Crust");
	        }
	        if(ct==3) {
		        System.out.println("Cheese Burst");
	        }
	        if(ct==4) {
		        System.out.println("Fresh Pan Pizza");
	        }
        
        }
        System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	 }break;
	case 2:{
		p.NonVeg();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Pizza Name                Pizza Size         ");
        System.out.println("------------------     ----------------      ");
        for(int i=0;i<p.p1.size();i++) 
        {
        	int pi=(int)p.p1.get(i);
        	int si=(int)p.s1.get(i);
        	if(pi==1&&si==150)
    		{
    		System.out.println("Deluxe Veggie         Regular(Rs.150)");
    		}
    		else if(pi==1&&si==200) 
    		{
    		System.out.println("Deluxe Veggie         Medium(Rs.150)");	
    		}
    		else if(pi==1&&si==325) 
    		{
    		System.out.println("Deluxe Veggie         Large(Rs.150)");	
    		}
    		else if(pi==2&&si==175)
    		{
    		System.out.println("Cheese&Corn           Regular(Rs.175)");
    		}
    		else if(pi==2&&si==375) 
    		{
    		System.out.println("Cheese&Corn           Medium(Rs.375)");	
    		}
    		else if(pi==2&&si==475) 
    		{
    		System.out.println("Cheese&Corn           Large(Rs.475)");	
    		}
    		else if(pi==3&&si==160)
    		{
    		System.out.println("Panner Tikka           Regular(Rs.160)");
    		}
    		else if(pi==3&&si==290) 
    		{
    		System.out.println("Panner Tikka           Medium(Rs.290)");	
    		}
    		else if(pi==3&&si==340) 
    		{
    		System.out.println("Panner Tikka           Large(Rs.340)");	
    		}
    		else if(pi==4&&si==190)
    		{
    		System.out.println("Non-veg Supreme       Regular(Rs.190)");
    		}
    		else if(pi==4&&si==325) 
    		{
    		System.out.println("Non-veg Supreme       Medium(Rs.325)");	
    		}
    		else if(pi==4&&si==425) 
    		{
    		System.out.println("Non-veg Supreme       Large(Rs.425)");	
    		}
    		else if(pi==5&&si==210)
    		{
    		System.out.println("Chicken Tikka         Regular(Rs.210)");
    		}
    		else if(pi==5&&si==370) 
    		{
    		System.out.println("Chicken Tikka           Medium(Rs.370)");	
    		}
    		else if(pi==5&&si==500) 
    		{
    		System.out.println("Chicken Tikka          Large(Rs.500)");	
    		}
    		else if(pi==6&&si==220)
    		{
    		System.out.println("Pepper B.Chicken      Regular(Rs.220)");
    		}
    		else if(pi==6&&si==380) 
    		{
    		System.out.println("Pepper B.Chicken       Medium(Rs.380)");	
    		}
    		else if(pi==6&&si==525) 
    		{
    		System.out.println("Pepper B.Chicken        Large(Rs.525)");	
    		}
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Toppings");
        System.out.println("------------");
        for(int j=0;j<p.l.size();j++)
        {
        	int t=(int)p.l.get(j);
        if(t==20) 
        {
        	System.out.println("Black Olive(Rs.20)");
        }
        else if(t==25) 
        {
        	System.out.println("Capsicum(Rs.25)");
        }
        else if(t==35) 
        {
        	System.out.println("Chicken Tikka(Rs.35");
        }
        else if(t==30) 
        {
        	System.out.println("Mushroom(Rs.30)");
        }
        else if(t==10) 
        {
        	System.out.println("Fresh Tomato(Rs.10)");
        }
        else if(t==45) 
        {
        	System.out.println("Barbeque Chicken(Rs.45)");
        }
        else if(t==40) 
        {
        	System.out.println("Grilled Chicken(Rs.40)");
        }
        }
        
        System.out.println("");
        System.out.println("Crust Type");
        System.out.println("-------------");
        for(int i=0;i<p.Crust.size();i++)
        {
        	int ct=(int)p.Crust.get(i);
        	
	        if(ct==1) {
	        System.out.println("New Hand Tossed");
            }
	        if(ct==2) {
		        System.out.println("Wheat Thin Crust");
	        }
	        if(ct==3) {
		        System.out.println("Cheese Burst");
	        }
	        if(ct==4) {
		        System.out.println("Fresh Pan Pizza");
	        }
        }
		
		
		
        System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}break;
	default:System.out.println("Please Enter Correct Number");
	}
} 
    
}
