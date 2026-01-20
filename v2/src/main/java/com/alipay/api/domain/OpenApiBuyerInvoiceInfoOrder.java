package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 购方开票信息OpenApiOrder
 *
 * @author auto create
 * @since 1.0, 2025-11-12 16:35:55
 */
public class OpenApiBuyerInvoiceInfoOrder extends AlipayObject {

	private static final long serialVersionUID = 5261247763997341678L;

	/**
	 * 开票资料pid寻址方式, 默认true
true:pid寻址mid,优先以mid维度保存开票资料,若无mid则以pid维度保存开票资料 
false:不寻址mid,以pid维度保存开票资料
	 */
	@ApiField("addressing")
	private Boolean addressing;

	/**
	 * 自动开票设置, Y/N, 默认N
	 */
	@ApiField("auto")
	private String auto;

	/**
	 * 超开处置方式  ExceedInvoiceHandleEnum
	 */
	@ApiField("exceed_invoice_handle_way")
	private String exceedInvoiceHandleWay;

	/**
	 * 可选, 发票抬头, 为空不填写时，从CIF或MIF取值
	 */
	@ApiField("invoice_title")
	private String invoiceTitle;

	/**
	 * 资格附件
	 */
	@ApiField("qualification")
	private String qualification;

	/**
	 * 公司注册地址
	 */
	@ApiField("registered_address")
	private String registeredAddress;

	/**
	 * 公司注册电话
	 */
	@ApiField("registered_phone_no")
	private String registeredPhoneNo;

	/**
	 * 纳税人识别号
	 */
	@ApiField("tax_no")
	private String taxNo;

	/**
	 * 纳税人资格开始时间，精确到天, 标准十分秒格式
	 */
	@ApiField("taxpayer_start_date")
	private String taxpayerStartDate;

	/**
	 * 可选, 纳税人类型, 传枚举TaxPayerQualificationEnum的englishName 不传的话默认一般纳税人GENERAL_VAT_TAXPAYER
	 */
	@ApiField("taxpayer_type")
	private String taxpayerType;

	/**
	 * 用户pid。用于保存购方资料, 不填则以虚拟pid 2088999999999999进行替代
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 邮寄信息集合
	 */
	@ApiListField("user_mail_info_orders")
	@ApiField("open_api_user_mail_info_order")
	private List<OpenApiUserMailInfoOrder> userMailInfoOrders;

	public Boolean getAddressing() {
		return this.addressing;
	}
	public void setAddressing(Boolean addressing) {
		this.addressing = addressing;
	}

	public String getAuto() {
		return this.auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getExceedInvoiceHandleWay() {
		return this.exceedInvoiceHandleWay;
	}
	public void setExceedInvoiceHandleWay(String exceedInvoiceHandleWay) {
		this.exceedInvoiceHandleWay = exceedInvoiceHandleWay;
	}

	public String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}

	public String getQualification() {
		return this.qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public String getRegisteredPhoneNo() {
		return this.registeredPhoneNo;
	}
	public void setRegisteredPhoneNo(String registeredPhoneNo) {
		this.registeredPhoneNo = registeredPhoneNo;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getTaxpayerStartDate() {
		return this.taxpayerStartDate;
	}
	public void setTaxpayerStartDate(String taxpayerStartDate) {
		this.taxpayerStartDate = taxpayerStartDate;
	}

	public String getTaxpayerType() {
		return this.taxpayerType;
	}
	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<OpenApiUserMailInfoOrder> getUserMailInfoOrders() {
		return this.userMailInfoOrders;
	}
	public void setUserMailInfoOrders(List<OpenApiUserMailInfoOrder> userMailInfoOrders) {
		this.userMailInfoOrders = userMailInfoOrders;
	}

}
