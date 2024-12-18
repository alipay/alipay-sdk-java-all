package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单创建
 *
 * @author auto create
 * @since 1.0, 2023-07-18 20:57:37
 */
public class AlipayOverseasTaxNeworderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5114691494936192377L;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 退税单过期时间，退税单据的有效期是6个月，退税打印时间+6个月，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("doc_expire_date")
	private Date docExpireDate;

	/**
	 * 纸质退税单号，应保证和单笔退税接口的doc_id一致
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 退税单打印时间，格式 : yyyy-MM-dd HH:mm:ss，北京时间24小时制，时区东八区
	 */
	@ApiField("doc_print_date")
	private Date docPrintDate;

	/**
	 * 扩展参数json格式，1.机构退税单页面标识符，key为page_identifier，value为唯一加密串，跳转机构退税单页面时携带此参数
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 国籍，用户护照上的国家码
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部退税商户ID，商户在退税机构的ID，一键退税必填
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 护照姓名，用户护照上的英文姓名，不允许特殊字符
	 */
	@ApiField("passport_name")
	private String passportName;

	/**
	 * 护照号码，英文或数据，不允许特殊字符
	 */
	@ApiField("passport_no")
	private String passportNo;

	/**
	 * 当前状态，新建（INIT），海关已盖章（STAMPED），海关拒绝（REJECTED_BY_CUSTOMS），退税机构收到退税单（RECEIVED），作废（VOIDED），失败（FAILED），过期（EXPIRED），已退税（REFUNDED），已使用非支付宝退税（REFUNDED_NON_ALIPAY）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 当前状态发生的时间(UTC+8)，格式yyyy-MM-dd HH:mm:ss，默认为当前时间
	 */
	@ApiField("status_change_time")
	private Date statusChangeTime;

	/**
	 * 支付宝资金订单号，预授权退税下单接口返回的tax_refund_no，原单笔退税接口返回的refund_order_no，批量退税结果文件倒数第二列。当且status为REFUNDED时必选，其余状态忽略
	 */
	@ApiField("tax_payment_no")
	private String taxPaymentNo;

	/**
	 * 退税金额，退税公司退税金额，币种由tax_refund_currency指定，精确到币种最小单位，金额大于0，如tax_refund_currency为SGD，币种最小单位为分，100元新币，则tax_refund_amount传入10000.
	 */
	@ApiField("tax_refund_amount")
	private String taxRefundAmount;

	/**
	 * 退税发生国家, ISO标准alpha-2国家代码
	 */
	@ApiField("tax_refund_country")
	private String taxRefundCountry;

	/**
	 * 退税公司退税币种，一般指外币，ISO标准退税国家alpha-3币种代码
	 */
	@ApiField("tax_refund_currency")
	private String taxRefundCurrency;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getDocExpireDate() {
		return this.docExpireDate;
	}
	public void setDocExpireDate(Date docExpireDate) {
		this.docExpireDate = docExpireDate;
	}

	public String getDocId() {
		return this.docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Date getDocPrintDate() {
		return this.docPrintDate;
	}
	public void setDocPrintDate(Date docPrintDate) {
		this.docPrintDate = docPrintDate;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getPassportName() {
		return this.passportName;
	}
	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}

	public String getPassportNo() {
		return this.passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStatusChangeTime() {
		return this.statusChangeTime;
	}
	public void setStatusChangeTime(Date statusChangeTime) {
		this.statusChangeTime = statusChangeTime;
	}

	public String getTaxPaymentNo() {
		return this.taxPaymentNo;
	}
	public void setTaxPaymentNo(String taxPaymentNo) {
		this.taxPaymentNo = taxPaymentNo;
	}

	public String getTaxRefundAmount() {
		return this.taxRefundAmount;
	}
	public void setTaxRefundAmount(String taxRefundAmount) {
		this.taxRefundAmount = taxRefundAmount;
	}

	public String getTaxRefundCountry() {
		return this.taxRefundCountry;
	}
	public void setTaxRefundCountry(String taxRefundCountry) {
		this.taxRefundCountry = taxRefundCountry;
	}

	public String getTaxRefundCurrency() {
		return this.taxRefundCurrency;
	}
	public void setTaxRefundCurrency(String taxRefundCurrency) {
		this.taxRefundCurrency = taxRefundCurrency;
	}

}
