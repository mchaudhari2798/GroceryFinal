import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class CategoriesService {
   
  // private listall = "http://localhost:8080/Categories/";

  constructor( private http : HttpClient) { }

  getAllCategories(){
    return this.http.get<any>('http://localhost:8080/Categories/all');
  }

  getAllProducts(){
    return this.http.get<any>('http://localhost:8080/Categories/all');
  }

}