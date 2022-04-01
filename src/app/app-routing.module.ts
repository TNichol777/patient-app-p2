import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { FindDoctorComponent } from './find-doctor/find-doctor.component';
import { BookAppointmentComponent } from './book-doctor/book-doctor.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  // { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'findoc', component: FindDoctorComponent },
  { path: 'bookone', component: BookAppointmentComponent },
  { path: 'doctorInfo', component: DoctorInfoComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
