package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易对手企业信息
 *
 * @author auto create
 * @since 1.0, 2025-06-30 18:46:43
 */
public class CounterpartyInfo extends AlipayObject {

	private static final long serialVersionUID = 8571144261434957581L;

	/**
	 * 与对手方近6个月资金往来金额等级
	 */
	@ApiField("counter_amount_range")
	private String counterAmountRange;

	/**
	 * 与对手方近6个月资金往来频次等级
	 */
	@ApiField("counter_count_range")
	private String counterCountRange;

	/**
	 * 对手方企业名称
	 */
	@ApiField("counter_org_name")
	private String counterOrgName;

	/**
	 * 对手方注册号
	 */
	@ApiField("counter_reg_no")
	private String counterRegNo;

	/**
	 * 对手方统一社会信用代码
	 */
	@ApiField("counter_uscc")
	private String counterUscc;

	/**
	 * 转账方向
	 */
	@ApiField("transfer_direction")
	private String transferDirection;

	public String getCounterAmountRange() {
		return this.counterAmountRange;
	}
	public void setCounterAmountRange(String counterAmountRange) {
		this.counterAmountRange = counterAmountRange;
	}

	public String getCounterCountRange() {
		return this.counterCountRange;
	}
	public void setCounterCountRange(String counterCountRange) {
		this.counterCountRange = counterCountRange;
	}

	public String getCounterOrgName() {
		return this.counterOrgName;
	}
	public void setCounterOrgName(String counterOrgName) {
		this.counterOrgName = counterOrgName;
	}

	public String getCounterRegNo() {
		return this.counterRegNo;
	}
	public void setCounterRegNo(String counterRegNo) {
		this.counterRegNo = counterRegNo;
	}

	public String getCounterUscc() {
		return this.counterUscc;
	}
	public void setCounterUscc(String counterUscc) {
		this.counterUscc = counterUscc;
	}

	public String getTransferDirection() {
		return this.transferDirection;
	}
	public void setTransferDirection(String transferDirection) {
		this.transferDirection = transferDirection;
	}

}
