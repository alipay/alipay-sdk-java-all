package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.item.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertDeliveryItemApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2828395336987679817L;

	/** 
	 * 权益详细信息：
partnerId：商户ID（用于打开手机钱包券详情）
	 */
	@ApiField("benefit_detail")
	private String benefitDetail;

	/** 
	 * 广告id对应的权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitDetail(String benefitDetail) {
		this.benefitDetail = benefitDetail;
	}
	public String getBenefitDetail( ) {
		return this.benefitDetail;
	}

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
