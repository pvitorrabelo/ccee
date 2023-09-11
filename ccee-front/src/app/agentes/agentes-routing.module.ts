import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgentesListagemComponent } from './agentes/listagem/agentes-listagem/agentes-listagem.component';
import { AgentesUploadComponent } from './agentes/upload/agentes-upload.component';


const routes: Routes = [
  {path: 'upload', component: AgentesUploadComponent},
  {path: 'list', component: AgentesListagemComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AgentesRoutingModule { }
