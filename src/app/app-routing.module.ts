import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApptInfoComponent } from './appt-info/appt-info.component';

import { BookAppointmentComponent } from './book-appointment/book-appointment.component';
import { DoctorHomeComponent } from './doctor-home/doctor-home.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { KamisComponentComponent } from './kamis-component/kamis-component.component';


const routes: Routes = [

  { path: 'doctorInfo', component : DoctorInfoComponent},
  { path: 'bookAppointment', component : BookAppointmentComponent},
  { path: 'findDoctor', component : KamisComponentComponent },
  { path: 'appt-info', component : ApptInfoComponent},
   {path : '', redirectTo : 'doctorInfo', pathMatch : 'full'},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }