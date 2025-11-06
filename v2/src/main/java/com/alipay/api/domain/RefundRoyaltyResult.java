package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退分润结果
 *
 * @author auto create
 * @since 1.0, 2024-04-16 14:15:26
 */
public class RefundRoyaltyResult extends AlipayObject {

	private static final long serialVersionUID = 5462878678219257393L;

	/**
	 * 商户请求的转入账号
	 */
	@ApiField("ori_trans_in")
	private String oriTransIn;

	/**
	 * 商户请求的转出账号
	 */
	@ApiField("ori_trans_out")
	private String oriTransOut;

	/**
	 * 退分账金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退分账结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 分账类型.
字段为空默认为普通分账类型transfer
	 */
	@ApiField("royalty_type")
	private String royaltyType;

	/**
	 * 转入人支付宝账号对应用户ID
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 转入人支付宝账号
	 */
	@ApiField("trans_in_email")
	private String transInEmail;

	/**
	 * 转出人支付宝账号对应用户ID
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 转出人支付宝账号
	 */
	@ApiField("trans_out_email")
	private String transOutEmail;

	public String getOriTransIn() {
		return this.oriTransIn;
	}
	public void setOriTransIn(String oriTransIn) {
		this.oriTransIn = oriTransIn;
	}

	public String getOriTransOut() {
		return this.oriTransOut;
	}
	public void setOriTransOut(String oriTransOut) {
		this.oriTransOut = oriTransOut;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRoyaltyType() {
		return this.royaltyType;
	}
	public void setRoyaltyType(String royaltyType) {
		this.royaltyType = royaltyType;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInEmail() {
		return this.transInEmail;
	}
	public void setTransInEmail(String transInEmail) {
		this.transInEmail = transInEmail;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	public String getTransOutEmail() {
		return this.transOutEmail;
	}
	public void setTransOutEmail(String transOutEmail) {
		this.transOutEmail = transOutEmail;
	}

}
