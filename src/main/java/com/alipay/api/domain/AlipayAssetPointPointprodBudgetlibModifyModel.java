package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预算库有效期修改
 *
 * @author auto create
 * @since 1.0, 2019-08-29 17:46:37
 */
public class AlipayAssetPointPointprodBudgetlibModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6752225674692854465L;

	/**
	 * 预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/**
	 * 积分库对应的签约协议id
	 */
	@ApiField("contract_pid")
	private String contractPid;

	/**
	 * 预算库有效期 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 预算库对应的积分库ID
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	/**
	 * 预算库有效期 起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
