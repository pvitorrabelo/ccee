import { HttpClient, HttpEvent, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Agente } from '../model/agente';

@Injectable({
  providedIn: 'root'
})
export class AgentesService {

  private readonly API  = 'http://localhost:8080/api/agentes';

  constructor(private httpClient: HttpClient) { }

  upload(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();

    formData.append('file', file, file.name);

    const req = new HttpRequest('POST', `${this.API}/processarFile`, formData, {
      reportProgress: true,
      responseType: 'json'
    });

    return this.httpClient.request(req);
  }

  loadById(id: string): Observable<Agente[]> {
    return this.httpClient.get<Agente[]>(`${this.API}?sigla=${id}`);
  }

}
