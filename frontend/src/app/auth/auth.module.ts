// import { NgModule } from "@angular/core";
// import { CommonModule } from "@angular/common";

// import { AuthRoutingModule } from "./auth-routing.module";
// import { FormsModule, ReactiveFormsModule } from "@angular/forms";
// import { HttpClientModule } from "@angular/common/http";

// @NgModule({
//   declarations: [],
//   imports: [
//     CommonModule,
//     AuthRoutingModule,
//     ReactiveFormsModule,
//     HttpClientModule,
//     FormsModule
//   ],
//   exports: [
    
//   ]
// })
// export class AuthModule {}



import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { RegistrationComponent } from './components/registration/registration.component';

@NgModule({
  declarations: [LoginComponent, RegistrationComponent, LoginComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forChild([
      { path: 'login', component: LoginComponent },
      { path: 'register', component: RegistrationComponent }
    ])
  ],
  exports: [LoginComponent, RegistrationComponent]
})
export class AuthModule {}