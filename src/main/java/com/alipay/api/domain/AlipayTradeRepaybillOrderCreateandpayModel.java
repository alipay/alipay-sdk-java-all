package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易还款账单付款单创建并支付接口
 *
 * @author auto create
 * @since 1.0, 2020-10-09 11:27:13
 */
public class AlipayTradeRepaybillOrderCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 7742366269862366918L;

	/**
	 * 还款协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 扩展参数，json格式字符串。使用前需要和支付宝先约定key值。
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 还款外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * json格式字符串，公用回传参数。如果请求时传递了该参数，则异步通知商户时会回传该参数
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 还款的付款uid
	 */
	@ApiField("payer_user_id")
	private String payerUserId;

	/**
	 * 还款请求金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("repay_amount")
	private String repayAmount;

	/**
	 * 还款收款方名称
	 */
	@ApiField("repay_payee_name")
	private String repayPayeeName;

	/**
	 * 还款的收单产品码，支付宝定义
	 */
	@ApiField("repay_product_code")
	private String repayProductCode;

	/**
	 * 还款说明
	 */
	@ApiField("repay_remark")
	private String repayRemark;

	/**
	 * 该笔还款单允许的最晚还款时间，逾期将关闭订单。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("repay_timeout_express")
	private String repayTimeoutExpress;

	/**
	 * 指定支付渠道，如果指定了渠道，用户只能用该渠道进行支付，具体渠道值由支付宝分配。
	 */
	@ApiField("specify_pay_channels")
	private String specifyPayChannels;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public String getPayerUserId() {
		return this.payerUserId;
	}
	public void setPayerUserId(String payerUserId) {
		this.payerUserId = payerUserId;
	}

	public String getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(String repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayPayeeName() {
		return this.repayPayeeName;
	}
	public void setRepayPayeeName(String repayPayeeName) {
		this.repayPayeeName = repayPayeeName;
	}

	public String getRepayProductCode() {
		return this.repayProductCode;
	}
	public void setRepayProductCode(String repayProductCode) {
		this.repayProductCode = repayProductCode;
	}

	public String getRepayRemark() {
		return this.repayRemark;
	}
	public void setRepayRemark(String repayRemark) {
		this.repayRemark = repayRemark;
	}

	public String getRepayTimeoutExpress() {
		return this.repayTimeoutExpress;
	}
	public void setRepayTimeoutExpress(String repayTimeoutExpress) {
		this.repayTimeoutExpress = repayTimeoutExpress;
	}

	public String getSpecifyPayChannels() {
		return this.specifyPayChannels;
	}
	public void setSpecifyPayChannels(String specifyPayChannels) {
		this.specifyPayChannels = specifyPayChannels;
	}

}
