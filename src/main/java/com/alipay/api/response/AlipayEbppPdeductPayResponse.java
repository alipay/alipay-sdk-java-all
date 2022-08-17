package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:17:22
 */
public class AlipayEbppPdeductPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 3685988381311488917L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝订单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 扩展参数
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 商户代扣业务流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 针对于支付失败时，给的对应错误明细，如果判断外围的错误码是INVOKE_PAYACCEPTANCE_EXCEPTION需要近一步再结合着结果模型中的result_code, result_msg来判断
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 订单支付状态。
0：未知
1：成功
2：失败
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
