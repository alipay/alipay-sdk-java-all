package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.account.subvirtualcard.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:36
 */
public class MybankPaymentTradeAccountSubvirtualcardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1462513723825681495L;

	/** 
	 * 卖家主卡号，同请求参数。
	 */
	@ApiField("prim_card_no")
	private String primCardNo;

	/** 
	 * 卖家子卡号户名（目前与卖家主卡户名一致）
	 */
	@ApiField("sub_virtual_card_name")
	private String subVirtualCardName;

	/** 
	 * 新创建的子卡号，买家可以向此卡号转账。子卡号户名与主卡号户名一致。
	 */
	@ApiField("sub_virtual_card_no")
	private String subVirtualCardNo;

	public void setPrimCardNo(String primCardNo) {
		this.primCardNo = primCardNo;
	}
	public String getPrimCardNo( ) {
		return this.primCardNo;
	}

	public void setSubVirtualCardName(String subVirtualCardName) {
		this.subVirtualCardName = subVirtualCardName;
	}
	public String getSubVirtualCardName( ) {
		return this.subVirtualCardName;
	}

	public void setSubVirtualCardNo(String subVirtualCardNo) {
		this.subVirtualCardNo = subVirtualCardNo;
	}
	public String getSubVirtualCardNo( ) {
		return this.subVirtualCardNo;
	}

}
