import { ComponentFixture, TestBed } from '@anAgentesUploadComponentgular/core/testing';

import { AgentesUploadComponent } from './agentes-upload.component';

describe('AgentesUploadComponent', () => {
  let component: AgentesUploadComponent;
  let fixture: ComponentFixture<AgentesUploadComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AgentesUploadComponent]
    });
    fixture = TestBed.createComponent(AgentesUploadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
