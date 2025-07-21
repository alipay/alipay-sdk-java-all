package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻后付免密下单
 *
 * @author auto create
 * @since 1.0, 2025-02-17 16:04:19
 */
public class ZhimaCreditPayafteruseCreditbizorderOrderModel extends AlipayObject {

	private static final long serialVersionUID = 3888617121396161525L;

	/**
	 * 只有当传递了order_amount时，该参数才有意义； 1）该参数不传时，默认为ORDER_AMOUNT。 2）传ORDER_AMOUNT时，表示order_amount传入的金额为后付金额，在发起扣款时，最大扣款支付金额为order_amount传入的值（取值单位为元）； 3）传RISK_AMOUNT时，表示order_amount传入的金额为风险预估金额，在发起扣款时，最大扣款支付金额为商户签约时约定的上限额度（取值单位为元）。
	 */
	@ApiField("amount_type")
	private String amountType;

	/**
	 * 订单描述
	 */
	@ApiField("body")
	private String body;

	/**
	 * 芝麻外部类目，芝麻先享接入无差异化风控诉求可不传
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 业务子模式。默认的单次付模式无需传入，阶段付模式传入以区分是分次还是分期子模式。
	 */
	@ApiField("commercial_sub_mode")
	private String commercialSubMode;

	/**
	 * 芝麻开通协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/**
	 * 信用业务模式，不填默认为单次扣款模式。阶段付模式为STAGE_PAYMENT，其它模式请根据对应的技术支持文档传入
	 */
	@ApiField("credit_commercial_mode")
	private String creditCommercialMode;

	/**
	 * 业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 订单金额，该金额为当前订单扣款的累计最大额度。例如，下单时传递10.00，则扣款时最大支付金额为10元。若该参数不传，则默认使用商户签约时约定的上限额度。芝麻速办业务场景（极速回收、极速返利、极速退款等）商户请求时，order_amount必传，且amount_type类型需传递ORDER_AMOUNT。
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 商户外部订单号，保证不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 多阶段订单次数，业务模式为阶段付模式下时需传入
	 */
	@ApiField("payment_total_times")
	private String paymentTotalTimes;

	/**
	 * 产品码，不传默认为CREDIT_PAY_AFTER_USE
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 阶段付分期类型。阶段付模式，且子业务模式为分期模式下需要传入，分次不需要
	 */
	@ApiField("stage_period_type")
	private String stagePeriodType;

	/**
	 * 订单标题。
注意：不可使用特殊字符，如 /，=，& 等。
	 */
	@ApiField("subject")
	private String subject;

	public String getAmountType() {
		return this.amountType;
	}
	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCommercialSubMode() {
		return this.commercialSubMode;
	}
	public void setCommercialSubMode(String commercialSubMode) {
		this.commercialSubMode = commercialSubMode;
	}

	public String getCreditAgreementId() {
		return this.creditAgreementId;
	}
	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}

	public String getCreditCommercialMode() {
		return this.creditCommercialMode;
	}
	public void setCreditCommercialMode(String creditCommercialMode) {
		this.creditCommercialMode = creditCommercialMode;
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

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPaymentTotalTimes() {
		return this.paymentTotalTimes;
	}
	public void setPaymentTotalTimes(String paymentTotalTimes) {
		this.paymentTotalTimes = paymentTotalTimes;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStagePeriodType() {
		return this.stagePeriodType;
	}
	public void setStagePeriodType(String stagePeriodType) {
		this.stagePeriodType = stagePeriodType;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

}
