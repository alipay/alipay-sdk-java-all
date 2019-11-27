package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税单创建
 *
 * @author auto create
 * @since 1.0, 2019-11-26 15:54:10
 */
public class AlipayOverseasTaxNeworderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3288313823257131589L;

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
	 * 扩展参数json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 国籍，用户护照上的国家码
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 外部退税商户ID，商户在退税机构的ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 护照姓名，用户护照上的英文姓名
	 */
	@ApiField("passport_name")
	private String passportName;

	/**
	 * 护照号码
	 */
	@ApiField("passport_no")
	private String passportNo;

	/**
	 * 当前状态，新建（INIT），海关已盖章（STAMPED），退税机构收到退税单（INST_RECEIVED），已退税（REFUNDED）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 退税金额，退税公司退税金额，币种由tax_refund_currency指定，精确到币种最小单位，如tax_refund_currency为SGD，币种最小单位为分，100元新币，则tax_refund_amount传入10000.
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
