package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工卡还款
 *
 * @author auto create
 * @since 1.0, 2024-07-04 17:07:17
 */
public class AlipayFundFlexiblestaffingRepaymentTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4723847224214944727L;

	/**
	 * 描述特定的业务场景。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 零工卡专用金还款到卡扩展参数
	 */
	@ApiField("business_params")
	private RepaymentBusinessParams businessParams;

	/**
	 * 借款协议号
	 */
	@ApiField("loan_agreement_no")
	private String loanAgreementNo;

	/**
	 * 转账订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商家侧唯一订单号，由商家自定义。对于不同转账请求，商家需保证该订单号在自身系统唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转账还款收款方信息，部分场景可选。
	 */
	@ApiField("payee_info")
	private RepaymentParticipant payeeInfo;

	/**
	 * 业务产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 转账备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 转账金额（元）
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public RepaymentBusinessParams getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(RepaymentBusinessParams businessParams) {
		this.businessParams = businessParams;
	}

	public String getLoanAgreementNo() {
		return this.loanAgreementNo;
	}
	public void setLoanAgreementNo(String loanAgreementNo) {
		this.loanAgreementNo = loanAgreementNo;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public RepaymentParticipant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(RepaymentParticipant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
