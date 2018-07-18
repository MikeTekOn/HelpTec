/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensoftware.helptec.controller;

import com.opensoftware.helptec.domain.Especialidade;
import com.opensoftware.helptec.domain.Funcionario;
import com.opensoftware.helptec.repository.EspecialidadeRepository;
import com.opensoftware.helptec.repository.FuncionarioRepository;
import com.opensoftware.helptec.valueobjects.Data;
import java.util.List;

/**
 *
 * @author Hugo
 * @date 12/jul/2018
 */
public class AdicionarFuncionarioController {

    private final FuncionarioRepository rep;
    private final EspecialidadeRepository repEspec;

    public AdicionarFuncionarioController() {
        rep = new FuncionarioRepository();
        repEspec = new EspecialidadeRepository();
    }

    /**
     * Controller to add new Funcionario
     *
     * @param especialidade expert area of funcionario
     * @param nome name of funcionario
     * @param morada address of funcionario
     * @param dataNascimento date born
     * @param tlf contact phone
     * @return funcionario object
     */
    public Funcionario adicionarNovoFuncionario(Especialidade especialidade, String nome, String morada, String dataNascimento, int tlf) {
        Funcionario novo = new Funcionario(especialidade, new Data(nome), nome, morada, tlf);
        return rep.save(novo);

    }

    /**
     *  Get all especialidade existed
     * @return list of especialidade
     */
    public List<Especialidade> showListEspecialidade() {
        return repEspec.findAll();
    }

}
