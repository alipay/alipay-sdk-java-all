package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝健康码查询
 *
 * @author auto create
 * @since 1.0, 2020-04-21 13:49:53
 */
public class AlipayEbppIndustryGovHealthcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1628432714423865735L;

	/**
	 * json格式的业务相关信息, 因健康码不同的省市存在个性化的业务参数需求，在本字段内传入
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 业务类型，医护天使码: MEDIC_ANGEL; 健康码: HEALTHCODE。为空时默认为健康码HEALTHCODE
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

}
