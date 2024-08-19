package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车计费信息
 *
 * @author auto create
 * @since 1.0, 2024-08-12 17:31:52
 */
public class ParkingChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 5563532484369528761L;

	/**
	 * 计费金额；单位元；
	 */
	@ApiField("charge_fee")
	private String chargeFee;

	/**
	 * START_CHARGING：开始计费
FEE_INCREASE：费用增加
TO_TOP：日封顶
	 */
	@ApiField("charge_node")
	private String chargeNode;

	/**
	 * 开始计费或者费用增加的时间；传东八区时间；
	 */
	@ApiField("charge_time")
	private Date chargeTime;

	public String getChargeFee() {
		return this.chargeFee;
	}
	public void setChargeFee(String chargeFee) {
		this.chargeFee = chargeFee;
	}

	public String getChargeNode() {
		return this.chargeNode;
	}
	public void setChargeNode(String chargeNode) {
		this.chargeNode = chargeNode;
	}

	public Date getChargeTime() {
		return this.chargeTime;
	}
	public void setChargeTime(Date chargeTime) {
		this.chargeTime = chargeTime;
	}

}
