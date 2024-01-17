package com.test1;

public class CommandLineAccess {
	private String commandShell;
	private String publicAccess;
	private String scriptsDevelopment;
	private String openSource;
	private String otherAlternatives;
	private String serviceInteraction;
	private String isRestricted;
	private String secretAccessKey;

	public CommandLineAccess() {

	}

	public CommandLineAccess(String commandShell, String publicAccess, String scriptsDevelopment, String openSource,
			String otherAlternatives, String serviceInteraction, String isRestricted, String secretAccessKey) {
		super();
		this.commandShell = commandShell;
		this.publicAccess = publicAccess;
		this.scriptsDevelopment = scriptsDevelopment;
		this.openSource = openSource;
		this.otherAlternatives = otherAlternatives;
		this.serviceInteraction = serviceInteraction;
		this.isRestricted = isRestricted;
		this.secretAccessKey = secretAccessKey;
	}

	public String getCommandShell() {
		return commandShell;
	}

	public void setCommandShell(String commandShell) {
		this.commandShell = commandShell;
	}

	public String getPublicAccess() {
		return publicAccess;
	}

	public void setPublicAccess(String publicAccess) {
		this.publicAccess = publicAccess;
	}

	public String getScriptsDevelopment() {
		return scriptsDevelopment;
	}

	public void setScriptsDevelopment(String scriptsDevelopment) {
		this.scriptsDevelopment = scriptsDevelopment;
	}

	public String getOpenSource() {
		return openSource;
	}

	public void setOpenSource(String openSource) {
		this.openSource = openSource;
	}

	public String getOtherAlternatives() {
		return otherAlternatives;
	}

	public void setOtherAlternatives(String otherAlternatives) {
		this.otherAlternatives = otherAlternatives;
	}

	public String getServiceInteraction() {
		return serviceInteraction;
	}

	public void setServiceInteraction(String serviceInteraction) {
		this.serviceInteraction = serviceInteraction;
	}

	public String getIsRestricted() {
		return isRestricted;
	}

	public void setIsRestricted(String isRestricted) {
		this.isRestricted = isRestricted;
	}

	public String getSecretAccessKey() {
		return secretAccessKey;
	}

	public void setSecretAccessKey(String secretAccessKey) {
		this.secretAccessKey = secretAccessKey;
	}

}
