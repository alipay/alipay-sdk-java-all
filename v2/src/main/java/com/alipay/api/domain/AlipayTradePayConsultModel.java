package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一收单支付能力咨询
 *
 * @author auto create
 * @since 1.0, 2024-09-24 15:10:06
 */
public class AlipayTradePayConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5157759951346484952L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号。用户签约成功后时，协议号会返回给商户。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 商户申请额度，商户端根据实际需要来赋值。
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 业务场景，用于区分商户具体的咨询类型。ENJOY_CONSULT：兜底资金咨询；FUND_BILL_CONSULT资金渠道咨询
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家的支付宝用户id，用户签约成功后，会返回给商户。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 支付咨询阶段。在支付过程中，用于区分商户发起咨询的阶段。BEFORE_PAY：支付前咨询；AFTER_PAY：支付后咨询
	 */
	@ApiField("consult_phase")
	private String consultPhase;

	/**
	 * 扩展参数，必须是json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 此参数值取商户签约销售方案时的销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户端生成唯一标识，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 订单标题，商户端描述该次咨询对应的基本订单信息。
	 */
	@ApiField("subject")
	private String subject;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getConsultPhase() {
		return this.consultPhase;
	}
	public void setConsultPhase(String consultPhase) {
		this.consultPhase = consultPhase;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
