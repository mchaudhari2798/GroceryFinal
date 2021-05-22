import { Component, OnInit } from '@angular/core';
import { CategoriesService } from 'src/app/services/categories.service';

@Component({
  selector: 'app-grocery-category',
  templateUrl: './grocery-category.component.html',
  styleUrls: ['./grocery-category.component.css']
})
export class GroceryCategoryComponent implements OnInit {
  
  category_name: any;

    
    constructor(private catService:CategoriesService) { }

  ngOnInit(): void {

    this.catService.getAllCategories()
    .subscribe(x => {
      console.log(x)
      this.category_name = x._embedded.groceryCategory;
    });

}


  }
  // http://localhost:9090/grocery-category

