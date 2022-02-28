package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.entrust.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-04 21:00:20
 */
public class AlipayFundTransEntrustQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4736436271381433787L;

	/** 
	 * 该笔委托支付在支付宝系统内部的单据ID
	 */
	@ApiField("entrust_order_id")
	private String entrustOrderId;

	/** 
	 * 商户端的唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 委托扣款剩余可打款金额
	 */
	@ApiField("rest_tranfer_amount")
	private String restTranferAmount;

	/** 
	 * INIT，表示委托支付单据已经受理
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 委托扣款累计扣款金额
	 */
	@ApiField("total_deduct_amount")
	private String totalDeductAmount;

	/** 
	 * 委托支付订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public void setEntrustOrderId(String entrustOrderId) {
		this.entrustOrderId = entrustOrderId;
	}
	public String getEntrustOrderId( ) {
		return this.entrustOrderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setRestTranferAmount(String restTranferAmount) {
		this.restTranferAmount = restTranferAmount;
	}
	public String getRestTranferAmount( ) {
		return this.restTranferAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalDeductAmount(String totalDeductAmount) {
		this.totalDeductAmount = totalDeductAmount;
	}
	public String getTotalDeductAmount( ) {
		return this.totalDeductAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransAmount( ) {
		return this.transAmount;
	}

}
