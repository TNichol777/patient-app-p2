import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { KamisComponent } from './kamis/kamis.component';
import { PatientInfoComponent } from './kamis/patient-info/patient-info.component';
import { DoctorHomeComponent } from './kamis/doctor-home/doctor-home.component';

import { DoctorInfoComponent } from './kamis/doctor-info/doctor-info.component';

import { AppendingAppointmentsComponent } from './kamis/appending-appointments/appending-appointments.component';
import { BookAppointmentComponent } from './kamis/book-appointment/book-appointment.component';
import {MatSelectModule} from '@angular/material/select';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { DoctorComponent } from './model/doctor/doctor.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ModelsComponent } from './models/models.component';





@NgModule({
  declarations: [
    AppComponent,
    KamisComponent,
    PatientInfoComponent,
    DoctorHomeComponent,

    DoctorInfoComponent,

    AppendingAppointmentsComponent,
    BookAppointmentComponent,
    LoginComponent,
    SignupComponent,
    DoctorComponent,
    DashboardComponent,
    ModelsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    MatSelectModule


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }