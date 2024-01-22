package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工卡转账结果查询
 *
 * @author auto create
 * @since 1.0, 2023-06-02 15:36:18
 */
public class AlipayFundFlexiblestaffingRepaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5337796875667945431L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 借款订单号
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/**
	 * 借款协议号
	 */
	@ApiField("loan_agreement_no")
	private String loanAgreementNo;

	/**
	 * 外部唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getFundOrderId() {
		return this.fundOrderId;
	}
	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}

	public String getLoanAgreementNo() {
		return this.loanAgreementNo;
	}
	public void setLoanAgreementNo(String loanAgreementNo) {
		this.loanAgreementNo = loanAgreementNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
