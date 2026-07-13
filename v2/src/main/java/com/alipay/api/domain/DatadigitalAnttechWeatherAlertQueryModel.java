package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 极端天气预警查询请求
 *
 * @author auto create
 * @since 1.0, 2026-07-08 12:17:56
 */
public class DatadigitalAnttechWeatherAlertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7614191966745939664L;

	/**
	 * 蚂蚁数科气象服务产品码，找蚂蚁数科运营同学获取
	 */
	@ApiField("agreement_code")
	private String agreementCode;

	/**
	 * 纬度，表示地理位置的纬度坐标，单位为度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度，表示地理位置的经度坐标，单位为度。
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 请求 ID
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAgreementCode() {
		return this.agreementCode;
	}
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
