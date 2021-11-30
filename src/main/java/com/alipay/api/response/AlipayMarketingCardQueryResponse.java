package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantCard;
import com.alipay.api.domain.PaidOuterCardExtraInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-04 14:57:47
 */
public class AlipayMarketingCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6147968272449615811L;

	/** 
	 * 商户卡信息
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	/** 
	 * 付费外卡信息，只供特定业务使用，通常接入无需关注
	 */
	@ApiField("paid_outer_card_info")
	private PaidOuterCardExtraInfoDTO paidOuterCardInfo;

	/** 
	 * 商户会员卡页面跳转到支付宝卡券详情页的pass_id，对应schema地址中的参数p，
主要用于小程序跳往会员卡详情的链接拼接
	 */
	@ApiField("pass_id")
	private String passId;

	/** 
	 * 商户会员卡页面跳转到支付宝卡券详情页面的schema地址
	 */
	@ApiField("schema_url")
	private String schemaUrl;

	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}
	public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

	public void setPaidOuterCardInfo(PaidOuterCardExtraInfoDTO paidOuterCardInfo) {
		this.paidOuterCardInfo = paidOuterCardInfo;
	}
	public PaidOuterCardExtraInfoDTO getPaidOuterCardInfo( ) {
		return this.paidOuterCardInfo;
	}

	public void setPassId(String passId) {
		this.passId = passId;
	}
	public String getPassId( ) {
		return this.passId;
	}

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}
	public String getSchemaUrl( ) {
		return this.schemaUrl;
	}

}
