package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻后付APP下单
 *
 * @author auto create
 * @since 1.0, 2022-03-31 16:37:57
 */
public class ZhimaCreditPayafteruseCreditbizorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8285922792196977113L;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 当用户进入芝麻后付下单页面后，点击左上角的回退按钮，中断开通流程，跳转回商户的页面地址。不传该链接时，默认返回上一级页面，由外部app唤起支付宝的情况，会返回支付宝首页。
	 */
	@ApiField("cancel_back_link")
	private String cancelBackLink;

	/**
	 * 芝麻外部类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 订单金额，该金额为当前订单扣款的累计最大额度。例如，下单时传递10.00，则扣款时最大支付金额为10元。若该参数不传，则默认使用商户签约时约定的上限额度。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 商户外部协议号。不传该值时，默认使用out_order_no作为out_agreement_no使用，不同的支付宝用户需要传递不同的外部协议号。
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 商户外部订单号，保证不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 产品码，不填默认为 CREDIT_PAY_AFTER_USE。芝麻先用后付产品为CREDIT_PAY_AFTER_USE，其他产品请根据对应的技术支持文档传入。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户成功完成芝麻后付开通流程后，跳转回商户的页面地址。不传该链接时，默认返回上一级页面，由外部app唤起支付宝的情况，会返回支付宝首页。
	 */
	@ApiField("return_back_link")
	private String returnBackLink;

	/**
	 * 订单标题。 注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 芝麻服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCancelBackLink() {
		return this.cancelBackLink;
	}
	public void setCancelBackLink(String cancelBackLink) {
		this.cancelBackLink = cancelBackLink;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getReturnBackLink() {
		return this.returnBackLink;
	}
	public void setReturnBackLink(String returnBackLink) {
		this.returnBackLink = returnBackLink;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getZmServiceId() {
		return this.zmServiceId;
	}
	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}

}
