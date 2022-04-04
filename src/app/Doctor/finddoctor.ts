import { Component, NgModule, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-kamis-component',
  templateUrl: './kamis-component.component.html',
  styleUrls: ['./kamis-component.component.css']
})
export class KamisComponentComponent implements OnInit {

  finddoctor: FormGroup;
  selectedEntity !: NgModule;
  errMessage !: string;
  successMessage !: string;
  doctors: Doctor[] = [];
  public doctorAvailable=true;

  title ='kamis-component'
  drowdownList =[];
  selectedItems = [];
  dropdownSettings = {};

  constructor(public formBuilder:FormBuilder, public doctorService: DoctorService, public router:Router) {     
    this.finddoctor  = new FormGroup({
      specialty : new FormControl('', Validators.required),
      location_city : new FormControl('', Validators.required),
      location_state : new FormControl('', Validators.required),
      insuranceExcepted: new FormControl('', Validators.required),
     
    });
    }
  
    ngOnInit(): void {
    
  }
 
    searchDoctor(){
    console.log(this.finddoctor.value)
    this.doctorService.searchDoctor(this.finddoctor.value.specialty,this.finddoctor.value.location_city,this.finddoctor.value.location_state,this.finddoctor.value.insuranceExcepted).subscribe((data: any) =>{
    this.successMessage = 'Doctors Based on Search';
    this.router.navigate(['doctorInfo']);
   })
  
}
    }
     

     
      
  