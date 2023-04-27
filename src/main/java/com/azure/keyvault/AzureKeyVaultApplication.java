package com.azure.keyvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.security.keyvault.secrets.SecretClient;

@SpringBootApplication
public class AzureKeyVaultApplication implements CommandLineRunner {
	
	@Autowired
	private SecretClient secretClient;

	public static void main(String[] args) {
		SpringApplication.run(AzureKeyVaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("h2url: " + secretClient.getSecret("h2url").getValue());
        System.out.println("sql-username: " + secretClient.getSecret("sql-username").getValue());
        System.out.println("sql-password: " + secretClient.getSecret("sql-password").getValue());

		
	}

}
