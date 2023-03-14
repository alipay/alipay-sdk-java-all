package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约目标
 *
 * @author auto create
 * @since 1.0, 2020-09-11 17:08:17
 */
public class ApiContractGoal extends AlipayObject {

	private static final long serialVersionUID = 5774584796879134222L;

	/**
	 * 完成时间
	 */
	@ApiField("complete_date")
	private String completeDate;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private String createDate;

	/**
	 * 当前目标值
	 */
	@ApiField("goal_current_value")
	private Long goalCurrentValue;

	/**
	 * 标的key
	 */
	@ApiField("goal_key")
	private String goalKey;

	/**
	 * cancel
	 */
	@ApiField("goal_status")
	private String goalStatus;

	/**
	 * time、amount、subject
	 */
	@ApiField("goal_type")
	private String goalType;

	/**
	 * 标的目标值
	 */
	@ApiField("goal_value")
	private Long goalValue;

	/**
	 * 事项号
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 最后一次完成时间
	 */
	@ApiField("last_complete_date")
	private String lastCompleteDate;

	public String getCompleteDate() {
		return this.completeDate;
	}
	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}

	public String getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public Long getGoalCurrentValue() {
		return this.goalCurrentValue;
	}
	public void setGoalCurrentValue(Long goalCurrentValue) {
		this.goalCurrentValue = goalCurrentValue;
	}

	public String getGoalKey() {
		return this.goalKey;
	}
	public void setGoalKey(String goalKey) {
		this.goalKey = goalKey;
	}

	public String getGoalStatus() {
		return this.goalStatus;
	}
	public void setGoalStatus(String goalStatus) {
		this.goalStatus = goalStatus;
	}

	public String getGoalType() {
		return this.goalType;
	}
	public void setGoalType(String goalType) {
		this.goalType = goalType;
	}

	public Long getGoalValue() {
		return this.goalValue;
	}
	public void setGoalValue(Long goalValue) {
		this.goalValue = goalValue;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getLastCompleteDate() {
		return this.lastCompleteDate;
	}
	public void setLastCompleteDate(String lastCompleteDate) {
		this.lastCompleteDate = lastCompleteDate;
	}

}
