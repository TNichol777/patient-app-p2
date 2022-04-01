import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { KamisComponentComponent } from './kamis-component/kamis-component.component';
import { PatientInfoComponent } from './patient-info/patient-info.component';
import { DoctorHomeComponent } from './doctor-home/doctor-home.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { SignupPageComponent } from './signup-page/signup-page.component';
import { AppendingAppointmentsComponent } from './appending-appointments/appending-appointments.component';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';

import { ModelComponent } from './model/model.component';
import { ApptInfoComponent } from './appt-info/appt-info.component';

@NgModule({
  declarations: [
    AppComponent,
    KamisComponentComponent,
    PatientInfoComponent,
    DoctorHomeComponent,
    LoginPageComponent,
    DoctorInfoComponent,
    SignupPageComponent,
    AppendingAppointmentsComponent,
    BookAppointmentComponent,
    ModelComponent,
    ApptInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
