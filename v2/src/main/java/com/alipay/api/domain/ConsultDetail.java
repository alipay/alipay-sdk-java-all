package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户咨询详情，由智能体在咨询过程中提取的结构化数据，各行业按 sub_biz_type 约定内部结构
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:17:56
 */
public class ConsultDetail extends AlipayObject {

	private static final long serialVersionUID = 7511364529115844199L;

	/**
	 * 区域偏好
	 */
	@ApiField("area_preference")
	private String areaPreference;

	/**
	 * 预算范围/元
	 */
	@ApiField("budget_range")
	private String budgetRange;

	/**
	 * 期望入住时间
	 */
	@ApiField("move_in_date")
	private String moveInDate;

	/**
	 * 其他诉求
	 */
	@ApiField("other_requirements")
	private String otherRequirements;

	/**
	 * 房型偏好
	 */
	@ApiField("room_type")
	private String roomType;

	public String getAreaPreference() {
		return this.areaPreference;
	}
	public void setAreaPreference(String areaPreference) {
		this.areaPreference = areaPreference;
	}

	public String getBudgetRange() {
		return this.budgetRange;
	}
	public void setBudgetRange(String budgetRange) {
		this.budgetRange = budgetRange;
	}

	public String getMoveInDate() {
		return this.moveInDate;
	}
	public void setMoveInDate(String moveInDate) {
		this.moveInDate = moveInDate;
	}

	public String getOtherRequirements() {
		return this.otherRequirements;
	}
	public void setOtherRequirements(String otherRequirements) {
		this.otherRequirements = otherRequirements;
	}

	public String getRoomType() {
		return this.roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
