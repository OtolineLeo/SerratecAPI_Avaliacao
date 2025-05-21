package org.serratec.avaliacao.avaliacao.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {

	@NotBlank(message="Preencha a rua")
	@Size(max=40, min=10)
	@Column(nullable=false, length=40)
	private String rua;
	
	@NotBlank(message="Preencha a cidade")
	@Size(max=40, min=4)
	@Column(nullable=false, length=40)
	private String cidade;
	
	@NotBlank(message="Preencha a sigla do estado")
	@Size(max=2, min=2)
	@Column(nullable=false, length=2)
	private String estado;
	
	@NotBlank(message = "CEP é obrigatório")
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP deve estar no formato 00000-000")
	private String cep;
	

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
