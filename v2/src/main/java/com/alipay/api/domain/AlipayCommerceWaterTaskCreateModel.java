package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建任务
 *
 * @author auto create
 * @since 1.0, 2024-03-11 11:24:14
 */
public class AlipayCommerceWaterTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4892421893128137576L;

	/**
	 * 创建人id
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 创建人id
	 */
	@ApiField("creator_open_id")
	private String creatorOpenId;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 奖品信息
	 */
	@ApiField("prize_content")
	private PrizeContent prizeContent;

	/**
	 * 二级商户appid
	 */
	@ApiField("second_merchant_appid")
	private String secondMerchantAppid;

	/**
	 * smid，二级商户进件id
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 这里的任务条件是一个map，本期仅支持月的维护
	 */
	@ApiField("task_condition")
	private String taskCondition;

	/**
	 * 任务合约周期单位是月、多少个月就传对应的个数
	 */
	@ApiField("task_contract_period")
	private String taskContractPeriod;

	/**
	 * 任务有效期-结束
	 */
	@ApiField("task_end")
	private Date taskEnd;

	/**
	 * 任务条件类型
	 */
	@ApiField("task_free")
	private String taskFree;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务有效期开始
	 */
	@ApiField("task_start")
	private Date taskStart;

	/**
	 * 任务标题
	 */
	@ApiField("task_title")
	private String taskTitle;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorOpenId() {
		return this.creatorOpenId;
	}
	public void setCreatorOpenId(String creatorOpenId) {
		this.creatorOpenId = creatorOpenId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public PrizeContent getPrizeContent() {
		return this.prizeContent;
	}
	public void setPrizeContent(PrizeContent prizeContent) {
		this.prizeContent = prizeContent;
	}

	public String getSecondMerchantAppid() {
		return this.secondMerchantAppid;
	}
	public void setSecondMerchantAppid(String secondMerchantAppid) {
		this.secondMerchantAppid = secondMerchantAppid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTaskCondition() {
		return this.taskCondition;
	}
	public void setTaskCondition(String taskCondition) {
		this.taskCondition = taskCondition;
	}

	public String getTaskContractPeriod() {
		return this.taskContractPeriod;
	}
	public void setTaskContractPeriod(String taskContractPeriod) {
		this.taskContractPeriod = taskContractPeriod;
	}

	public Date getTaskEnd() {
		return this.taskEnd;
	}
	public void setTaskEnd(Date taskEnd) {
		this.taskEnd = taskEnd;
	}

	public String getTaskFree() {
		return this.taskFree;
	}
	public void setTaskFree(String taskFree) {
		this.taskFree = taskFree;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getTaskStart() {
		return this.taskStart;
	}
	public void setTaskStart(Date taskStart) {
		this.taskStart = taskStart;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
