package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppBillGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8696333641221881242L;

	/** 
	 * 支付宝业务流水号。
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/** 
	 * 账单的账期，例如201203表示2012年3月的账单。
缴税业务非必填
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 纳税人识别号，对于三证合一的企业来说，采用社会信用代码；
对于个人来说，采用身份证号。
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 出账机构代码，对于缴税来说，指征收机关英文代码，例如南京玄武国税（NJXWGS）
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 出账机构中文名称。
	 */
	@ApiField("charge_inst_name")
	private String chargeInstName;

	/** 
	 * 回传ISV流水号。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 账单的状态。 INIT:等待付款，SUCCESS:成功,FAILED:失败。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 业务类型英文名称，对缴税业务来说，固定为TAX，表示缴税
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 拥有该账单的用户姓名
缴税业务为纳税人名称
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 用户支付的总金额，包含滞纳金，精确到分。
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 账单的服务费。
缴税业务非必填
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/** 
	 * 子业务类型是业务类型的下一级概念
对缴税业务来说，固定为TAX，表示缴税。
	 */
	@ApiField("sub_order_type")
	private String subOrderType;

	/** 
	 * 废弃字段，无需关注
	 */
	@ApiField("traffic_location")
	private String trafficLocation;

	/** 
	 * 废弃字段，无需关注
	 */
	@ApiField("traffic_regulations")
	private String trafficRegulations;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
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

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
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

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
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

	public void setTrafficLocation(String trafficLocation) {
		this.trafficLocation = trafficLocation;
	}
	public String getTrafficLocation( ) {
		return this.trafficLocation;
	}

	public void setTrafficRegulations(String trafficRegulations) {
		this.trafficRegulations = trafficRegulations;
	}
	public String getTrafficRegulations( ) {
		return this.trafficRegulations;
	}

}
