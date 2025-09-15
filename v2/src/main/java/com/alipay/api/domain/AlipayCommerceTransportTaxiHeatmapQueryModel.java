package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 巡游热力图查询接口
 *
 * @author auto create
 * @since 1.0, 2025-05-27 16:31:18
 */
public class AlipayCommerceTransportTaxiHeatmapQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8887292173246738473L;

	/**
	 * 城市代码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 企业ID
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 请求时间
	 */
	@ApiField("request_time")
	private Date requestTime;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

}
