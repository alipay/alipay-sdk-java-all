package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付条款子项
 *
 * @author auto create
 * @since 1.0, 2022-12-12 16:38:02
 */
public class OpenApiPaymentTermsItemDTO extends AlipayObject {

	private static final long serialVersionUID = 5187998286229893784L;

	/**
	 * 子项id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 是否有票
	 */
	@ApiField("need_invoice")
	private String needInvoice;

	/**
	 * *付款基数
     *      * 合同金额:CONTRACT_AMOUNT
     *      * 累计产值:ACCUMULATED_ASSET_VALUE
     *      * 结算金额:SETTLEMENT_AMOUNT
	 */
	@ApiField("pay_base")
	private String payBase;

	/**
	 * 付款前置条件,     *      * 预付款保函: PRE-PAYMENT_GUA
     *      * 履约保函:PERFORMANCE_GUARA
     *      * 质保函:QUALITY_GUARANTEE
	 */
	@ApiField("pay_pre_type")
	private String payPreType;

	/**
	 * *付款参照类型
     *      * INVOICE_ARV_DATE  供应商开票后天数
     *      * INVOICE_BILL_DATE 票到期限
     *      * NONE 无发票
	 */
	@ApiField("pay_ref_type")
	private String payRefType;

	/**
	 * *     * 付款期限
     *      * invoice_arv_date供应商开票后天数取值于 dayAfterInvoicing
     *      * invoice_bill_date票到期限取值于 invoiceDueDate
	 */
	@ApiField("pay_term")
	private String payTerm;

	/**
	 * 是否自然日付款
     *      * 工作日：WORKING_DAY
     *      * 自然日：CALENDAR_DAY
	 */
	@ApiField("pay_term_type")
	private String payTermType;

	/**
	 * 付款金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 支付条款类型     *     * 支付条款类型 对应新模型的term_type，对原模型 lineType + paymentMethod ；
     *      * <P>支付条款后付款：<code>POSTPAY_MONEY</code> 对应原来的 <code>lineTyp:SCHEDULE, paymentMethod:POSTPAID</code> ；</P>
     *      * <P>支付条款预付款：<code>PREPAY_MONEY</code> 对应原来的 <code>lineTyp:SCHEDULE, paymentMethod:PREPAID</code> ；</P>
     *      * <P>质量保证金：<code>lineType:GUARANTEE_MONEY</code> 对应原来的 <code>DEPOSIT</code></P>
	 */
	@ApiField("payment_item_type")
	private String paymentItemType;

	/**
	 * 付款比例
	 */
	@ApiField("payment_percent")
	private String paymentPercent;

	/**
	 * 头ID
	 */
	@ApiField("payment_terms_id")
	private String paymentTermsId;

	/**
	 * 阶段
	 */
	@ApiField("phase")
	private String phase;

	/**
	 * 条款内容
	 */
	@ApiField("terms")
	private String terms;

	/**
	 * 条款内容-中文
	 */
	@ApiField("terms_cn")
	private String termsCn;

	/**
	 * 条款内容-英文
	 */
	@ApiField("terms_en")
	private String termsEn;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNeedInvoice() {
		return this.needInvoice;
	}
	public void setNeedInvoice(String needInvoice) {
		this.needInvoice = needInvoice;
	}

	public String getPayBase() {
		return this.payBase;
	}
	public void setPayBase(String payBase) {
		this.payBase = payBase;
	}

	public String getPayPreType() {
		return this.payPreType;
	}
	public void setPayPreType(String payPreType) {
		this.payPreType = payPreType;
	}

	public String getPayRefType() {
		return this.payRefType;
	}
	public void setPayRefType(String payRefType) {
		this.payRefType = payRefType;
	}

	public String getPayTerm() {
		return this.payTerm;
	}
	public void setPayTerm(String payTerm) {
		this.payTerm = payTerm;
	}

	public String getPayTermType() {
		return this.payTermType;
	}
	public void setPayTermType(String payTermType) {
		this.payTermType = payTermType;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentItemType() {
		return this.paymentItemType;
	}
	public void setPaymentItemType(String paymentItemType) {
		this.paymentItemType = paymentItemType;
	}

	public String getPaymentPercent() {
		return this.paymentPercent;
	}
	public void setPaymentPercent(String paymentPercent) {
		this.paymentPercent = paymentPercent;
	}

	public String getPaymentTermsId() {
		return this.paymentTermsId;
	}
	public void setPaymentTermsId(String paymentTermsId) {
		this.paymentTermsId = paymentTermsId;
	}

	public String getPhase() {
		return this.phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getTerms() {
		return this.terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}

	public String getTermsCn() {
		return this.termsCn;
	}
	public void setTermsCn(String termsCn) {
		this.termsCn = termsCn;
	}

	public String getTermsEn() {
		return this.termsEn;
	}
	public void setTermsEn(String termsEn) {
		this.termsEn = termsEn;
	}

}
