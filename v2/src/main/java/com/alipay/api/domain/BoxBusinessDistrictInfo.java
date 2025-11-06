package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈信息
 *
 * @author auto create
 * @since 1.0, 2025-02-11 14:58:51
 */
public class BoxBusinessDistrictInfo extends AlipayObject {

	private static final long serialVersionUID = 8748372555776759147L;

	/**
	 * 应用名
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 商圈ID
	 */
	@ApiField("business_district_id")
	private String businessDistrictId;

	/**
	 * 商圈名称
	 */
	@ApiField("business_district_name")
	private String businessDistrictName;

	/**
	 * 商圈所属小程序对应的服务编码
	 */
	@ApiField("relate_appid")
	private String relateAppid;

	/**
	 * 商圈所属小程序对应的服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBusinessDistrictId() {
		return this.businessDistrictId;
	}
	public void setBusinessDistrictId(String businessDistrictId) {
		this.businessDistrictId = businessDistrictId;
	}

	public String getBusinessDistrictName() {
		return this.businessDistrictName;
	}
	public void setBusinessDistrictName(String businessDistrictName) {
		this.businessDistrictName = businessDistrictName;
	}

	public String getRelateAppid() {
		return this.relateAppid;
	}
	public void setRelateAppid(String relateAppid) {
		this.relateAppid = relateAppid;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
