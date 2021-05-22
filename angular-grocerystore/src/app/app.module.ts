import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { GroceryListComponent } from './Components/grocery-list/grocery-list.component';
import { GroceryService } from './services/grocery.service';
import {RouterModule,Routes}from '@angular/router';
import { GroceryCategoryComponent } from './Components/grocery-category/grocery-category.component';
import { SearchComponent } from './Components/search/search.component';
import { CartStatusComponent} from './Components/cart-status/cart-status.component';
import { CartDetailsComponent } from './Components/cart-details/cart-details.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { FooterComponent } from './Components/footer/footer.component';
import { RegistrationComponent } from './Components/registration/registration.component';
import { RegistrationlistComponent } from './Components/registrationlist/registrationlist.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './Components/login/login.component';
import { PaymentComponent } from './Components/payment/payment.component';
import { SweetalertComponent } from './sweetalert/sweetalert.component';

const routes:Routes=[
{path:'groceries',component:GroceryListComponent},
{path:'cart-details',component:CartDetailsComponent},
{path:'search/:keyword',component:GroceryListComponent},
{path:'category/:id',component:GroceryListComponent},
{ path:'cart', component:CartDetailsComponent},
{path:'payment',component:PaymentComponent},
{path:'',redirectTo:'/groceries',pathMatch:'full'},


// {path:'**', component: PageNotFountComponent}

// { path:'Grocery',component:HomeComponent},
{ path:'registerpage', component:RegistrationComponent},
{ path:'loginpage', component:LoginComponent},
// { path: 'viewproducts', component:ProductsComponent },
// { path: 'mycart', component:CartComponent},
{ path: 'registrationlist', component:RegistrationlistComponent},
// { path: '**' , component : PageNotFoundComponent}


];



@NgModule({
  declarations: [
    AppComponent,
    GroceryListComponent,
    GroceryCategoryComponent,
    SearchComponent,
    CartStatusComponent,
    CartDetailsComponent,
    NavbarComponent,
    RegistrationComponent,   
    RegistrationlistComponent,
    LoginComponent,
    FooterComponent,
    PaymentComponent,
    SweetalertComponent
  //   PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
   
  providers: [
    GroceryService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
