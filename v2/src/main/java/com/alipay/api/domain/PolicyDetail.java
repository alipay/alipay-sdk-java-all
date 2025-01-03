package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退改签政策描述
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:32
 */
public class PolicyDetail extends AlipayObject {

	private static final long serialVersionUID = 1432183758228491125L;

	/**
	 * 扣减比例/金额：
● 扣减类型=1：金额数字，单位：元；如：200
● 扣减类型=2：百分比数字，如20，表示扣减money_base的20%
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 扣减类型：
● 1-固定金额
● 2-百分比
	 */
	@ApiField("deduct_type")
	private String deductType;

	/**
	 * 退票或改签的具体政策描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 扣减基线的描述，可以是一个具体的金额或者短语描述，如「原票价」或「1000（1000是一个票价）」，当给出的扣减类型是固定金额的话，可不传这个
	 */
	@ApiField("money_base")
	private String moneyBase;

	/**
	 * 截止时间
	 */
	@ApiField("time_base")
	private String timeBase;

	/**
	 * 1:该时间之前
2:该时间之后
	 */
	@ApiField("time_base_type")
	private String timeBaseType;

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getDeductType() {
		return this.deductType;
	}
	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMoneyBase() {
		return this.moneyBase;
	}
	public void setMoneyBase(String moneyBase) {
		this.moneyBase = moneyBase;
	}

	public String getTimeBase() {
		return this.timeBase;
	}
	public void setTimeBase(String timeBase) {
		this.timeBase = timeBase;
	}

	public String getTimeBaseType() {
		return this.timeBaseType;
	}
	public void setTimeBaseType(String timeBaseType) {
		this.timeBaseType = timeBaseType;
	}

}
