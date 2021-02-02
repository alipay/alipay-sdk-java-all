package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jfexport.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppJfexportBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5725683595518444528L;

	/** 
	 * 支付的总金额，单位为：RMB元。默认返回空，实际金额已销账、对账为准。
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 账期
	 */
	@ApiField("bill_date")
	private String billDate;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝的业务订单号，具有唯一性和幂等性
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 业务类型英文名称
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 拓展字段，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 外部商户的业务流水号，需要保证唯一性和幂等性
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 账单拥有者的姓名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 账单的状态: I-等待付款，P-处理中，已扣款待销账，C-单据关闭，F-失败，W-清算后退款，S-销账成功
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子业务类型英文名称
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
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

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
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

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
