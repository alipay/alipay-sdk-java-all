package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 户号升级接口
 *
 * @author auto create
 * @since 1.0, 2022-11-07 15:58:26
 */
public class AlipayEbppEbppBillkeyDeductUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 1593264821532747525L;

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
	 * 销账机构，用户校验机构是否是升级中
	 */
	@ApiField("chargeoff_inst")
	private String chargeoffInst;

	/**
	 * 二级业务参数
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getChargeoffInst() {
		return this.chargeoffInst;
	}
	public void setChargeoffInst(String chargeoffInst) {
		this.chargeoffInst = chargeoffInst;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
