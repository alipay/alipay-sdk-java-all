package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝预算库预算回收
 *
 * @author auto create
 * @since 1.0, 2019-08-21 09:51:58
 */
public class AlipayAssetPointPointprodBudgetlibReturnModel extends AlipayObject {

	private static final long serialVersionUID = 4614681598443524321L;

	/**
	 * 预算回收数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 积分库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/**
	 * 积分库对应的签约协议Pid
	 */
	@ApiField("contract_pid")
	private String contractPid;

	/**
	 * 预算库预算回收操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 业务号，用于幂等
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
