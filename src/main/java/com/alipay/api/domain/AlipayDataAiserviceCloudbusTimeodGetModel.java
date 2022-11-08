package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公交云OD分时接口
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:32:48
 */
public class AlipayDataAiserviceCloudbusTimeodGetModel extends AlipayObject {

	private static final long serialVersionUID = 3135668935536832939L;

	/**
	 * 接口版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 工作日和非工作日 枚举{WORKDAY,WEEKEND,ALL}
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 目的地 geohash
	 */
	@ApiField("dest_geo")
	private String destGeo;

	/**
	 * 结束时间精确到月。例如201901
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 起始区域 geohash list 。 区域必须连续，否则对结果有影响
	 */
	@ApiListField("origin_geo_hashs")
	@ApiField("string")
	private List<String> originGeoHashs;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 开始时间 精确到月 例如：201904
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

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
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

	public List<String> getOriginGeoHashs() {
		return this.originGeoHashs;
	}
	public void setOriginGeoHashs(List<String> originGeoHashs) {
		this.originGeoHashs = originGeoHashs;
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
