import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgentesListagemComponent } from './agentes-listagem.component';

describe('AgentesListagemComponent', () => {
  let component: AgentesListagemComponent;
  let fixture: ComponentFixture<AgentesListagemComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AgentesListagemComponent]
    });
    fixture = TestBed.createComponent(AgentesListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
