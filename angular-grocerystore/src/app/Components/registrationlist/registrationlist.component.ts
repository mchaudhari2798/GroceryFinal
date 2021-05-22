import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Registration } from 'src/app/classesTS/registration';
import { RegistrationService } from '../../services/registration.service';

@Component({
  selector: 'app-registrationlist',
  templateUrl: './registrationlist.component.html',
  styleUrls: ['./registrationlist.component.css']
})
export class RegistrationlistComponent implements OnInit {

  users: any;

  constructor(private route : ActivatedRoute,
    private router : Router,
    private regservice:RegistrationService) {}  

  ngOnInit(): void {
    this.listAll();
  }

  listAll(){
    this.regservice.getreglist().subscribe(resp => {
      console.log(resp);
      this.users = resp;
    });
  }

}
