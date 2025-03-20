package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.cardinfo.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 02:11:47
 */
public class AlipayFinancialnetAuthCardinfoCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 2273882695351675421L;

	/** 
	 * 入参开启卡bin校验时，卡bin校验结果的发卡机构
	 */
	@ApiField("bank")
	private String bank;

	/** 
	 * 缓存卡信息到缓存后的key值
	 */
	@ApiField("cache_key")
	private String cacheKey;

	/** 
	 * 如果开启卡bin校验该值为卡bin校验结果中的卡类型（信用卡/借记卡）
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 如果入参开启卡bin校验该值为卡bin校验结果
	 */
	@ApiField("validated")
	private Boolean validated;

	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank( ) {
		return this.bank;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
	}
	public String getCacheKey( ) {
		return this.cacheKey;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setValidated(Boolean validated) {
		this.validated = validated;
	}
	public Boolean getValidated( ) {
		return this.validated;
	}

}
