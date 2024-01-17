package com.test1;

public class GloabalServices {
	private long serviceId;
	private String serviceCode;
	private String name;
	private boolean identityManagement;
	private boolean accessManagement;
	private String dnsService;
	private String contentDeliveryNetwork;
	private String webApplicationFirewall;
	private String cloudFront;
	private String speedyRoute;
	private boolean isAvailable;

	public GloabalServices() {

	}

	public GloabalServices(long serviceId, String serviceCode, String name, boolean identityManagement,
			boolean accessManagement, String dnsService, String contentDeliveryNetwork, String webApplicationFirewall,
			String cloudFront, String speedyRoute, boolean isAvailable) {
		super();
		this.serviceId = serviceId;
		this.serviceCode = serviceCode;
		this.name = name;
		this.identityManagement = identityManagement;
		this.accessManagement = accessManagement;
		this.dnsService = dnsService;
		this.contentDeliveryNetwork = contentDeliveryNetwork;
		this.webApplicationFirewall = webApplicationFirewall;
		this.cloudFront = cloudFront;
		this.speedyRoute = speedyRoute;
		this.isAvailable = isAvailable;
	}

	public long getServiceId() {
		return serviceId;
	}

	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIdentityManagement() {
		return identityManagement;
	}

	public void setIdentityManagement(boolean identityManagement) {
		this.identityManagement = identityManagement;
	}

	public boolean isAccessManagement() {
		return accessManagement;
	}

	public void setAccessManagement(boolean accessManagement) {
		this.accessManagement = accessManagement;
	}

	public String getDnsService() {
		return dnsService;
	}

	public void setDnsService(String dnsService) {
		this.dnsService = dnsService;
	}

	public String getContentDeliveryNetwork() {
		return contentDeliveryNetwork;
	}

	public void setContentDeliveryNetwork(String contentDeliveryNetwork) {
		this.contentDeliveryNetwork = contentDeliveryNetwork;
	}

	public String getWebApplicationFirewall() {
		return webApplicationFirewall;
	}

	public void setWebApplicationFirewall(String webApplicationFirewall) {
		this.webApplicationFirewall = webApplicationFirewall;
	}

	public String getCloudFront() {
		return cloudFront;
	}

	public void setCloudFront(String cloudFront) {
		this.cloudFront = cloudFront;
	}

	public String getSpeedyRoute() {
		return speedyRoute;
	}

	public void setSpeedyRoute(String speedyRoute) {
		this.speedyRoute = speedyRoute;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
