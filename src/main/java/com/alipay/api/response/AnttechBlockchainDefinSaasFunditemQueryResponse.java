package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.saas.funditem.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-25 21:01:50
 */
public class AnttechBlockchainDefinSaasFunditemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4176466533251743585L;

	/** 
	 * 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
	 */
	@ApiField("fund_type")
	private String fundType;

	/** 
	 * 外部业务平台原始交易号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 外部请求ID
	 */
	@ApiField("out_request_id")
	private String outRequestId;

	/** 
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	/** 
	 * 本次请求金额，单位为元。
	 */
	@ApiField("request_amount")
	private String requestAmount;

	/** 
	 * 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
	 */
	@ApiField("request_currency")
	private String requestCurrency;

	/** 
	 * 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
	 */
	@ApiField("state")
	private String state;

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getFundType( ) {
		return this.fundType;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setOutRequestId(String outRequestId) {
		this.outRequestId = outRequestId;
	}
	public String getOutRequestId( ) {
		return this.outRequestId;
	}

	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}
	public String getPlatformMemberId( ) {
		return this.platformMemberId;
	}

	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}
	public String getRequestAmount( ) {
		return this.requestAmount;
	}

	public void setRequestCurrency(String requestCurrency) {
		this.requestCurrency = requestCurrency;
	}
	public String getRequestCurrency( ) {
		return this.requestCurrency;
	}

	public void setState(String state) {
		this.state = state;
	}
	public String getState( ) {
		return this.state;
	}

}
