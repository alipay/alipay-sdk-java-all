package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.jf.billkey.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppJfBillkeyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5657923789228813386L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * billkey
	 */
	@ApiField("billkey")
	private String billkey;

	/** 
	 * 缴费业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 签约订单唯一标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * ownerName
	 */
	@ApiField("owner_name")
	private String ownerName;

	/** 
	 * 签约户号的子业务类型
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}
	public String getBillkey( ) {
		return this.billkey;
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

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName( ) {
		return this.ownerName;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
