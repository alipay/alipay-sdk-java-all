package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公交OD7位od对。
 *
 * @author auto create
 * @since 1.0, 2019-07-31 19:51:09
 */
public class AlipayDataAiserviceCloudbusOridestodGetModel extends AlipayObject {

	private static final long serialVersionUID = 4675453684118595125L;

	/**
	 * 内部接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 目的geo 列表
	 */
	@ApiListField("dest_geo")
	@ApiField("string")
	private List<String> destGeo;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 起始geohash
	 */
	@ApiListField("ori_geo")
	@ApiField("string")
	private List<String> oriGeo;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public List<String> getDestGeo() {
		return this.destGeo;
	}
	public void setDestGeo(List<String> destGeo) {
		this.destGeo = destGeo;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public List<String> getOriGeo() {
		return this.oriGeo;
	}
	public void setOriGeo(List<String> oriGeo) {
		this.oriGeo = oriGeo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
