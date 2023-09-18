package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账分佣正向流程
 *
 * @author auto create
 * @since 1.0, 2023-05-22 17:10:26
 */
public class AlipayFundAllocTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5167415891792483979L;

	/**
	 * 该笔分佣基于该协议号进行的分佣
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 分佣金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 该笔分佣操作基于此凭证进行分佣。
	 */
	@ApiField("certification")
	private CertificationForm certification;

	/**
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款人信息
	 */
	@ApiField("payee")
	private ParticipantPartyForm payee;

	/**
	 * 接口调用的产品码，固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 分佣备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public CertificationForm getCertification() {
		return this.certification;
	}
	public void setCertification(CertificationForm certification) {
		this.certification = certification;
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

	public ParticipantPartyForm getPayee() {
		return this.payee;
	}
	public void setPayee(ParticipantPartyForm payee) {
		this.payee = payee;
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

}
