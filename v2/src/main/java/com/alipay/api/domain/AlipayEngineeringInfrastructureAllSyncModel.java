package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步原声处理操作
 *
 * @author auto create
 * @since 1.0, 2024-01-25 17:20:50
 */
public class AlipayEngineeringInfrastructureAllSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6589587864175453932L;

	/**
	 * 处理来源平台 用于展示
	 */
	@ApiField("deal_source")
	private String dealSource;

	/**
	 * 完结这条舆情的同学的工号
	 */
	@ApiField("emp_id")
	private String empId;

	/**
	 * 舆情对应的id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 对于当前问题的处理。
	 */
	@ApiField("opinion")
	private String opinion;

	/**
	 * 反馈为问题缺陷，已处理完节
	 */
	@ApiField("status")
	private String status;

	public String getDealSource() {
		return this.dealSource;
	}
	public void setDealSource(String dealSource) {
		this.dealSource = dealSource;
	}

	public String getEmpId() {
		return this.empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOpinion() {
		return this.opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
