package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌绑定的官方账号详情
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:38
 */
public class BoxExclusiveServiceOpenApiInfos extends AlipayObject {

	private static final long serialVersionUID = 1822641882512539158L;

	/**
	 * 应用id
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 不可用类目id
	 */
	@ApiField("catalog_id")
	private String catalogId;

	/**
	 * 不可用类目名称
	 */
	@ApiField("catalog_name")
	private String catalogName;

	/**
	 * 服务规格编码（SP_MINI_APP/SP_PUBLIC_APP，小程序/生活号）
	 */
	@ApiField("sepc_code")
	private String sepcCode;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务logo
	 */
	@ApiField("service_logo")
	private String serviceLogo;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getCatalogId() {
		return this.catalogId;
	}
	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return this.catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getSepcCode() {
		return this.sepcCode;
	}
	public void setSepcCode(String sepcCode) {
		this.sepcCode = sepcCode;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceLogo() {
		return this.serviceLogo;
	}
	public void setServiceLogo(String serviceLogo) {
		this.serviceLogo = serviceLogo;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
