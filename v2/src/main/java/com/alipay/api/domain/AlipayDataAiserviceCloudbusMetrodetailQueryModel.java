package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智慧公交--地铁OD对详情
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:35:26
 */
public class AlipayDataAiserviceCloudbusMetrodetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2216729725283977236L;

	/**
	 * 版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 6位目的地geohash
	 */
	@ApiField("dest_geo")
	private String destGeo;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 进出站 0：进站  1：出站
	 */
	@ApiField("is_out")
	private Long isOut;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 开始年月
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 站点id
	 */
	@ApiField("station_id")
	private String stationId;

	/**
	 * 操作类型： 0：普通（默认）  1：潜在
	 */
	@ApiField("type")
	private Long type;

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

	public String getDestGeo() {
		return this.destGeo;
	}
	public void setDestGeo(String destGeo) {
		this.destGeo = destGeo;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getIsOut() {
		return this.isOut;
	}
	public void setIsOut(Long isOut) {
		this.isOut = isOut;
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

	public String getStationId() {
		return this.stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
