package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转账抽佣逆向退分佣
 *
 * @author auto create
 * @since 1.0, 2025-04-07 17:12:20
 */
public class AlipayFundAllocReverseTransferModel extends AlipayObject {

	private static final long serialVersionUID = 4273729992428677467L;

	/**
	 * 正向分佣时使用的协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 退分佣金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 退分佣的凭证
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
	 * 退分佣付款方
	 */
	@ApiField("payer")
	private ParticipantPartyForm payer;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 分佣退款备注
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

	public ParticipantPartyForm getPayer() {
		return this.payer;
	}
	public void setPayer(ParticipantPartyForm payer) {
		this.payer = payer;
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
