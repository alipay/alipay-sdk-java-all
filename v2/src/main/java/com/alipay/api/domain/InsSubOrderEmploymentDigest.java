package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用工场景团单子单信息
 *
 * @author auto create
 * @since 1.0, 2023-10-25 16:32:51
 */
public class InsSubOrderEmploymentDigest extends AlipayObject {

	private static final long serialVersionUID = 3224485743747274189L;

	/**
	 * 子订单关闭原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/**
	 * 外部员工编号
	 */
	@ApiField("out_employee_id")
	private String outEmployeeId;

	/**
	 * 蚂蚁保保单凭证号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 保费 ;单位分
	 */
	@ApiField("premium")
	private Long premium;

	/**
	 * 蚂蚁保子单单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 子订单状态
初始态 INIT
正常处理终态 ISSUED/SURRENDERRED
失败处理终态 CLOSE
中间态  CREATED/TO_BE_PAID/PAID
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 保额 ;单位分
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public String getCloseReason() {
		return this.closeReason;
	}
	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getOutEmployeeId() {
		return this.outEmployeeId;
	}
	public void setOutEmployeeId(String outEmployeeId) {
		this.outEmployeeId = outEmployeeId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Long getPremium() {
		return this.premium;
	}
	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
