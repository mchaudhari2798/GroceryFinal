import { Component, OnInit } from '@angular/core';
import { Grocery } from 'src/app/common/grocery';
import { GroceryService } from 'src/app/services/grocery.service';
import {ActivatedRoute, Router} from '@angular/router';
import { ThisReceiver } from '@angular/compiler';
import { CartService } from 'src/app/services/cart.service';
import { CartItem } from 'src/app/common/cart-item';

@Component({
  selector: 'app-grocery-list',
//   templateUrl: './grocery-list.component.html',
  templateUrl: './grocery-grid.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {

 grocerys!: Grocery[];

  currentCategoryId!: number;
  searchMode!: boolean;

  constructor(private _groceryservice:GroceryService,
      private _activatedRoute:ActivatedRoute,
      private _cartservice:CartService,
      private router:Router
      )   { }
    
  ngOnInit(){
      
      this._activatedRoute.paramMap.subscribe(()=>{
        this.listGrocery();
      })
  }

  listGrocery(){
    this.searchMode= this._activatedRoute.snapshot.paramMap.has('keyword'); 

    if(this.searchMode){
      //do search work
    }else{
      this.handleListGrocery();
    }
      
  }
  handleListGrocery(){
    const hasCategoryId:boolean=this._activatedRoute.snapshot.paramMap.has('id');

      if(hasCategoryId){
         this.currentCategoryId= +Number(this._activatedRoute.snapshot.paramMap.get('id'));
      }
      else{
        this.currentCategoryId=1;
      }

      this._groceryservice.getGrocery(this.currentCategoryId).subscribe(
      data=>this.grocerys=data
      )
     

  }

  addToCart(grocery:Grocery){
    console.log( `grocery.name:${grocery.name},and price:${grocery.unitprice}`);
    const cartItems=new CartItem(grocery);
    this._cartservice.addToCart(cartItems);

    // this.router.navigate(['/cart'])
   
  }
  onBuy(grocery:Grocery){
    console.log( `grocery.name:${grocery.name},and price:${grocery.unitprice}`);
    const cartItems=new CartItem(grocery);
    this._cartservice.addToCart(cartItems);

    this.router.navigate(['/cart'])
   
  }
    
  }


