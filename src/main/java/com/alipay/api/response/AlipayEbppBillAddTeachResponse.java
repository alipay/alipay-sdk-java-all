package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.add.teach response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppBillAddTeachResponse extends AlipayResponse {

	private static final long serialVersionUID = 7846463272334615823L;

	/** 
	 * alipay_order_no
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * bank_bill_no
	 */
	@ApiField("bank_bill_no")
	private String bankBillNo;

	/** 
	 * bill_date
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * bill_key
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * charge_inst
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * charge_inst_name
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/** 
	 * extend_field
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * merchant_order_no
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * order_type
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * owner_name
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * pay_amount
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * service_amount
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * sub_order_type
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

	public void setBankBillNo(String bankBillNo) {
		this.bankBillNo = bankBillNo;
	}
	public String getBankBillNo( ) {
		return this.bankBillNo;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate( ) {
		return this.billDate;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setChargeInstName(String chargeInstName) {
		this.chargeInstName = chargeInstName;
	}
	public String getChargeInstName( ) {
		return this.chargeInstName;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount( ) {
		return this.payAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount( ) {
		return this.serviceAmount;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	public String getSubOrderType( ) {
		return this.subOrderType;
	}

}
