package com.test1;

public class AvailabilityZone {
	private long regionCode;
	private Integer dataCentre;
	private String azCount;
	private String minCount;
	private String maxCount;
	private String powerRedundant;
	private String networking;
	private String connectivity;
	private String noLatencyNetwork;

	public AvailabilityZone() {

	}

	public AvailabilityZone(long regionCode, Integer dataCentre, String azCount, String minCount, String maxCount,
			String powerRedundant, String networking, String connectivity, String noLatencyNetwork) {
		super();
		this.regionCode = regionCode;
		this.dataCentre = dataCentre;
		this.azCount = azCount;
		this.minCount = minCount;
		this.maxCount = maxCount;
		this.powerRedundant = powerRedundant;
		this.networking = networking;
		this.connectivity = connectivity;
		this.noLatencyNetwork = noLatencyNetwork;
	}

	public long getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(long regionCode) {
		this.regionCode = regionCode;
	}

	public Integer getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(Integer dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getAzCount() {
		return azCount;
	}

	public void setAzCount(String azCount) {
		this.azCount = azCount;
	}

	public String getMinCount() {
		return minCount;
	}

	public void setMinCount(String minCount) {
		this.minCount = minCount;
	}

	public String getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}

	public String getPowerRedundant() {
		return powerRedundant;
	}

	public void setPowerRedundant(String powerRedundant) {
		this.powerRedundant = powerRedundant;
	}

	public String getNetworking() {
		return networking;
	}

	public void setNetworking(String networking) {
		this.networking = networking;
	}

	public String getConnectivity() {
		return connectivity;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public String getNoLatencyNetwork() {
		return noLatencyNetwork;
	}

	public void setNoLatencyNetwork(String noLatencyNetwork) {
		this.noLatencyNetwork = noLatencyNetwork;
	}

}
