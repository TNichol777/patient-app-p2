import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppendingAppointmentsComponent } from './appending-appointments/appending-appointments.component';
import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import { DoctorHomeComponent } from './doctor-home/doctor-home.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { KamisComponentComponent } from './kamis-component/kamis-component.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PatientInfoComponent } from './patient-info/patient-info.component';
import { SignupPageComponent } from './signup-page/signup-page.component';

const routes: Routes = [

  { path: 'doctorInfo', component : DoctorInfoComponent},
  { path: 'bookAppointment', component : BookAppointmentComponent},
  { path: 'findDoctor', component : KamisComponentComponent },
  { path: 'doctorHome', component : DoctorHomeComponent},
   {path : '', redirectTo : 'doctorInfo', pathMatch : 'full'},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }