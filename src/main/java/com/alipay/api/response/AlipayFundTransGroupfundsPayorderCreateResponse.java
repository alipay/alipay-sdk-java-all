package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.groupfunds.payorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:56
 */
public class AlipayFundTransGroupfundsPayorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1268246458695564832L;

	/** 
	 * 业务类型,客户端透传给收银台。默认值：biz_account_transfer
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 付款实际关联的订单号，小程序唤起收银台后传入进行支付
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
