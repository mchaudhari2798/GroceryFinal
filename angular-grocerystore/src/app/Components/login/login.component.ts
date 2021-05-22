import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/classesTS/user';
import { RegistrationService } from 'src/app/services/registration.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = new User();

  constructor(private router:Router,
    private regService:RegistrationService) { }

  ngOnInit(): void {
  }

  onLoginSubmit(){
    let obj = {
      "user_Id" : this.user.user_Id,
      "emailId": this.user.emailId,  
      "password": this.user.password,   
      "enabled":this.user.enabled
    }

    this.regService.saveLoginDetails(obj).subscribe(resp=> {
      alert('Login completed');
      this.router.navigate(['/groceries']);

      console.log(resp);
    });
  }

}
