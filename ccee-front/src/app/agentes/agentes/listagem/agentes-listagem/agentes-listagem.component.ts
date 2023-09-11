import { Component } from '@angular/core';
import { Agente } from 'src/app/agentes/model/agente';
import { AgentesService } from './../../../services/agentes.service';

@Component({
  selector: 'app-agentes-listagem',
  templateUrl: './agentes-listagem.component.html',
  styleUrls: ['./agentes-listagem.component.scss']
})
export class AgentesListagemComponent {
  agentes: Agente[] = [];

  regiao: string = "";

  readonly displayedColumns = ['agente', 'data'];

  constructor(private agentesService: AgentesService) { }

  ngOnInit(): void { }

  dataChanged(event: any){
    console.log(event.value);
    this.agentesService.loadById(event.value).subscribe(response =>{
      this.agentes = response;
    })
  }
}
