package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.billkey.deduct.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 16:01:57
 */
public class AlipayEbppEbppBillkeyDeductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7573578799826394831L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 一级业务
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 二级业务
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey( ) {
		return this.billKey;
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

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
