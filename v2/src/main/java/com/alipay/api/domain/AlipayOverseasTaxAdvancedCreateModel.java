package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权退税下单
 *
 * @author auto create
 * @since 1.0, 2023-05-22 17:33:21
 */
public class AlipayOverseasTaxAdvancedCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7116569987817572858L;

	/**
	 * 纸质退税单号，合并退税时需要传多个，逗号分隔，tax_refund_scene_type=09时只支持一个docId
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 业务扩展参数，用于商户的特定业务信息的传递，json格式
	 */
	@ApiField("extend_param")
	private String extendParam;

	/**
	 * 支付宝账号标识号，由identify_account_type指定类型: identify_account_type为barcode表示支付宝钱包付款码，退税公司通过扫描用户支付宝钱包付款码获取，17位到32位的数字. identify_account_type为uid表示支付宝用户Id
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/**
	 * 支付宝账号标识类型， tax_refund_scene_type=09时传uid，tax_refund_scene_type=10时传barcode
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

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
	 * 退税机构业务流水号，唯一，只能包含字母、数字。
	 */
	@ApiField("out_tax_refund_no")
	private String outTaxRefundNo;

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
	 * 该笔订单允许的最晚付款时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点，如1.5h，可转换为90m。如果为空，默认15m
	 */
	@ApiField("pay_timeout")
	private String payTimeout;

	/**
	 * 退税金额，币种由tax_refund_currency指定，精确到币种最小单位，如tax_refund_currency为SGD，币种最小单位为分，100元新币，则tax_refund_amount传入10000
	 */
	@ApiField("tax_refund_amount")
	private String taxRefundAmount;

	/**
	 * 退税发生国家, ISO标准alpha-2国家代码
	 */
	@ApiField("tax_refund_country")
	private String taxRefundCountry;

	/**
	 * 退税币种，一般指外币，ISO标准alpha-3币种代码
	 */
	@ApiField("tax_refund_currency")
	private String taxRefundCurrency;

	/**
	 * 退税场景类型，09 线上预授权退税，10 线下预授权退税
	 */
	@ApiField("tax_refund_scene_type")
	private String taxRefundSceneType;

	/**
	 * 用户实际收到的退税金额，币种由user_received_currency指定，精确到币种最小单位，如user_received_currency为CNY，币种最小单位为分，100元人民币，则user_received_amount传入10000
	 */
	@ApiField("user_received_amount")
	private String userReceivedAmount;

	/**
	 * 用户实际收款币种，一般指人民币 CNY，ISO标准alpha-3币种代码
	 */
	@ApiField("user_received_currency")
	private String userReceivedCurrency;

	public String getDocId() {
		return this.docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getExtendParam() {
		return this.extendParam;
	}
	public void setExtendParam(String extendParam) {
		this.extendParam = extendParam;
	}

	public String getIdentifyAccountNo() {
		return this.identifyAccountNo;
	}
	public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}

	public String getIdentifyAccountType() {
		return this.identifyAccountType;
	}
	public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
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

	public String getOutTaxRefundNo() {
		return this.outTaxRefundNo;
	}
	public void setOutTaxRefundNo(String outTaxRefundNo) {
		this.outTaxRefundNo = outTaxRefundNo;
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

	public String getPayTimeout() {
		return this.payTimeout;
	}
	public void setPayTimeout(String payTimeout) {
		this.payTimeout = payTimeout;
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

	public String getTaxRefundSceneType() {
		return this.taxRefundSceneType;
	}
	public void setTaxRefundSceneType(String taxRefundSceneType) {
		this.taxRefundSceneType = taxRefundSceneType;
	}

	public String getUserReceivedAmount() {
		return this.userReceivedAmount;
	}
	public void setUserReceivedAmount(String userReceivedAmount) {
		this.userReceivedAmount = userReceivedAmount;
	}

	public String getUserReceivedCurrency() {
		return this.userReceivedCurrency;
	}
	public void setUserReceivedCurrency(String userReceivedCurrency) {
		this.userReceivedCurrency = userReceivedCurrency;
	}

}
