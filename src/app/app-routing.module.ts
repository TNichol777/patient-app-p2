import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppendingAppointmentsComponent } from './kamis/appending-appointments/appending-appointments.component';
import { BookAppointmentComponent } from './kamis/book-appointment/book-appointment.component';
import { DoctorHomeComponent } from './kamis/doctor-home/doctor-home.component';
import { DoctorInfoComponent } from './kamis/doctor-info/doctor-info.component';
import { KamisComponent } from './kamis/kamis.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { PatientInfoComponent } from './kamis/patient-info/patient-info.component';



const routes: Routes = [
  { path: '', redirectTo: 'index.component.html', pathMatch: 'full' },
  { path: 'patientInfo', component : PatientInfoComponent},
  { path: 'doctorInfo', component : DoctorInfoComponent},
  { path: 'viewAppendingApp', component : AppendingAppointmentsComponent },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'bookAppointment', component : BookAppointmentComponent},
  { path: 'findDoctor', component : KamisComponent},
  { path: 'doctorHome', component : DoctorHomeComponent},
  {path : '', redirectTo : 'doctorInfo', pathMatch : 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }