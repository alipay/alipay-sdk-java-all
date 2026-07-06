package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceAirplaneItinerary;
import com.alipay.api.domain.InvoiceItemDTO;
import com.alipay.api.domain.MotorVehicleSales;
import com.alipay.api.domain.InvoicePassenger;
import com.alipay.api.domain.SecondVehicleSales;
import com.alipay.api.domain.InvoiceTrainItinerary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.invoice.verify response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-26 10:27:44
 */
public class AlipayEbppIndustryInvoiceVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8445832887893149485L;

	/** 
	 * 飞机行程单信息
	 */
	@ApiField("airplane_itinerary")
	private InvoiceAirplaneItinerary airplaneItinerary;

	/** 
	 * 购买方地址
	 */
	@ApiField("buyer_address")
	private String buyerAddress;

	/** 
	 * 购买方银行账号
	 */
	@ApiField("buyer_bank_account")
	private String buyerBankAccount;

	/** 
	 * 购买方开户行名称
	 */
	@ApiField("buyer_bank_name")
	private String buyerBankName;

	/** 
	 * 购买方名称
	 */
	@ApiField("buyer_name")
	private String buyerName;

	/** 
	 * 购买方统一信用代码，如果是个人开票不存在该字段
	 */
	@ApiField("buyer_tax_no")
	private String buyerTaxNo;

	/** 
	 * 购买方电话
	 */
	@ApiField("buyer_telephone")
	private String buyerTelephone;

	/** 
	 * 发票金额，单位元
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 发票金额，不含税，单位元
	 */
	@ApiField("invoice_amount_without_tax")
	private String invoiceAmountWithoutTax;

	/** 
	 * 发票类型
	 */
	@ApiField("invoice_kind")
	private String invoiceKind;

	/** 
	 * 发票税额，单位元
	 */
	@ApiField("invoice_tax_amount")
	private String invoiceTaxAmount;

	/** 
	 * null
	 */
	@ApiListField("item_list")
	@ApiField("invoice_item_d_t_o")
	private List<InvoiceItemDTO> itemList;

	/** 
	 * 机动车销售统一发票明细
	 */
	@ApiField("motor_vehicle_sales")
	private MotorVehicleSales motorVehicleSales;

	/** 
	 * null
	 */
	@ApiListField("passenger_list")
	@ApiField("invoice_passenger")
	private List<InvoicePassenger> passengerList;

	/** 
	 * 代开发票标志
	 */
	@ApiField("proxy_issued")
	private Boolean proxyIssued;

	/** 
	 * 二手车销售统一发票专用明细
	 */
	@ApiField("second_vehicle_sales")
	private SecondVehicleSales secondVehicleSales;

	/** 
	 * 销售方地址
	 */
	@ApiField("seller_address")
	private String sellerAddress;

	/** 
	 * 销售方银行账号
	 */
	@ApiField("seller_bank_account")
	private String sellerBankAccount;

	/** 
	 * 销售方开户行名称
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/** 
	 * 销售方名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	/** 
	 * 销售方统一信用代码
	 */
	@ApiField("seller_tax_no")
	private String sellerTaxNo;

	/** 
	 * 销售方电话
	 */
	@ApiField("seller_telephone")
	private String sellerTelephone;

	/** 
	 * 火车行程单信息
	 */
	@ApiField("train_itinerary")
	private InvoiceTrainItinerary trainItinerary;

	/** 
	 * 发票验证结果码
	 */
	@ApiField("verify_result_code")
	private String verifyResultCode;

	/** 
	 * 校验错误/不通过时参考此信息
	 */
	@ApiField("verify_result_desc")
	private String verifyResultDesc;

	public void setAirplaneItinerary(InvoiceAirplaneItinerary airplaneItinerary) {
		this.airplaneItinerary = airplaneItinerary;
	}
	public InvoiceAirplaneItinerary getAirplaneItinerary( ) {
		return this.airplaneItinerary;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerAddress( ) {
		return this.buyerAddress;
	}

	public void setBuyerBankAccount(String buyerBankAccount) {
		this.buyerBankAccount = buyerBankAccount;
	}
	public String getBuyerBankAccount( ) {
		return this.buyerBankAccount;
	}

	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public String getBuyerBankName( ) {
		return this.buyerBankName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerName( ) {
		return this.buyerName;
	}

	public void setBuyerTaxNo(String buyerTaxNo) {
		this.buyerTaxNo = buyerTaxNo;
	}
	public String getBuyerTaxNo( ) {
		return this.buyerTaxNo;
	}

	public void setBuyerTelephone(String buyerTelephone) {
		this.buyerTelephone = buyerTelephone;
	}
	public String getBuyerTelephone( ) {
		return this.buyerTelephone;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setInvoiceAmountWithoutTax(String invoiceAmountWithoutTax) {
		this.invoiceAmountWithoutTax = invoiceAmountWithoutTax;
	}
	public String getInvoiceAmountWithoutTax( ) {
		return this.invoiceAmountWithoutTax;
	}

	public void setInvoiceKind(String invoiceKind) {
		this.invoiceKind = invoiceKind;
	}
	public String getInvoiceKind( ) {
		return this.invoiceKind;
	}

	public void setInvoiceTaxAmount(String invoiceTaxAmount) {
		this.invoiceTaxAmount = invoiceTaxAmount;
	}
	public String getInvoiceTaxAmount( ) {
		return this.invoiceTaxAmount;
	}

	public void setItemList(List<InvoiceItemDTO> itemList) {
		this.itemList = itemList;
	}
	public List<InvoiceItemDTO> getItemList( ) {
		return this.itemList;
	}

	public void setMotorVehicleSales(MotorVehicleSales motorVehicleSales) {
		this.motorVehicleSales = motorVehicleSales;
	}
	public MotorVehicleSales getMotorVehicleSales( ) {
		return this.motorVehicleSales;
	}

	public void setPassengerList(List<InvoicePassenger> passengerList) {
		this.passengerList = passengerList;
	}
	public List<InvoicePassenger> getPassengerList( ) {
		return this.passengerList;
	}

	public void setProxyIssued(Boolean proxyIssued) {
		this.proxyIssued = proxyIssued;
	}
	public Boolean getProxyIssued( ) {
		return this.proxyIssued;
	}

	public void setSecondVehicleSales(SecondVehicleSales secondVehicleSales) {
		this.secondVehicleSales = secondVehicleSales;
	}
	public SecondVehicleSales getSecondVehicleSales( ) {
		return this.secondVehicleSales;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}
	public String getSellerAddress( ) {
		return this.sellerAddress;
	}

	public void setSellerBankAccount(String sellerBankAccount) {
		this.sellerBankAccount = sellerBankAccount;
	}
	public String getSellerBankAccount( ) {
		return this.sellerBankAccount;
	}

	public void setSellerBankName(String sellerBankName) {
		this.sellerBankName = sellerBankName;
	}
	public String getSellerBankName( ) {
		return this.sellerBankName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerName( ) {
		return this.sellerName;
	}

	public void setSellerTaxNo(String sellerTaxNo) {
		this.sellerTaxNo = sellerTaxNo;
	}
	public String getSellerTaxNo( ) {
		return this.sellerTaxNo;
	}

	public void setSellerTelephone(String sellerTelephone) {
		this.sellerTelephone = sellerTelephone;
	}
	public String getSellerTelephone( ) {
		return this.sellerTelephone;
	}

	public void setTrainItinerary(InvoiceTrainItinerary trainItinerary) {
		this.trainItinerary = trainItinerary;
	}
	public InvoiceTrainItinerary getTrainItinerary( ) {
		return this.trainItinerary;
	}

	public void setVerifyResultCode(String verifyResultCode) {
		this.verifyResultCode = verifyResultCode;
	}
	public String getVerifyResultCode( ) {
		return this.verifyResultCode;
	}

	public void setVerifyResultDesc(String verifyResultDesc) {
		this.verifyResultDesc = verifyResultDesc;
	}
	public String getVerifyResultDesc( ) {
		return this.verifyResultDesc;
	}

}
