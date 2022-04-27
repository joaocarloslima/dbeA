package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.model.file.UploadedFile;

import br.com.fiap.dao.SetupDao;
import br.com.fiap.model.Setup;
import br.com.fiap.service.UploadService;

@Named
@RequestScoped
public class SetupBean {

	private Setup setup = new Setup();
	
	private UploadedFile image;
	
	public String save() {
		System.out.println(setup);
		
		String imagePath = UploadService.write(image, "setups");
		setup.setImagePath(imagePath);
		
		new SetupDao().create(setup);
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, 
					new FacesMessage("Setup cadastrado com sucesso"));
		
		return "setups";
	}
	
	public List<Setup> getSetups(){
		return new SetupDao().listAll();
	}

	public Setup getSetup() {
		return setup;
	}

	public void setSetup(Setup setup) {
		this.setup = setup;
	}

	public UploadedFile getImage() {
		return image;
	}

	public void setImage(UploadedFile image) {
		this.image = image;
	}

}
