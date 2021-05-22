import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GroceryCategoryComponent } from './grocery-category.component';

describe('GroceryCategoryComponent', () => {
  let component: GroceryCategoryComponent;
  let fixture: ComponentFixture<GroceryCategoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GroceryCategoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GroceryCategoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
