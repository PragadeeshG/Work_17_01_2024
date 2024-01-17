package com.test1;

public class RegionScoped {
	private long serviceId;
	private String serviceCode;
	private String name;
	private String ec2Instance;
	private String beanstalk;
	private String lambda;
	private String softwareAsService;
	private String hardwareAsService;
	private String performanceMonitoring;

	public RegionScoped() {

	}

	public RegionScoped(long serviceId, String serviceCode, String name, String ec2Instance, String beanstalk,
			String lambda, String softwareAsService, String hardwareAsService, String performanceMonitoring) {
		super();
		this.serviceId = serviceId;
		this.serviceCode = serviceCode;
		this.name = name;
		this.ec2Instance = ec2Instance;
		this.beanstalk = beanstalk;
		this.lambda = lambda;
		this.softwareAsService = softwareAsService;
		this.hardwareAsService = hardwareAsService;
		this.performanceMonitoring = performanceMonitoring;
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

	public String getEc2Instance() {
		return ec2Instance;
	}

	public void setEc2Instance(String ec2Instance) {
		this.ec2Instance = ec2Instance;
	}

	public String getBeanstalk() {
		return beanstalk;
	}

	public void setBeanstalk(String beanstalk) {
		this.beanstalk = beanstalk;
	}

	public String getLambda() {
		return lambda;
	}

	public void setLambda(String lambda) {
		this.lambda = lambda;
	}

	public String getSoftwareAsService() {
		return softwareAsService;
	}

	public void setSoftwareAsService(String softwareAsService) {
		this.softwareAsService = softwareAsService;
	}

	public String getHardwareAsService() {
		return hardwareAsService;
	}

	public void setHardwareAsService(String hardwareAsService) {
		this.hardwareAsService = hardwareAsService;
	}

	public String getPerformanceMonitoring() {
		return performanceMonitoring;
	}

	public void setPerformanceMonitoring(String performanceMonitoring) {
		this.performanceMonitoring = performanceMonitoring;
	}

}
