import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ccee-front';

  constructor(private router: Router){

  }

  selectedMenu(rota: string){
    console.log('entroi');
    this.router.navigate(['/agentes/'+rota]);
  }
}
