package com.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaFactory 
{
	Application App=new Application();
	List Sides=new ArrayList();
	List l1=new ArrayList();
	List l=new ArrayList();
	List p1=new ArrayList();
	List s1=new ArrayList();
	List t1=new ArrayList();
	List Cheese=new ArrayList();
	List Crust=new ArrayList();
	List to1=new ArrayList();
	List to2=new ArrayList();
	List to3=new ArrayList();
	List to4=new ArrayList();
	List to5=new ArrayList();
	List to6=new ArrayList();
	int price;
	int crust1=0;
	int free=0;
	Scanner sc=new Scanner(System.in);
	public void VegPizza()
	{
		int count=0;
		int Large=0;
		int p=0;
		for(;;) {
		System.out.println("----------Veg Pizza Menu----------");
		System.out.println("");
		System.out.println("Please select  the number for your pizza");
		System.out.println("----------------------------------");
		System.err.println("1.Delux Veggie  2.Cheese & Corn  3.Paneer Tikka   4.Back");
		int c=sc.nextInt();
		p=c;
		if(p==1){
			for(;;) {
			System.out.println("--------Enter Size---------");
			System.out.println("1.Regular(Rs.150)  2.Medium(Rs.200)  3.Large(Rs.325)");
			int s=sc.nextInt();
			if(p==1&&s==1)
			{
				this.price=150;
				break;
			}
			else if(p==1&&s==2)
			{
				this.price=200;
				break;
			}
			else if(p==1&&s==3) 
			{
				this.price=325;
				Large++;
				break;
			}else {
				System.out.println("Enter Correct Number");
			}
			}
			break;
		}
		else if(p==2){
			for(;;) {
			  System.out.println("--------Enter Size---------");
			  System.out.println("1.Regular(Rs.175)  2.Medium(Rs.375)  3.Large(Rs.475)");
			  int s=sc.nextInt();
			  if(p==2&&s==1)
			  {
				  this.price=175;
				  break;
			  }
			  else if(p==2&&s==2)
			  {
				  this.price=375;
				  break;
			  }
			  else if(p==2&&s==3) 
			  {
				  this.price=475;
				  Large++;
				  break;
			  }else {
				  System.out.println("Please Enter Correct Number");
			  }
			  }
			break;
		}
		else if(p==3){
			for(;;) {
			  System.out.println("--------Enter Size---------");
			  System.out.println("1.Regular(Rs.160)  2.Medium(Rs.290)  3.Large(Rs.340)");
			  int s=sc.nextInt();
			  if(p==3&&s==1)
			  {
				  this.price=160;
				  break;
			  }
			  else if(p==3&&s==2)
			  {
				  this.price=290;
				  break;
			  }
			  else if(p==3&&s==3) 
			  {
				  this.price=340;
				  Large++;
				  break;
		      }else {
		    	  System.out.println("Please Enter Correct Number");
		      }
			  break;
			  }
		}
		
		  if(p==4)
			  {
				  App.Back();
				  System.exit(0);;
			  break;
			  }
		  else{
			  System.out.println("Please Enter Correct Number");
		    }
		
		break;
		}
		for(;;) {
		System.out.println("--------------------------------------");
		System.out.println("Add Crust Type");
		System.out.println("");
		System.out.println("1.New Hand Tossed    2.Wheat Thin Crust    3.Cheese Burst     4.Fresh Pan Pizza");
		int crust2=sc.nextInt();
		
		if(crust2==1)
		{
			Crust.add(1);
			break;
		}
		else if(crust2==2)
		{
			Crust.add(2);
			break;
		}
		else if(crust2==3)
		{
			Crust.add(3);
			break;
		}
		else if(crust2==4)
		{
			Crust.add(4);
			break;
		}else {
			System.out.println("Please Correct Number");
		}
		}
		for(;;)
		{
			System.err.println("You Can Add Multiple Toppings");
			System.out.println("1.Add Extra Toppins     2.Extra Cheese   3.Next");
			int t=sc.nextInt();
			if(t==1)
			{
				System.out.println("----------Veg Toppings---------");
				
				System.out.println("1.Black Olive(Rs.20)  2.Capsicum(Rs.25)  3.Paneer(Rs.35)  4.Mushroom(Rs.30)  5.Fresh Tomato(Rs.10)");
				System.out.println("-------------------------");
				switch(sc.nextInt())
				{
				case 1:{
					if(p==1)
					{
						if(to4.contains(20)) {
							System.err.println("Black Olive Already Added...");
						}else {
							to1.add(20);
							to4.add(20);
							l.add(20);
							l1.add(20);
						}
						
					}
					else if(p==2)
					{
						if(to5.contains(20)) {
							System.err.println("Black Olive Already Added...");
						}else {
							to2.add(20);
							to5.add(20);
							l.add(20);
							l1.add(20);
						}
					}
					else if(p==3)
					{
						if(to6.contains(20)) {
							System.err.println("Black Olive Already Added...");
						}else {
							to3.add(20);
							to6.add(20);
							l.add(20);
							l1.add(20);
						}
					}
				 }break;
				case 2:{
					if(p==1)
					{
						if(to4.contains(25)) {
							System.err.println("Capsicum Already Added...");
						}else {
							to1.add(25);
							to4.add(25);
							l.add(25);
							l1.add(25);
						}
					}
					else if(p==2)
					{
						if(to5.contains(25)) {
							System.err.println("Capsicum Already Added...");
						}else {
							to2.add(25);
							to5.add(25);
							l.add(25);
							l1.add(25);
						}
					}
					else if(p==3)
					{
						if(to6.contains(25)) {
							System.err.println("Capsicum Already Added...");
						}else {
							to3.add(25);
							to6.add(25);
							l.add(25);
							l1.add(25);
						}
					}
					
				 }break;
				case 3:{
					if(p==1)
					{
						if(to4.contains(35)) {
							System.err.println("Paneer Already Added...");
						}else {
							to1.add(35);
							to4.add(35);
							l.add(35);
							l1.add(35);
						}
					}
					else if(p==2)
					{
						if(to5.contains(35)) {
							System.err.println("Paneer Already Added...");
						}else {
							to2.add(35);
							to5.add(35);
							l.add(35);
							l1.add(35);
						}
					}
					else if(p==3)
					{
						if(to6.contains(35)) {
							System.err.println("Paneer Already Added...");
						}else {
							to3.add(35);
							to6.add(35);
							l.add(35);
							l1.add(35);
						}
					}
					
				 }break;
				case 4:{
					if(p==1)
					{
						if(to4.contains(30)) {
							System.err.println("Mushroom Already Added...");
						}else {
							to1.add(30);
							to4.add(30);
							l.add(30);
							l1.add(30);
						}
					}
					else if(p==2)
					{
						if(to5.contains(30)) {
							System.err.println("Mushroom Already Added...");
						}else {
							to2.add(30);
							to5.add(30);
							l.add(30);
							l1.add(30);
						}
					}
					else if(p==3)
					{
						if(to6.contains(30)) {
							System.err.println("Mushroom Already Added...");
						}else {
							to3.add(30);
							to6.add(30);
							l.add(30);
							l1.add(30);
						}
					}
					
				 }break;
				case 5:{
					if(p==1)
					{
						if(to4.contains(10)) {
							System.err.println("Fresh Tomato Already Added...");
						}else {
							to1.add(10);
							to4.add(10);
							l.add(10);
							l1.add(30);
						}
					}
					else if(p==2)
					{
						if(to5.contains(10)) {
							System.err.println("Fresh Tomato Already Added...");
						}else {
							to2.add(10);
							to5.add(10);
							l.add(10);
							l1.add(10);
						}
					}
					else if(p==3)
					{
						if(to6.contains(10)) {
							System.err.println("Fresh Tomato Already Added...");
						}else {
							to3.add(10);
							to6.add(10);
							l.add(10);
							l1.add(10);
						}
					}
					
				 }break;
				default : {
					  System.err.println("Please Enter Correct Number");
				    }break;
				}
			}
			else if(t==2) 
			{
				if(count==0) {
				Cheese.add(35);
				count++;
				}else {
					System.err.println("Already Cheese Added....");
				}
			}
			else if(t==3) 
			{
				if(Large==1) {
				if(l.size()>=2)
				{
				int a=0;
				int b=0;
				for(int  i=0;i<l.size();i++)
				{
					b=(int) l.get(i);
					a=a+b;
				}
				for(int i=0;i<2;i++)
				{
					l1.add(free,0);
					l1.remove(free+1);
				}
				p1.add(p);
				s1.add(price);
				t1.add(a);
				to4.clear();
				to5.clear();
				to6.clear();
				break;
				}else {
					System.out.println("You Have Selected Large Pizza You Have To Select Minimum 2 Toppings");
				}
				}else {
					int a=0;
					int b=0;
					for(int  i=0;i<l.size();i++)
					{
						b=(int) l.get(i);
						a=a+b;
					}
					p1.add(p);
					s1.add(price);
					t1.add(a);
					to4.clear();
					to5.clear();
					to6.clear();
					break;
				}
				
			}
			else {
				System.err.println("Please Enter Correct Number");
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	public void NonVeg()
	{
		int Large=0;
		int p=0;
		for(;;) {
		System.out.println("----------Non-Veg Pizza Menu----------");
		System.err.print("Note:- ");
		System.out.println("You Can Chosse Only One Topping For Non-veg Pizza");
		System.err.print("Note:-");
		System.out.print("If You Don't Want To Add Toppings or Cheese You Can Press");
		System.err.println("3.Next");
		System.out.println("Please select  the number for your pizza");
		System.out.println("----------------------------------");
		System.err.println("1.Non-veg Supreme  2.Chicken Tikka  3.Pepper Barbecue Chicken   4.Back");
		int c=sc.nextInt();
		
		
		
		
		if(c==1){
			p=4;
			for(;;) {
			System.out.println("--------Enter Size---------");
			System.out.println("");
			System.out.println("1.Regular(Rs.190)  2.Medium(Rs.325)  3.Large(Rs.425)");
			int s=sc.nextInt();
			if(s==1)
			{
				this.price=190;
				break;
			}
			else if(s==2)
			{
				this.price=325;
				break;
			}
			else if(s==3) 
			{
				this.price=425;
				Large++;
				free=(int)l1.size();
				break;
			}else {
				System.out.println("Enter  Correct Number");
			}
			}
			break;
		}
		else if(c==2){
			p=5;
			for(;;) {
			System.out.println("--------Enter Size---------");
			System.out.println("");
			System.out.println("1.Regular(Rs.210)  2.Medium(Rs.370)  3.Large(Rs.500)");
			int s=sc.nextInt();
			if(s==1)
			{
				this.price=210;
				break;
			}
			else if(s==2)
			{
				this.price=370;
				break;
			}
			else if(s==3) 
			{
				this.price=500;
				Large++;
				free=(int)l1.size();
				break;
			}else {
				System.err.println("Enter Correct Number");
			}
		}
			break;
		}
		else if(c==3){
			p=6;
			for(;;) {
			System.out.println("--------Enter Size---------");
			System.out.println("");
			System.out.println("1.Regular(Rs.220)  2.Medium(Rs.380)  3.Large(Rs.525)");
			int s=sc.nextInt();
			if(s==1)
			{
				this.price=220;
				break;
			}
			else if(s==2)
			{
				this.price=380;
				break;
			}
			else if(s==3) 
			{
				this.price=525;
				Large++;
				free=(int)l1.size();
				break;
			}else {
				System.out.println("Enter Correct Number");
			}
			}
			break;
			}
		else if(c==4){
			App.Back();
			System.exit(0);
			break;
			}
		else{
			  System.err.println("Please Enter Correct Number");
			  
		    }
		}
		
		for(;;) {
		System.out.println("--------------------------------------");
		System.out.println("Add Crust Type");
		System.out.println("");
		System.out.println("1.New Hand Tossed    2.Wheat Thin Crust    3.Cheese Burst     4.Fresh Pan Pizza");
		int crust2=sc.nextInt();
		
		if(crust2==1)
		{
			Crust.add(1);
			break;
		}
		else if(crust2==2)
		{
			Crust.add(2);
			break;
		}
		else if(crust2==3)
		{
			Crust.add(3);
			break;
		}
		else if(crust2==4)
		{
			Crust.add(4);
			break;
		}else {
			System.out.println("Please Enter Correct Number");
		}
	}
		
		
		
		int count=0;
		int count1=0;
		for(;;)
		{
			System.err.println("You Can Add Only One Toppings For Regular & Medium, Two Toppings For Large Pizza(Cost Free)");
			System.err.print("Note:-");
			System.out.print("If You Don't Want To Add Toppings or Cheese You Can Press");
			System.err.println("3.Next");
			System.out.println("1.Add Extra Toppings    2.Extra Cheese    3.Next");
			int a=sc.nextInt();
			if(a==1&&count==0&&Large==0)
			{
				System.out.println("----------Veg And Non-veg Toppings---------");
				System.out.println("1.Black Olive(Rs.20)  2.Capsicum(Rs.25)   3.Mushroom(Rs.30)  4.Fresh Tomato(Rs.10)");
				System.out.println("5.Chicken Tikka(Rs.35)   6.Barbeque Chicken(Rs.45)   7.Grilled Chicken(Rs.40)");
				System.out.println("-------------------------");
				switch(sc.nextInt())
				{
				case 1:{
					l.add(20);
					count++;
				 }break;
				case 2:{
					l.add(25);
					count++;
				 }break;
				case 3:{
					l.add(30);
					count++;
				 }break;
				case 4:{
					l.add(10);
					count++;
				 }break;
				case 5:{
					l.add(35);
					count++;
				 }break;
				case 6:{
					l.add(45);
					count++;
				 }break;
				case 7:{
					l.add(40);
					count++;
				 }break;
				default : {
					  System.err.println("Please Enter Correct Number");
				    }break;
				}
			}
			else if(count<2&&Large==1&&a==1) {
				
				
					System.out.println("----------Veg And Non-veg Toppings---------");
					System.out.println("1.Black Olive(Rs.20)  2.Capsicum(Rs.25)   3.Mushroom(Rs.30)  4.Fresh Tomato(Rs.10)");
					System.out.println("5.Chicken Tikka(Rs.35)   6.Barbeque Chicken(Rs.45)   7.Grilled Chicken(Rs.40)");
					System.out.println("-------------------------");
					switch(sc.nextInt())
					{
					case 1:{
						l.add(20);
						l1.add(20);
						count++;
					 }break;
					case 2:{
						l.add(25);
						l1.add(25);
						count++;
					 }break;
					case 3:{
						l.add(30);
						l1.add(30);
						count++;
					 }break;
					case 4:{
						l.add(10);
						l1.add(10);
						count++;
					 }break;
					case 5:{
						l.add(35);
						l1.add(35);
						count++;
					 }break;
					case 6:{
						l.add(45);
						l1.add(45);
						count++;
					 }break;
					case 7:{
						l.add(40);
						l1.add(40);
						count++;
					 }break;
					default : {
						  System.err.println("Please Enter Correct Number");
					    }break;
					}
				}
				
				
			else if(a==1&&count==2&Large==1)
			{
				System.err.println("You Have Already Added The Topping! You Can Add Only One Topping For Non-veg  Pizza");
				System.err.println("-----------------------------------------------------------------------------------");
				System.out.println("");
			}
			else if(a==2&&count1==0)
			{
				Cheese.add(35);
				count1++;
				System.err.println("Extra Cheese Added......");
			}
			else if(a==1&&count==1)
			{
				System.err.println("You Have Already Added The Topping! You Can Add Only One Topping For Non-veg  Pizza");
				System.err.println("-----------------------------------------------------------------------------------");
				System.out.println("");
			}
			else if(a==2&&count1==1)
			{
				System.err.println("Cheese Already Added. Please Procced Futher....");
				System.err.println("---------------------");
			}
			else if(a==3)
			{
				if(Large==1) {
					if(l.size()>=2) {
				int d=0;
				int b=0;
				for(int  j=0;j<l.size();j++)
				{
					b=(int) l.get(j);
					d=d+b;
				}
				for(int i=0;i<2;i++)
				{
					l1.add(free,0);
					l1.remove(free+1);
					free++;
				}
				p1.add(p);
				s1.add(price);
				t1.add(d);
				break;
				}else {
					System.err.println("You Have Selected Large Pizza You Have To Select Minimum 2 Toppings");
				}
				}
				else {
					int d=0;
					int b=0;
					for(int  j=0;j<l.size();j++)
					{
						b=(int) l.get(j);
						d=d+b;
					}
					p1.add(p);
					s1.add(price);
					t1.add(d);
					break;
				}
			}
			else {
				System.err.println("Please Enter Correct Number");
			}
			
		}
		
		
	}
	
	
	
	public void Side()
	{
		for(;;) {
		System.err.println("--------Side Menu--------");
		    System.out.println("1.Cold Drink(Rs.55)    2.Mousse Cake(Rs.90)");
		    int sd=sc.nextInt();
		    
		    if(sd==1){
			    Sides.add(55);
			    break;
		    }
		    else if(sd==2){
		    	Sides.add(90);
		    	break;
		    }
		    else{
		    	System.out.println("Enter Correct Number");
		    }
		    }
		}
	
	
	
 }
	

