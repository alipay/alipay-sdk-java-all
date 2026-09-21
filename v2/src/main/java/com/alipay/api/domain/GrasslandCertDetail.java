package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-21 15:22:27
 */
public class GrasslandCertDetail extends AlipayObject {

	private static final long serialVersionUID = 8513552344854664596L;

	/**
	 * 证书生成时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 待种植
	 */
	@ApiField("cert_stamp")
	private String certStamp;

	/**
	 * 证书id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 展示信息
	 */
	@ApiField("display_info")
	private String displayInfo;

	/**
	 * 赞助商图标
	 */
	@ApiField("donator_image")
	private String donatorImage;

	/**
	 * 能量值，单位克(g)
	 */
	@ApiField("energy")
	private Long energy;

	/**
	 * 公益机构名称
	 */
	@ApiField("organization")
	private String organization;

	/**
	 * 公益机构图标
	 */
	@ApiField("organization_icon_url")
	private String organizationIconUrl;

	/**
	 * 种植几号林
	 */
	@ApiField("plant_place")
	private String plantPlace;

	/**
	 * 树种项目id
	 */
	@ApiField("project_id")
	private Long projectId;

	/**
	 * 项目的名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 种植地区
	 */
	@ApiField("region")
	private String region;

	/**
	 * 种植地区编码
	 */
	@ApiField("region_code")
	private String regionCode;

	/**
	 * 证书类型
	 */
	@ApiField("source")
	private String source;

	/**
	 * 树模版id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 项目模板名称
	 */
	@ApiField("tree_name")
	private String treeName;

	/**
	 * 证书子类型
	 */
	@ApiField("type")
	private String type;

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getCertStamp() {
		return this.certStamp;
	}
	public void setCertStamp(String certStamp) {
		this.certStamp = certStamp;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getDisplayInfo() {
		return this.displayInfo;
	}
	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getDonatorImage() {
		return this.donatorImage;
	}
	public void setDonatorImage(String donatorImage) {
		this.donatorImage = donatorImage;
	}

	public Long getEnergy() {
		return this.energy;
	}
	public void setEnergy(Long energy) {
		this.energy = energy;
	}

	public String getOrganization() {
		return this.organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getOrganizationIconUrl() {
		return this.organizationIconUrl;
	}
	public void setOrganizationIconUrl(String organizationIconUrl) {
		this.organizationIconUrl = organizationIconUrl;
	}

	public String getPlantPlace() {
		return this.plantPlace;
	}
	public void setPlantPlace(String plantPlace) {
		this.plantPlace = plantPlace;
	}

	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionCode() {
		return this.regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTreeName() {
		return this.treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
