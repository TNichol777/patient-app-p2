import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApptInfoComponent } from './appt-info.component';

describe('ApptInfoComponent', () => {
  let component: ApptInfoComponent;
  let fixture: ComponentFixture<ApptInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ApptInfoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ApptInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
