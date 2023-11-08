package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FamilyPayCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.paysharingprod.familypay.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:16:42
 */
public class AlipayPayAppPaysharingprodFamilypayModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3816893276611972172L;

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
