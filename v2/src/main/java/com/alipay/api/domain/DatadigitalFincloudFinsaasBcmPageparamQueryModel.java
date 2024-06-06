package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交通银行浙江分行H5页面参数查询
 *
 * @author auto create
 * @since 1.0, 2023-06-25 10:31:43
 */
public class DatadigitalFincloudFinsaasBcmPageparamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5621681188931457922L;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * groovy脚本code
	 */
	@ApiField("groovy_code")
	private String groovyCode;

	/**
	 * 页面阶段
	 */
	@ApiField("page_stage")
	private String pageStage;

	/**
	 * 省份
	 */
	@ApiField("prov_name")
	private String provName;

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getGroovyCode() {
		return this.groovyCode;
	}
	public void setGroovyCode(String groovyCode) {
		this.groovyCode = groovyCode;
	}

	public String getPageStage() {
		return this.pageStage;
	}
	public void setPageStage(String pageStage) {
		this.pageStage = pageStage;
	}

	public String getProvName() {
		return this.provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}

}
