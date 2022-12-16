package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * bpaas服务类型
 *
 * @author auto create
 * @since 1.0, 2021-03-22 09:57:31
 */
public class BPaaSServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 6552966379296823876L;

	/**
	 * 服务demo下载地址
	 */
	@ApiField("demo_link")
	private String demoLink;

	/**
	 * 服务文档地址
	 */
	@ApiField("doc_link")
	private String docLink;

	/**
	 * 是否需要签约
	 */
	@ApiField("if_sign")
	private Boolean ifSign;

	/**
	 * 开发类型，枚举值 public \  direct
	 */
	@ApiField("open_type")
	private String openType;

	/**
	 * 服务code
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务ID
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务类型
"PAY", "支付账单"
"FLOW_REALIZE", "流量变现"
"USER_OPERATE", "用户运营"
"CONTENT_OPERATE", "内容运营"
"DATE_SERVICE", "数据服务"
"FINANCE_SERVICE", "金融服务"
"MANAGERMENT", "经营管理"
"OTHER", "其他"
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务版本
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 服务简介
	 */
	@ApiField("slogan")
	private String slogan;

	public String getDemoLink() {
		return this.demoLink;
	}
	public void setDemoLink(String demoLink) {
		this.demoLink = demoLink;
	}

	public String getDocLink() {
		return this.docLink;
	}
	public void setDocLink(String docLink) {
		this.docLink = docLink;
	}

	public Boolean getIfSign() {
		return this.ifSign;
	}
	public void setIfSign(Boolean ifSign) {
		this.ifSign = ifSign;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

}
