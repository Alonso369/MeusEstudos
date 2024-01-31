package Command;

import java.io.IOException;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

public class ImportarPetsDoAbrigoCommand implements Command{

	@Override
	public void execute() {
    	try {
    		ClientHttpConfiguration client = new ClientHttpConfiguration();
        	PetService petService = new PetService(client);
			petService.importarPetsDoAbrigo();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
