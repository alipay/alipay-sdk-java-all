package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算库追加
 *
 * @author auto create
 * @since 1.0, 2024-05-27 13:59:48
 */
public class AlipayAssetPointPointprodBudgetlibAddModel extends AlipayObject {

	private static final long serialVersionUID = 2167861793338688246L;

	/**
	 * 预算库追加的积分数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/**
	 * 积分库对应的签约协议Pid
	 */
	@ApiField("contract_pid")
	private String contractPid;

	/**
	 * 预算库追加备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 预算库追加操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 业务号，用于保证幂等
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 预算库对应的积分库ID
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getContractPid() {
		return this.contractPid;
	}
	public void setContractPid(String contractPid) {
		this.contractPid = contractPid;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

}
