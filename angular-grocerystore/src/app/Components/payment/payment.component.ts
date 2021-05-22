import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  public payments = {
    Card_id: Number,
    typeOfCard: String,
    card_No: Number,
    cardHolderName: String,
    cardValidity: String,
    cvv: Number
  }

  constructor() {

  }

  ngOnInit(): void {
  }

}
