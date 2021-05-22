import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grocery-category',
  templateUrl: './grocery-category.component.html',
  styleUrls: ['./grocery-category.component.css']
})
export class GroceryCategoryComponent implements OnInit {
  groceries:any

  constructor() { }

  ngOnInit(): void {
  }

}
