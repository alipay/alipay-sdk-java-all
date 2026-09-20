package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单入账单
 *
 * @author auto create
 * @since 1.0, 2026-09-04 16:48:28
 */
public class OrderDepositOpenResult extends AlipayObject {

	private static final long serialVersionUID = 8798484383426945685L;

	/**
	 * 入账金额，单位：元
	 */
	@ApiField("deposit_amount")
	private String depositAmount;

	/**
	 * 入账单类型
	 */
	@ApiField("deposit_direction")
	private String depositDirection;

	/**
	 * 入账单号
	 */
	@ApiField("deposit_id")
	private String depositId;

	/**
	 * 入账单状态
	 */
	@ApiField("deposit_status")
	private String depositStatus;

	/**
	 * 最后修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	public String getDepositAmount() {
		return this.depositAmount;
	}
	public void setDepositAmount(String depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getDepositDirection() {
		return this.depositDirection;
	}
	public void setDepositDirection(String depositDirection) {
		this.depositDirection = depositDirection;
	}

	public String getDepositId() {
		return this.depositId;
	}
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}

	public String getDepositStatus() {
		return this.depositStatus;
	}
	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

}
