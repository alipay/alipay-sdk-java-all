package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:13
 */
public class AlipayEbppCommonBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626762796849516916L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 支付宝账单流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 出账机构英文缩写
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 销账机构英文缩写
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/** 
	 * 订单扩展信息
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 订单创建时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 订单支付时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/** 
	 * S-成功 P-已支付 I-待支付 C-已关闭 T-退款中 F-已退款
	 */
	@ApiField("status")
	private String status;

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

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}
	public String getChargeoffInst( ) {
		return this.chargeoffInst;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}
	public String getGmtPay( ) {
		return this.gmtPay;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
