package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业智能服务搜索结果
 *
 * @author auto create
 * @since 1.0, 2025-01-17 17:59:17
 */
public class ServiceSearchDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 3132311563119685662L;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 由机构在政务AI开放平台上传服务时定义服务id
	 */
	@ApiField("out_data_id")
	private String outDataId;

	/**
	 * 搜索到的服务相关性分数，分数越大相关性越高。
	 */
	@ApiField("score")
	private String score;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getOutDataId() {
		return this.outDataId;
	}
	public void setOutDataId(String outDataId) {
		this.outDataId = outDataId;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
