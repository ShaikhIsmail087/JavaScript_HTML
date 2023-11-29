import { Component, OnInit } from '@angular/core';
import { MyService } from '../my.service';


@Component({
  selector: 'app-my-component',
  template: '<div>{{ servletData }}</div>',
})
export class MyComponent implements OnInit {
  servletData: any;

  constructor(private myService: MyService) {}

  ngOnInit(): void {
    this.myService.getServletData().subscribe(data => {
      this.servletData = data;
    });
  }
}
