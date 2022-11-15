package com.br.api.todo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.br.api.todo.model.Todo;
import com.br.api.todo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServiceCarga {

	@Autowired
	private TodoRepository repository;

	public void instanceBaseCarga() throws ParseException {

		SimpleDateFormat formt = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo();
		t1.setId(null);
		t1.setDescricao("Realizar caminhadas pelal manhãn as 09:00.");
		t1.setTitulo("Estudar");
		t1.setFinalizado(false);
		t1.setDataParaFinalizar(formt.parse("13/11/2022"));
		repository.save(t1);

		Todo t2 = new Todo();
		t2.setId(null);
		t2.setDescricao("Entender utilziação do quarkus.");
		t2.setTitulo("Estudar quarkus");
		t2.setFinalizado(false);
		t2.setDataParaFinalizar(formt.parse("14/11/2022 10:40"));
		repository.save(t2);

		Todo t4 = new Todo();
		t4.setId(null);
		t4.setDescricao("Enteder fluxagrama de dados descartaveis");
		t4.setTitulo("Estudar fluxograma");
		t4.setFinalizado(true);
		t4.setDataParaFinalizar(formt.parse("23/12/2022"));
		repository.save(t4);

		Todo t5 = new Todo();
		t5.setId(null);
		t5.setDescricao("Não esquecer de ler documentação da tecnologia.");
		t5.setTitulo("Estudar");
		t5.setFinalizado(true);
		t5.setDataParaFinalizar(formt.parse("29/11/2022"));
		repository.save(t5);

		Todo t6 = new Todo();
		t6.setId(null);
		t6.setDescricao("Agender series de acesso.");
		t6.setTitulo("Entreterimento");
		t6.setFinalizado(false);
		t6.setDataParaFinalizar(formt.parse("13/11/2022"));
		repository.save(t6);

		Todo t7 = new Todo();
		t7.setId(null);
		t7.setDescricao("Analissar estrutura de montar um mestrado.");
		t7.setTitulo("Pensar em TCC");
		t7.setFinalizado(false);
		t7.setDataParaFinalizar(formt.parse("13/11/2022"));
		repository.save(t7);

		Todo t8 = new Todo();
		t8.setId(null);
		t8.setDescricao("Realizar estudor de docker");
		t8.setTitulo("Estudar docker");
		t8.setFinalizado(false);
		t8.setDataParaFinalizar(formt.parse("19/11/2022"));
		repository.save(t8);

		Todo t9 = new Todo();
		t9.setId(null);
		t9.setDescricao("Estudar maus enfazes do quarkus");
		t9.setTitulo("Estudar quarkus ");
		t9.setFinalizado(false);
		t9.setDataParaFinalizar(formt.parse("26/11/2022"));
		repository.save(t9);

		Todo t11 = new Todo();
		t11.setId(null);
		t11.setDescricao("Realizar 8 voltar ");
		t11.setTitulo("Exercicios");
		t11.setFinalizado(false);
		t11.setDataParaFinalizar(formt.parse("18/11/2022"));
		repository.save(t11);

		Todo t12 = new Todo();
		t12.setId(null);
		t12.setDescricao("Melhorar estruturas ativas de codigo fonte.");
		t12.setTitulo("Estudar");
		t12.setFinalizado(false);
		t12.setDataParaFinalizar(formt.parse("13/11/2022"));
		repository.save(t12);

	}
}
