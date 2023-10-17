package br.com.postech.arquitetura.software.techchallenge.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.postech.arquitetura.software.techchallenge.model.Cliente;
import br.com.postech.arquitetura.software.techchallenge.repository.jpa.IClienteJpaRepository;
import br.com.postech.arquitetura.software.techchallenge.service.IClientService;
import br.com.postech.arquitetura.software.techchallenge.util.ValidacaoUtils;

@Service
public class ClienteServiceImpl implements IClientService {

	@Autowired
	private IClienteJpaRepository clienteJpaRepository;

	public ClienteServiceImpl(IClienteJpaRepository clienteJpaRepository) {
		super();
		this.clienteJpaRepository = clienteJpaRepository;
	}
	
	protected IClienteJpaRepository getPersistencia() {
		return clienteJpaRepository;
	}

	@Override
	public List<Cliente> findAll() {
		return getPersistencia().findAll();
	}

	@Override
	public Cliente findById(Integer id) {
		Optional<Cliente> clientes = getPersistencia().findById(id);
		return ValidacaoUtils.isPreenchido(clientes) ? clientes.get() : new Cliente();
	}
}
