import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CategoriesService {
   
  

  constructor( private http : HttpClient) { }

  getAllCategories(){
    return this.http.get<any>('http://localhost:9090/grocery-category/');
  }

  getAllProducts(){
    return this.http.get<any>('http://localhost:8080/Categories/all');
  }

}