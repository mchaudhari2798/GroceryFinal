import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Grocery } from '../common/grocery';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Component,OnInit } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GroceryService {
private baseUrl="http://localhost:9090/groceries";
// private categoryUrl="http://localhost:8050/api/v1/grocery-category";

  constructor(private httpClient:HttpClient) { }

  getGrocery(theCategoryId:number): Observable<Grocery[]>{
    const searchUrl = `${this.baseUrl}/search/categoryid?id=${theCategoryId}`;
    return this.getGroceryList(searchUrl)
  };
  
  private getGroceryList(searchUrl:string):Observable<Grocery[]>{
    return this.httpClient.get<GetResponseGrocery>(searchUrl).pipe(
      map(response=>response._embedded.groceries)
     )
  }


  searchGrocery(keyword:number): Observable<Grocery[]>{
    const searchUrl = `${this.baseUrl}/search/categoryid?id=${keyword}`;
    return this.getGroceryList(searchUrl);
  };


  // getGroceryCategories():Observable<GroceryCategory[]>{
  //   return this.httpClient.get<GetResponseGroceryCategory>(this.categoryUrl).pipe(
  //    map(response=>response._embedded.groceryCategory)
  //   );
  // }
}

interface GetResponseGrocery{
  _embedded:{
    groceries: Grocery[];
  }
}

// interface GetResponseGroceryCategory{
//   _embedded:{
//     groceryCategory: GroceryCategory[];
//   }
// }

