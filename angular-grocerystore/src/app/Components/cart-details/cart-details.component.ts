import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartItem } from 'src/app/common/cart-item';
import { CartService } from 'src/app/services/cart.service';

@Component({
  selector: 'app-cart-details',
  templateUrl: './cart-details.component.html',
  styleUrls: ['./cart-details.component.css']
})
export class CartDetailsComponent implements OnInit {

  cartItems:CartItem[]=[];
  totalprise:number=0;
  totalQuantity:number=0;


  constructor(private _cartservice:CartService,
        private router:Router) { }

  ngOnInit(){
    this.cartDetails();
  }
  cartDetails(){
    this.cartItems=this._cartservice.cartItems;
    this._cartservice.totalPrice.subscribe(
      data=>this.totalprise=data
    );

    this._cartservice.totalQuantity.subscribe(
      data=> this.totalQuantity=data
    );

    this._cartservice.calculateTotalPrice();
  }

  onClick(){
    this.router.navigate(['/payment'])
  }

  setQnt(type: string, i: number){
    if(type === 'add'){
      this.cartItems[i].quantity++;
      this._cartservice.calculateTotalPrice();
    }
    else if(type === 'remove'){
      this.cartItems[i].quantity--;
      this._cartservice.calculateTotalPrice();
    }
  }
}
