package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家收费规则
 *
 * @author auto create
 * @since 1.0, 2025-11-26 11:10:39
 */
public class MerchantChargingRule extends AlipayObject {

	private static final long serialVersionUID = 6644581541414772222L;

	/**
	 * 收费金额，单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 收费模式，参考枚举值
	 */
	@ApiField("charging_mode")
	private String chargingMode;

	/**
	 * 主体id
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 支付宝主体信息
	 */
	@ApiField("principal_type")
	private String principalType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getChargingMode() {
		return this.chargingMode;
	}
	public void setChargingMode(String chargingMode) {
		this.chargingMode = chargingMode;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

}
