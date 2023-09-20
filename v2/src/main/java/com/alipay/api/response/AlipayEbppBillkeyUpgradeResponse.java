package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.billkey.upgrade response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:55:05
 */
public class AlipayEbppBillkeyUpgradeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4312679878533581964L;

	/** 
	 * 户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/** 
	 * 业务类型英文名称 ，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 出账机构名称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 升级后的新户号
	 */
	@ApiField("new_bill_key")
	private String newBillKey;

	/** 
	 * UPGRADE代表户号升级
ROLLBACK代表户号回滚
	 */
	@ApiField("operation_type")
	private String operationType;

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

	public void setNewBillKey(String newBillKey) {
		this.newBillKey = newBillKey;
	}
	public String getNewBillKey( ) {
		return this.newBillKey;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	public String getOperationType( ) {
		return this.operationType;
	}

	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}
	public String getSubBizType( ) {
		return this.subBizType;
	}

}
