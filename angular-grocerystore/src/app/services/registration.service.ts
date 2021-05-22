import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {
  
  private baseUrlall = "http://localhost:9090/Registration/";

  private loginUrl = "http://localhost:9090/User/";
  

  constructor(private http:HttpClient) { }

  saveDetails(obj:any){
    return this.http.post(this.baseUrlall,obj);

  }

  getreglist(){
    return this.http.get(this.baseUrlall+'all');
  }

  //FOR LOGIN
  saveLoginDetails(obj:any){
    return this.http.post(this.loginUrl,obj);

  }
}
