import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Swal from 'sweetalert2'

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

  constructor(private router :Router) {

  }

  ngOnInit(): void {
  }

  onplace(){
    Swal.fire({
      title:'your Order Placed',
      confirmButtonText: 'ok',
      icon:'success',
    }).then(result =>{
      this.router.navigate([''])
    })
  }

}
