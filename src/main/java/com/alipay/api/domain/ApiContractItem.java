package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合约事项
 *
 * @author auto create
 * @since 1.0, 2020-09-11 17:08:17
 */
public class ApiContractItem extends AlipayObject {

	private static final long serialVersionUID = 3424829265641285931L;

	/**
	 * 实际逾期时间
	 */
	@ApiField("actual_due_time")
	private String actualDueTime;

	/**
	 * 完成时间
	 */
	@ApiField("complete_time")
	private String completeTime;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 逾期时间
	 */
	@ApiField("due_time")
	private String dueTime;

	/**
	 * 事项目标
	 */
	@ApiListField("goals")
	@ApiField("api_contract_goal")
	private List<ApiContractGoal> goals;

	/**
	 * 事项号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 事项期数
	 */
	@ApiField("item_phase")
	private String itemPhase;

	/**
	 * PENDING_COMPLETE、COMPLETE、UNDONE、CLOSE
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 发约单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	/**
	 * 每一期事项下的次数
	 */
	@ApiField("phase_serial_num")
	private String phaseSerialNum;

	/**
	 * 模版号
	 */
	@ApiField("template_no")
	private String templateNo;

	public String getActualDueTime() {
		return this.actualDueTime;
	}
	public void setActualDueTime(String actualDueTime) {
		this.actualDueTime = actualDueTime;
	}

	public String getCompleteTime() {
		return this.completeTime;
	}
	public void setCompleteTime(String completeTime) {
		this.completeTime = completeTime;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getDueTime() {
		return this.dueTime;
	}
	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}

	public List<ApiContractGoal> getGoals() {
		return this.goals;
	}
	public void setGoals(List<ApiContractGoal> goals) {
		this.goals = goals;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemPhase() {
		return this.itemPhase;
	}
	public void setItemPhase(String itemPhase) {
		this.itemPhase = itemPhase;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

	public String getPhaseSerialNum() {
		return this.phaseSerialNum;
	}
	public void setPhaseSerialNum(String phaseSerialNum) {
		this.phaseSerialNum = phaseSerialNum;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

}
