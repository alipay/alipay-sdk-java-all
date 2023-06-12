package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FamilyPayCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.paysharingprod.familypay.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 21:56:57
 */
public class AlipayPayAppPaysharingprodFamilypayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1852292833674167712L;

	/** 
	 * 指定查询卡时返回该字段
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
