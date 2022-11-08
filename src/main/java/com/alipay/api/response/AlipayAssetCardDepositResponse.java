package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.card.deposit response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-12 19:37:31
 */
public class AlipayAssetCardDepositResponse extends AlipayResponse {

	private static final long serialVersionUID = 2574434386958451577L;

	/** 
	 * 扩展属性，json格式。
KEY:VcpExtendInfoKeyEnum.BIZ_FUND_ORDER_ID bizFund的订单ID
KEY:VcpExtendInfoKeyEnum.BIZ_FUND_CASHIER_ORDER_ID 收银台订单ID
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/** 
	 * 充值交易号
	 */
	@ApiField("recharge_no")
	private String rechargeNo;

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getExtendInfo( ) {
		return this.extendInfo;
	}

	public void setRechargeNo(String rechargeNo) {
		this.rechargeNo = rechargeNo;
	}
	public String getRechargeNo( ) {
		return this.rechargeNo;
	}

}
