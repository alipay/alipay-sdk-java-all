package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 户号升级结果查询
 *
 * @author auto create
 * @since 1.0, 2021-03-30 16:10:50
 */
public class AlipayEbppBillkeyUpgradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6196192954182239717L;

	/**
	 * 原户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 业务类型英文名称 ，例如传JF，表示缴费
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 出账机构英文简称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

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

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
