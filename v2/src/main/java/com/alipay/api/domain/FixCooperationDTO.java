package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生态协同平台中，协作任务的数据模型
 *
 * @author auto create
 * @since 1.0, 2020-03-27 15:57:00
 */
public class FixCooperationDTO extends AlipayObject {

	private static final long serialVersionUID = 2374926295476253446L;

	/**
	 * 协作任务的处理结论
	 */
	@ApiField("conclusion")
	private String conclusion;

	/**
	 * 协作任务的唯一id
	 */
	@ApiField("cooperation_id")
	private Long cooperationId;

	/**
	 * 协作任务的处理完成时间。
	 */
	@ApiField("deal_time")
	private Date dealTime;

	/**
	 * 协作任务的处理说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 实际处理人的名称
	 */
	@ApiField("duty_owner_name")
	private String dutyOwnerName;

	/**
	 * 协作任务的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 协作任务的处理方公司名
	 */
	@ApiField("owner_name")
	private String ownerName;

	/**
	 * 协作任务的处理结果
	 */
	@ApiField("result")
	private String result;

	public String getConclusion() {
		return this.conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public Long getCooperationId() {
		return this.cooperationId;
	}
	public void setCooperationId(Long cooperationId) {
		this.cooperationId = cooperationId;
	}

	public Date getDealTime() {
		return this.dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDutyOwnerName() {
		return this.dutyOwnerName;
	}
	public void setDutyOwnerName(String dutyOwnerName) {
		this.dutyOwnerName = dutyOwnerName;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
