import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { AgentesRoutingModule } from './agentes-routing.module';
import { AgentesListagemComponent } from './agentes/listagem/agentes-listagem/agentes-listagem.component';
import { AgentesUploadComponent } from './agentes/upload/agentes-upload.component';



@NgModule({
  declarations: [
    AgentesUploadComponent,
    AgentesListagemComponent
  ],
  imports: [
    CommonModule,
    AgentesRoutingModule,
    AppMaterialModule
  ]
})
export class AgentesModule { }
