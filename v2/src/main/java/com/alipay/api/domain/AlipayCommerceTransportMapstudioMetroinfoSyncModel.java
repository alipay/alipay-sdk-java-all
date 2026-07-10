package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 地铁线路指标数据同步
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:41:16
 */
public class AlipayCommerceTransportMapstudioMetroinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7327966195218514991L;

	/**
	 * 城市区域编码，例如南京：320100
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 地铁基础信息
	 */
	@ApiListField("metro_info_details")
	@ApiField("metro_info_object")
	private List<MetroInfoObject> metroInfoDetails;

	/**
	 * 地铁月份，格式 YYYYMM，如 "202509"
	 */
	@ApiField("metro_month")
	private String metroMonth;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<MetroInfoObject> getMetroInfoDetails() {
		return this.metroInfoDetails;
	}
	public void setMetroInfoDetails(List<MetroInfoObject> metroInfoDetails) {
		this.metroInfoDetails = metroInfoDetails;
	}

	public String getMetroMonth() {
		return this.metroMonth;
	}
	public void setMetroMonth(String metroMonth) {
		this.metroMonth = metroMonth;
	}

}
