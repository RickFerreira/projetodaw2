package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class MontagemDeComputador {

	@ManyToOne
	@JoinColumn(name = "id_cpu_pc")
	private Peca cpu;
	@ManyToOne
	@JoinColumn(name = "id_placamae_pc")
	private Peca placaMae;
	@ManyToOne
	@JoinColumn(name = "id_ram_pc")
	private Peca ram;
	@ManyToOne
	@JoinColumn(name = "id_hd_pc")
	private Peca hd;
	@ManyToOne
	@JoinColumn(name = "id_video_pc")
	private Peca video;
	@ManyToOne
	@JoinColumn(name = "id_peca_fonte")
	private Peca fonte;
	private double precoTotal;
	private String nome;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "montagemPc_seq_gen")
	@SequenceGenerator(name = "montagemPc_seq_gen", sequenceName = "montagemPc_id_seq")
	private int id;
	private int quantCpu;
	private int quantPlaM;
	private int quantRam;
	private int quantHd;
	private int quantVideo;
	private int quantFonte;

	public Peca getCpu() {
		return cpu;
	}

	public void setCpu(Peca cpu) {
		this.cpu = cpu;
	}

	public Peca getRam() {
		return ram;
	}

	public void setRam(Peca ram) {
		this.ram = ram;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public Peca getHd() {
		return hd;
	}

	public void setHd(Peca hd) {
		this.hd = hd;
	}

	public Peca getVideo() {
		return video;
	}

	public void setVideo(Peca video) {
		this.video = video;
	}

	public Peca getFonte() {
		return fonte;
	}

	public void setFonte(Peca fonte) {
		this.fonte = fonte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MontagemDeComputador() {
		super();
	}

	public Peca getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(Peca placaMae) {
		this.placaMae = placaMae;
	}

	public int getQuantCpu() {
		return quantCpu;
	}

	public void setQuantCpu(int quantCpu) {
		this.quantCpu = quantCpu;
	}

	public int getQuantPlaM() {
		return quantPlaM;
	}

	public void setQuantPlaM(int quantPlaM) {
		this.quantPlaM = quantPlaM;
	}

	public int getQuantRam() {
		return quantRam;
	}

	public void setQuantRam(int quantRam) {
		this.quantRam = quantRam;
	}

	public int getQuantHd() {
		return quantHd;
	}

	public void setQuantHd(int quantHd) {
		this.quantHd = quantHd;
	}

	public int getQuantVideo() {
		return quantVideo;
	}

	public void setQuantVideo(int quantVideo) {
		this.quantVideo = quantVideo;
	}

	public int getQuantFonte() {
		return quantFonte;
	}

	public void setQuantFonte(int quantFonte) {
		this.quantFonte = quantFonte;
	}
}