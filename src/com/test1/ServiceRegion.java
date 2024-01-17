package com.test1;

public class ServiceRegion {
	private String dataCentre;
	private String centreCode;
	private String clusterCode;
	private String scope;
	private Integer dataGovernance;
	private Integer legalCompliance;
	private String proximity;
	private String availableConsumers;
	private String pricing;
	private String explicitPermission;

	public ServiceRegion() {

	}

	public ServiceRegion(String dataCentre, String centreCode, String clusterCode, String scope, Integer dataGovernance,
			Integer legalCompliance, String proximity, String availableConsumers, String pricing,
			String explicitPermission) {
		super();
		this.dataCentre = dataCentre;
		this.centreCode = centreCode;
		this.clusterCode = clusterCode;
		this.scope = scope;
		this.dataGovernance = dataGovernance;
		this.legalCompliance = legalCompliance;
		this.proximity = proximity;
		this.availableConsumers = availableConsumers;
		this.pricing = pricing;
		this.explicitPermission = explicitPermission;
	}

	public String getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(String dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getCentreCode() {
		return centreCode;
	}

	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}

	public String getClusterCode() {
		return clusterCode;
	}

	public void setClusterCode(String clusterCode) {
		this.clusterCode = clusterCode;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Integer getDataGovernance() {
		return dataGovernance;
	}

	public void setDataGovernance(Integer dataGovernance) {
		this.dataGovernance = dataGovernance;
	}

	public Integer getLegalCompliance() {
		return legalCompliance;
	}

	public void setLegalCompliance(Integer legalCompliance) {
		this.legalCompliance = legalCompliance;
	}

	public String getProximity() {
		return proximity;
	}

	public void setProximity(String proximity) {
		this.proximity = proximity;
	}

	public String getAvailableConsumers() {
		return availableConsumers;
	}

	public void setAvailableConsumers(String availableConsumers) {
		this.availableConsumers = availableConsumers;
	}

	public String getPricing() {
		return pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

	public String getExplicitPermission() {
		return explicitPermission;
	}

	public void setExplicitPermission(String explicitPermission) {
		this.explicitPermission = explicitPermission;
	}

}
