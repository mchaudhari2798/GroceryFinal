import { isDefined } from '@angular/compiler/src/util';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { CartItem } from '../common/cart-item';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  cartItems: CartItem[]= [];
  totalPrice:Subject<number>=new Subject<number>();
  totalQuantity:Subject<number>=new Subject<number>();

  constructor() { }

  addToCart(theCartItem:CartItem){ 
    let alreadyExistsInCart:boolean=false;
    let existingCartItem:CartItem | null |undefined;
    existingCartItem=undefined;

    if(this.cartItems.length>0){
      existingCartItem=this.cartItems.find(tempcartItems=>tempcartItems.id===theCartItem.id);
      alreadyExistsInCart=(existingCartItem!=undefined)
    }
    if(alreadyExistsInCart){
      if(existingCartItem){
      existingCartItem.quantity++;
      }
    }else{
      this.cartItems.push(theCartItem);

    }
    this.calculateTotalPrice();
  }
    
  calculateTotalPrice(){
    let totalPriceValue:number=0;
    let totalQuantityValue:number=0;

    for(let currentCartItem of this.cartItems){
      totalPriceValue+= currentCartItem.quantity* currentCartItem.unitprice ;
      totalQuantityValue+=currentCartItem.quantity;
    }
    
    console.log( `total price:${totalPriceValue},Total quantity: ${totalQuantityValue}`);

    this.totalPrice.next(totalPriceValue);
    this.totalQuantity.next(totalQuantityValue);
  }
}

