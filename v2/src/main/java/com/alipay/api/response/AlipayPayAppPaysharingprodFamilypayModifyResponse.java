package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FamilyPayCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.paysharingprod.familypay.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:51:54
 */
public class AlipayPayAppPaysharingprodFamilypayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2628457282597674864L;

	/** 
	 * 亲情卡信息
	 */
	@ApiField("card_info")
	private FamilyPayCardInfo cardInfo;

	public void setCardInfo(FamilyPayCardInfo cardInfo) {
		this.cardInfo = cardInfo;
	}
	public FamilyPayCardInfo getCardInfo( ) {
		return this.cardInfo;
	}

}
