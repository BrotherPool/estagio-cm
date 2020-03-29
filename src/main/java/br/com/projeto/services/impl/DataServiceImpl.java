package br.com.projeto.services.impl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import br.com.projeto.services.DataService;

@Component
public class DataServiceImpl implements DataService {
	
	public DataServiceImpl() {
		System.out.println("Criando a bean DataServiceImpl");
	}
	
	
	@Override
	public boolean DataValida(String data) {
		try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            sdf.parse(data);
            return true;
        } catch (Exception ex) {
            return false;
        }
	}

	@Override
	public boolean DataMenorQueHoje(String data) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse(data, dtf);
        LocalDate hoje = LocalDate.now();
        return dataVerificada.compareTo(hoje) <= 0;
	}

}
