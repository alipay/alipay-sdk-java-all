package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.billkey.upgrade.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:44:31
 */
public class AlipayEbppBillkeyUpgradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6784164281686915398L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务类型英文名称 ，例如传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构名称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 子业务类型英文名称，ELECTRIC-电费，WATER-水费，GAS-燃气费
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

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

}
