import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})


export class DashboardComponent implements OnInit {
  
  constructor(private http: HttpClient, private router: Router) { }

  @ViewChild('content') content: any;
  ngOnInit(): void {
  }
  public open() {
    if(!true){
      // Dont open the modal
    } else {
       // Open the modal
       this.content.open();
    }
  }
}
