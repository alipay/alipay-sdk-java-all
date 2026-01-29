package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退税确认接口
 *
 * @author auto create
 * @since 1.0, 2025-11-19 10:43:59
 */
public class AlipayOverseasTaxTaxdataConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 6413639982865724571L;

	/**
	 * CN的用户id
The Alipay user ID confirmed by the user and sent to the tax refund company in advance.
Note: This field is required when refund_scene_type is a combined value.
Example:20881042392127580377
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * The available days of the tax refund data, which ranges from 15 to 30 days. If the value of this field exceeds 30 and the tax refund is not processed, the tax refund has failed.
Example:15
	 */
	@ApiField("available_day")
	private String availableDay;

	/**
	 * The time is in GMT+8, and in a yyyy-mm-dd hh:mm:ss format.
Example:2016-12-24 23:00:00
	 */
	@ApiField("confirm_date")
	private Date confirmDate;

	/**
	 * 两位字母代码KR-韩国
	 */
	@ApiField("country_code")
	private String countryCode;

	/**
	 * Departure port
Example:Inchon airport
	 */
	@ApiField("departure_point")
	private String departurePoint;

	/**
	 * The time is in GMT+8, and in a yyyy-mm-dd hh:mm:ss format.
Example:2016-12-24 23:00:00
	 */
	@ApiField("doc_expire_date")
	private Date docExpireDate;

	/**
	 * 纸质退税单id
	 */
	@ApiField("doc_id")
	private String docId;

	/**
	 * 实际退税金额，数值，最多两位小数，例如人民币，单位为元
Example:308.50
	 */
	@ApiField("final_refund_amount")
	private String finalRefundAmount;

	/**
	 * The final currency of the country for tax refund. Only CNY is supported now.
Example:CNY
	 */
	@ApiField("final_refund_currency")
	private String finalRefundCurrency;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退税业务完成，给商户发的通知消息
	 */
	@ApiField("merchant_notify_url")
	private String merchantNotifyUrl;

	/**
	 * 用户护照上的国际
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部商户id
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 退税机构业务流水号 唯一且最大长度不能超过64位，要求最小长度为3位
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 护照名
	 */
	@ApiField("passport_name")
	private String passportName;

	/**
	 * 护照号
	 */
	@ApiField("passport_no")
	private String passportNo;

	/**
	 * 退税金额，数值，最多两位小数，例如人民币，单位为元
Example:1400.00
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * The name of tax refund company, which the form initially belongs to.
Example:Global Blue
	 */
	@ApiField("refund_company_name")
	private String refundCompanyName;

	/**
	 * 退税原始币种 三位字母代码
	 */
	@ApiField("refund_currency")
	private String refundCurrency;

	/**
	 * The time is in GMT+8, and in a yyyy-mm-dd hh:mm:ss format.
Example:2016-12-24 23:00:00
	 */
	@ApiField("refund_print_date")
	private Date refundPrintDate;

	/**
	 * The tax refund type. Valid values include:
● 01: Indicates urban refund
● 02: Indicates airport kiosk refund
● 03: Indicates airport real-time refund
● 06: Indicates mailbox refund
Example:01
	 */
	@ApiField("refund_scene_type")
	private String refundSceneType;

	/**
	 * 购物金额，数值，最多两位小数，例如人民币，单位为元
Example:480000.00
	 */
	@ApiField("sales_amount")
	private String salesAmount;

	/**
	 * The sales currency, which follows the ISO standard alpha-3 currency code.
Example:KWR
	 */
	@ApiField("sales_currency")
	private String salesCurrency;

	/**
	 * 购物时间
The time is in GMT+8, and in a yyyy-mm-dd hh:mm:ss format.
Example:2016-12-24 23:00:00
	 */
	@ApiField("sales_date")
	private Date salesDate;

	/**
	 * 二级退税机构的pid
	 */
	@ApiField("sub_trsp_id")
	private String subTrspId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAvailableDay() {
		return this.availableDay;
	}
	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}

	public Date getConfirmDate() {
		return this.confirmDate;
	}
	public void setConfirmDate(Date confirmDate) {
		this.confirmDate = confirmDate;
	}

	public String getCountryCode() {
		return this.countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDeparturePoint() {
		return this.departurePoint;
	}
	public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
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

	public String getFinalRefundAmount() {
		return this.finalRefundAmount;
	}
	public void setFinalRefundAmount(String finalRefundAmount) {
		this.finalRefundAmount = finalRefundAmount;
	}

	public String getFinalRefundCurrency() {
		return this.finalRefundCurrency;
	}
	public void setFinalRefundCurrency(String finalRefundCurrency) {
		this.finalRefundCurrency = finalRefundCurrency;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantNotifyUrl() {
		return this.merchantNotifyUrl;
	}
	public void setMerchantNotifyUrl(String merchantNotifyUrl) {
		this.merchantNotifyUrl = merchantNotifyUrl;
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

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
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

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundCompanyName() {
		return this.refundCompanyName;
	}
	public void setRefundCompanyName(String refundCompanyName) {
		this.refundCompanyName = refundCompanyName;
	}

	public String getRefundCurrency() {
		return this.refundCurrency;
	}
	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}

	public Date getRefundPrintDate() {
		return this.refundPrintDate;
	}
	public void setRefundPrintDate(Date refundPrintDate) {
		this.refundPrintDate = refundPrintDate;
	}

	public String getRefundSceneType() {
		return this.refundSceneType;
	}
	public void setRefundSceneType(String refundSceneType) {
		this.refundSceneType = refundSceneType;
	}

	public String getSalesAmount() {
		return this.salesAmount;
	}
	public void setSalesAmount(String salesAmount) {
		this.salesAmount = salesAmount;
	}

	public String getSalesCurrency() {
		return this.salesCurrency;
	}
	public void setSalesCurrency(String salesCurrency) {
		this.salesCurrency = salesCurrency;
	}

	public Date getSalesDate() {
		return this.salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

	public String getSubTrspId() {
		return this.subTrspId;
	}
	public void setSubTrspId(String subTrspId) {
		this.subTrspId = subTrspId;
	}

}
