package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 橡实平台版本信息对象
 *
 * @author auto create
 * @since 1.0, 2022-06-08 17:47:42
 */
public class IterationVersionInfoDeliverObj extends AlipayObject {

	private static final long serialVersionUID = 1766283785232333277L;

	/**
	 * 验收用例
	 */
	@ApiField("acceptance_use_case")
	private String acceptanceUseCase;

	/**
	 * 发布日期
	 */
	@ApiField("actual_release_time")
	private String actualReleaseTime;

	/**
	 * 需求详情
	 */
	@ApiField("aone_linke")
	private String aoneLinke;

	/**
	 * 部署形态
	 */
	@ApiField("deploy_type")
	private String deployType;

	/**
	 * 开发指南
	 */
	@ApiField("development_guide")
	private String developmentGuide;

	/**
	 * 其他文档
	 */
	@ApiField("else_info")
	private String elseInfo;

	/**
	 * 停止维护日期
	 */
	@ApiField("eom")
	private String eom;

	/**
	 * 停止支持日期
	 */
	@ApiField("eos")
	private String eos;

	/**
	 * 功能测试报告
	 */
	@ApiField("functional_test_report")
	private String functionalTestReport;

	/**
	 * 版本信息表的主键id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 重点需求
	 */
	@ApiField("key_needs")
	private String keyNeeds;

	/**
	 * L2名称
	 */
	@ApiField("l_2")
	private String l2;

	/**
	 * L3名称
	 */
	@ApiField("l_3")
	private String l3;

	/**
	 * 商业中台code
	 */
	@ApiField("l_3_code")
	private String l3Code;

	/**
	 * 性能测试报告
	 */
	@ApiField("performance_test_report")
	private String performanceTestReport;

	/**
	 * 需求规格说明书（或PRD）/产品白皮书
	 */
	@ApiField("product_white_paper")
	private String productWhitePaper;

	/**
	 * releaseNote
	 */
	@ApiField("release_note")
	private String releaseNote;

	/**
	 * 安全白皮书|报告
	 */
	@ApiField("security_white_paper")
	private String securityWhitePaper;

	/**
	 * 系统设计说明书（系分）/技术白皮书
	 */
	@ApiField("sys_design_specification")
	private String sysDesignSpecification;

	/**
	 * 系统安装部署手册
	 */
	@ApiField("sys_installation_and_deployment_manual")
	private String sysInstallationAndDeploymentManual;

	/**
	 * 系统安装包|镜像
	 */
	@ApiField("sys_installation_package")
	private String sysInstallationPackage;

	/**
	 * 系统运维手册
	 */
	@ApiField("sys_operation_and_maintenance_manual")
	private String sysOperationAndMaintenanceManual;

	/**
	 * 技术白皮书
	 */
	@ApiField("tech_white_paper")
	private String techWhitePaper;

	/**
	 * 用户手册
	 */
	@ApiField("user_manual")
	private String userManual;

	/**
	 * 版本下载
	 */
	@ApiField("version_download")
	private String versionDownload;

	/**
	 * 版本号
	 */
	@ApiField("version_num")
	private String versionNum;

	/**
	 * 版本状态
	 */
	@ApiField("version_status")
	private String versionStatus;

	/**
	 * 版本类型
	 */
	@ApiField("version_type")
	private String versionType;

	public String getAcceptanceUseCase() {
		return this.acceptanceUseCase;
	}
	public void setAcceptanceUseCase(String acceptanceUseCase) {
		this.acceptanceUseCase = acceptanceUseCase;
	}

	public String getActualReleaseTime() {
		return this.actualReleaseTime;
	}
	public void setActualReleaseTime(String actualReleaseTime) {
		this.actualReleaseTime = actualReleaseTime;
	}

	public String getAoneLinke() {
		return this.aoneLinke;
	}
	public void setAoneLinke(String aoneLinke) {
		this.aoneLinke = aoneLinke;
	}

	public String getDeployType() {
		return this.deployType;
	}
	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}

	public String getDevelopmentGuide() {
		return this.developmentGuide;
	}
	public void setDevelopmentGuide(String developmentGuide) {
		this.developmentGuide = developmentGuide;
	}

	public String getElseInfo() {
		return this.elseInfo;
	}
	public void setElseInfo(String elseInfo) {
		this.elseInfo = elseInfo;
	}

	public String getEom() {
		return this.eom;
	}
	public void setEom(String eom) {
		this.eom = eom;
	}

	public String getEos() {
		return this.eos;
	}
	public void setEos(String eos) {
		this.eos = eos;
	}

	public String getFunctionalTestReport() {
		return this.functionalTestReport;
	}
	public void setFunctionalTestReport(String functionalTestReport) {
		this.functionalTestReport = functionalTestReport;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyNeeds() {
		return this.keyNeeds;
	}
	public void setKeyNeeds(String keyNeeds) {
		this.keyNeeds = keyNeeds;
	}

	public String getL2() {
		return this.l2;
	}
	public void setL2(String l2) {
		this.l2 = l2;
	}

	public String getL3() {
		return this.l3;
	}
	public void setL3(String l3) {
		this.l3 = l3;
	}

	public String getL3Code() {
		return this.l3Code;
	}
	public void setL3Code(String l3Code) {
		this.l3Code = l3Code;
	}

	public String getPerformanceTestReport() {
		return this.performanceTestReport;
	}
	public void setPerformanceTestReport(String performanceTestReport) {
		this.performanceTestReport = performanceTestReport;
	}

	public String getProductWhitePaper() {
		return this.productWhitePaper;
	}
	public void setProductWhitePaper(String productWhitePaper) {
		this.productWhitePaper = productWhitePaper;
	}

	public String getReleaseNote() {
		return this.releaseNote;
	}
	public void setReleaseNote(String releaseNote) {
		this.releaseNote = releaseNote;
	}

	public String getSecurityWhitePaper() {
		return this.securityWhitePaper;
	}
	public void setSecurityWhitePaper(String securityWhitePaper) {
		this.securityWhitePaper = securityWhitePaper;
	}

	public String getSysDesignSpecification() {
		return this.sysDesignSpecification;
	}
	public void setSysDesignSpecification(String sysDesignSpecification) {
		this.sysDesignSpecification = sysDesignSpecification;
	}

	public String getSysInstallationAndDeploymentManual() {
		return this.sysInstallationAndDeploymentManual;
	}
	public void setSysInstallationAndDeploymentManual(String sysInstallationAndDeploymentManual) {
		this.sysInstallationAndDeploymentManual = sysInstallationAndDeploymentManual;
	}

	public String getSysInstallationPackage() {
		return this.sysInstallationPackage;
	}
	public void setSysInstallationPackage(String sysInstallationPackage) {
		this.sysInstallationPackage = sysInstallationPackage;
	}

	public String getSysOperationAndMaintenanceManual() {
		return this.sysOperationAndMaintenanceManual;
	}
	public void setSysOperationAndMaintenanceManual(String sysOperationAndMaintenanceManual) {
		this.sysOperationAndMaintenanceManual = sysOperationAndMaintenanceManual;
	}

	public String getTechWhitePaper() {
		return this.techWhitePaper;
	}
	public void setTechWhitePaper(String techWhitePaper) {
		this.techWhitePaper = techWhitePaper;
	}

	public String getUserManual() {
		return this.userManual;
	}
	public void setUserManual(String userManual) {
		this.userManual = userManual;
	}

	public String getVersionDownload() {
		return this.versionDownload;
	}
	public void setVersionDownload(String versionDownload) {
		this.versionDownload = versionDownload;
	}

	public String getVersionNum() {
		return this.versionNum;
	}
	public void setVersionNum(String versionNum) {
		this.versionNum = versionNum;
	}

	public String getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

	public String getVersionType() {
		return this.versionType;
	}
	public void setVersionType(String versionType) {
		this.versionType = versionType;
	}

}
