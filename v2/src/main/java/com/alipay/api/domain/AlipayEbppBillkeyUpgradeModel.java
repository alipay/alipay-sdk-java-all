package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 户号升级
 *
 * @author auto create
 * @since 1.0, 2021-03-30 16:11:22
 */
public class AlipayEbppBillkeyUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 4299299667441874482L;

	/**
	 * 原户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称 ，固定传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 升级后的户号
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

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getNewBillKey() {
		return this.newBillKey;
	}
	public void setNewBillKey(String newBillKey) {
		this.newBillKey = newBillKey;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
