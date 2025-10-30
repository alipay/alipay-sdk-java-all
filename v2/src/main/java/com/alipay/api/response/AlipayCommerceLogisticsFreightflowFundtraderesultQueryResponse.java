package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.freightflow.fundtraderesult.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 19:17:31
 */
public class AlipayCommerceLogisticsFreightflowFundtraderesultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1187739619164861131L;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 支付方式
	 */
	@ApiField("pay_asset_type")
	private String payAssetType;

	/** 
	 * 订单状态(无错误码返回时必填)
	 */
	@ApiField("pay_status")
	private String payStatus;

	/** 
	 * 收方id
	 */
	@ApiField("payee_id")
	private String payeeId;

	/** 
	 * 付方姓名
	 */
	@ApiField("payer_name")
	private String payerName;

	/** 
	 * 订单总金额,单位:分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setPayAssetType(String payAssetType) {
		this.payAssetType = payAssetType;
	}
	public String getPayAssetType( ) {
		return this.payAssetType;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getPayStatus( ) {
		return this.payStatus;
	}

	public void setPayeeId(String payeeId) {
		this.payeeId = payeeId;
	}
	public String getPayeeId( ) {
		return this.payeeId;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerName( ) {
		return this.payerName;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
