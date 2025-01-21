package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务信息
 *
 * @author auto create
 * @since 1.0, 2020-07-27 11:22:40
 */
public class ServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 7779274519253625175L;

	/**
	 * 支付宝端内地址
	 */
	@ApiField("alipay_url")
	private String alipayUrl;

	/**
	 * 服务审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 业务来源
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 服务简介
	 */
	@ApiField("detail_desc")
	private String detailDesc;

	/**
	 * 服务颗粒度
	 */
	@ApiField("granularity_type")
	private String granularityType;

	/**
	 * 服务关键词
	 */
	@ApiListField("key_words")
	@ApiField("string")
	private List<String> keyWords;

	/**
	 * logo的CDN地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 服务主状态
	 */
	@ApiField("major_status")
	private String majorStatus;

	/**
	 * 服务归属的小程序ID
	 */
	@ApiField("ref_app_id")
	private String refAppId;

	/**
	 * 服务归属的父服务编码
	 */
	@ApiField("ref_service_code")
	private String refServiceCode;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务简单描述
	 */
	@ApiField("simple_desc")
	private String simpleDesc;

	/**
	 * 服务提供方ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 服务提供方类型
	 */
	@ApiField("supplier_type")
	private String supplierType;

	public String getAlipayUrl() {
		return this.alipayUrl;
	}
	public void setAlipayUrl(String alipayUrl) {
		this.alipayUrl = alipayUrl;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getDetailDesc() {
		return this.detailDesc;
	}
	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public String getGranularityType() {
		return this.granularityType;
	}
	public void setGranularityType(String granularityType) {
		this.granularityType = granularityType;
	}

	public List<String> getKeyWords() {
		return this.keyWords;
	}
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMajorStatus() {
		return this.majorStatus;
	}
	public void setMajorStatus(String majorStatus) {
		this.majorStatus = majorStatus;
	}

	public String getRefAppId() {
		return this.refAppId;
	}
	public void setRefAppId(String refAppId) {
		this.refAppId = refAppId;
	}

	public String getRefServiceCode() {
		return this.refServiceCode;
	}
	public void setRefServiceCode(String refServiceCode) {
		this.refServiceCode = refServiceCode;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSimpleDesc() {
		return this.simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierType() {
		return this.supplierType;
	}
	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

}
