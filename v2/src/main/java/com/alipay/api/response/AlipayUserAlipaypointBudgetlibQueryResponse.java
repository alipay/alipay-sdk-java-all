package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaypoint.budgetlib.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-16 10:57:11
 */
public class AlipayUserAlipaypointBudgetlibQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4229567485854351767L;

	/** 
	 * 集分宝预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	/** 
	 * 预算库的中文描述
	 */
	@ApiField("budget_desc")
	private String budgetDesc;

	/** 
	 * 预算库累计积分数
	 */
	@ApiField("cumulative_amount")
	private Long cumulativeAmount;

	/** 
	 * 预算库是否为生效状态标识，true-生效中，false-已失效
	 */
	@ApiField("enabled")
	private Boolean enabled;

	/** 
	 * 预算库结束时间, yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 预算库当前剩余积分数
	 */
	@ApiField("remain_amount")
	private Long remainAmount;

	/** 
	 * 预算库开始时间, yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}
	public String getBudgetCode( ) {
		return this.budgetCode;
	}

	public void setBudgetDesc(String budgetDesc) {
		this.budgetDesc = budgetDesc;
	}
	public String getBudgetDesc( ) {
		return this.budgetDesc;
	}

	public void setCumulativeAmount(Long cumulativeAmount) {
		this.cumulativeAmount = cumulativeAmount;
	}
	public Long getCumulativeAmount( ) {
		return this.cumulativeAmount;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getEnabled( ) {
		return this.enabled;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setRemainAmount(Long remainAmount) {
		this.remainAmount = remainAmount;
	}
	public Long getRemainAmount( ) {
		return this.remainAmount;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

}
