/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.bootstrap;

import com.opensoftware.helptec.domain.Cliente;
import com.opensoftware.helptec.domain.Equipamento;
import com.opensoftware.helptec.domain.Especialidade;
import com.opensoftware.helptec.domain.Funcionario;
import com.opensoftware.helptec.domain.Reparacao;
import com.opensoftware.helptec.domain.TipoEquipamento;
import com.opensoftware.helptec.domain.Utilizador;
import com.opensoftware.helptec.repository.ClienteRepository;
import com.opensoftware.helptec.repository.EquipamentoRepository;
import com.opensoftware.helptec.repository.EspecialidadeRepository;
import com.opensoftware.helptec.repository.FuncionarioRepository;
import com.opensoftware.helptec.repository.ReparacaoRepository;
import com.opensoftware.helptec.repository.TipoEquipamentoRepository;
import com.opensoftware.helptec.repository.UtilizadorRepository;
import com.opensoftware.helptec.valueobjects.Data;
import com.opensoftware.helptec.valueobjects.Marca;
import com.opensoftware.helptec.valueobjects.Modelo;
import com.opensoftware.helptec.valueobjects.Nome;
import com.opensoftware.helptec.valueobjects.Password;
import com.opensoftware.helptec.valueobjects.Relatorio;

/**
 *
 * @author Hugo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente(new Nome("Quim"), "Rua A", 899012378);
        Cliente c1 = new Cliente(new Nome("Ze"), "Rua B", 913275809);
        Cliente c3 = new Cliente(new Nome("Ne"), "Rua C", 123456789);

        TipoEquipamento te1 = new TipoEquipamento("TV");
        TipoEquipamento te2 = new TipoEquipamento("Desktop");
        TipoEquipamento te3 = new TipoEquipamento("Laptop");

        Especialidade e = new Especialidade("Informatica");
        Especialidade e1 = new Especialidade("Electronica");
        Especialidade e2 = new Especialidade("Robotica");

        Funcionario f = new Funcionario(e2, new Data("08/07/1980"), "Rua Z", 921309486);
        Funcionario f1 = new Funcionario(e, new Data("09/10/1970"), "Rua Y", 910873684);
        Funcionario f2 = new Funcionario(e1, new Data("25/04/1985"), "Rua B", 931058394);

        Utilizador u = new Utilizador(f2, new Password("12345678"));
        Utilizador u2 = new Utilizador(f1, new Password("1234abcd"));
        Utilizador u3 = new Utilizador(f, new Password("abcdefg"));

        Reparacao r = new Reparacao(new Data("09/07/2018"), new Relatorio("Painel LCD avariado"), f2);
        Reparacao r1 = new Reparacao(new Data("10/07/2018"), new Relatorio("PSU avariado"), f1);
        Reparacao r2 = new Reparacao(new Data("20/07/2018"), new Relatorio("Colunas avariadas"), f);

        Equipamento eq = new Equipamento(te3, c3, new Marca("Dell"), new Modelo("XPS 15"));
        eq.adicionarReparacao(r);

        Equipamento eq2 = new Equipamento(te2, c1, new Marca("Dell"), new Modelo("Area 51 ThreadRipper"));
        eq2.adicionarReparacao(r1);

        Equipamento eq3 = new Equipamento(te1, c, new Marca("Samsung"), new Modelo("Nice 48pol"));
        eq.adicionarReparacao(r2);

        ClienteRepository rep = new ClienteRepository();
        rep.save(c);
        rep.save(c1);
        rep.save(c3);

        TipoEquipamentoRepository rep1 = new TipoEquipamentoRepository();
        rep1.save(te3);
        rep1.save(te2);
        rep1.save(te1);

        EspecialidadeRepository rep3 = new EspecialidadeRepository();
        rep3.save(e);
        rep3.save(e1);
        rep3.save(e2);

        FuncionarioRepository rep4 = new FuncionarioRepository();
        rep4.save(f2);
        rep4.save(f);
        rep4.save(f1);

        UtilizadorRepository rep5 = new UtilizadorRepository();
        rep5.save(u3);
        rep5.save(u);
        rep5.save(u2);

        ReparacaoRepository rep6 = new ReparacaoRepository();
        rep6.save(r2);
        rep6.save(r);
        rep6.save(r1);

        EquipamentoRepository rep7 = new EquipamentoRepository();
        rep7.save(eq3);
        rep7.save(eq);
        rep7.save(eq2);
    }

}
