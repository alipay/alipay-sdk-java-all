package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.unicard.excode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-23 11:31:41
 */
public class AlipayMarketingCampaignUnicardExcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6434396993263349667L;

	/** 
	 * 城市码，具体的城市码与城市的映射关系需要联系支付宝研发人员确定，可能与公开数据有所出入。
	 */
	@ApiField("city_code")
	private String cityCode;

	/** 
	 * 支付宝内部生成的兑换码，商家可用该兑换码作为商品出售，用户用兑换码可来支付宝兑换权益。
	 */
	@ApiField("exchange_code")
	private String exchangeCode;

	/** 
	 * 生成兑换码的过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/** 
	 * 如果无法生成兑换码，此字段列出无法生成的原因。
取值范围（字段中返回文字描述）：
1. NOT_OPEN_CITY：不在活动城市
2. SOLD_OUT：库存已售罄
3. ACTIVITY_NOT_START：活动未开始
4. ACTIVITY_ENDED：活动已结束
	 */
	@ApiField("fail_cause")
	private String failCause;

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}
	public String getExchangeCode( ) {
		return this.exchangeCode;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public Date getExpireDate( ) {
		return this.expireDate;
	}

	public void setFailCause(String failCause) {
		this.failCause = failCause;
	}
	public String getFailCause( ) {
		return this.failCause;
	}

}
