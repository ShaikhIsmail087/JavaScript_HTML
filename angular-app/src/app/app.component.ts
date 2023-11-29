import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  template: `
    <h1>Hello from Angular!</h1>
    <button (click)="callServlet()">Call Servlet</button>
    <div *ngIf="servletResponse">
      <h2>Servlet Response:</h2>
      <p>{{ servletResponse }}</p>
    </div>
  `,
  styles: []
})
export class AppComponent implements OnInit {
  title(title: any) {
    throw new Error('Method not implemented.');
  }
  servletResponse: string | undefined;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {}

  callServlet(): void {
    this.http.get<string>('http://localhost:8080/ServletBackend/api/myendpoint', { responseType: 'text' as 'json' }).subscribe(response => {
      this.servletResponse = response;
    });
  }
}
