package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商报名计划信息
 *
 * @author auto create
 * @since 1.0, 2023-06-28 14:03:39
 */
public class LeaseEnrollDTO extends AlipayObject {

	private static final long serialVersionUID = 4797536349337857757L;

	/**
	 * 品牌商pid
	 */
	@ApiField("brand_pid")
	private String brandPid;

	/**
	 * 计划创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 租赁商计划报名状态，spu下有一个skuid报价就为已报价
	 */
	@ApiField("status")
	private String status;

	public String getBrandPid() {
		return this.brandPid;
	}
	public void setBrandPid(String brandPid) {
		this.brandPid = brandPid;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
