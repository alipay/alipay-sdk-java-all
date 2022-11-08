package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核酸到期提醒订阅状态查询
 *
 * @author auto create
 * @since 1.0, 2022-08-31 20:20:13
 */
public class AlipayEbppIndustryNucleicremindSubscribeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2667648544755497955L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 支付宝会员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
