package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用回收分账信息
 *
 * @author auto create
 * @since 1.0, 2025-06-24 22:19:59
 */
public class RecycleRoyaltyInfo extends AlipayObject {

	private static final long serialVersionUID = 1633176172777597543L;

	/**
	 * 金额单位元，支持小数点后2位，必须大于0
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账说明，选填
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账收入方类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 转入方2088账户
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 接受分账金额的账户类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 分账阶段
USER_CONFIRMED:用户确认
MERCHANT_RECEIVED_CONFIRMED:回收商确认收货
	 */
	@ApiField("trans_stage")
	private String transStage;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	public String getTransStage() {
		return this.transStage;
	}
	public void setTransStage(String transStage) {
		this.transStage = transStage;
	}

}
