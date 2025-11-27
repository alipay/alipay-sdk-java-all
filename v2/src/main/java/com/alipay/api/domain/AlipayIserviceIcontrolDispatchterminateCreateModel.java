package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 终止调度
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:32
 */
public class AlipayIserviceIcontrolDispatchterminateCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6235195791997864123L;

	/**
	 * 坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席类型
	 */
	@ApiField("seat_type")
	private String seatType;

	/**
	 * 服务唯一标识
	 */
	@ApiField("service_uniq_code")
	private String serviceUniqCode;

	/**
	 * 技能组id
	 */
	@ApiField("skill_group_id")
	private String skillGroupId;

	/**
	 * 技能组类型
	 */
	@ApiField("skill_group_type")
	private String skillGroupType;

	/**
	 * 调度结果状态
	 */
	@ApiField("status")
	private String status;

	public String getSeatId() {
		return this.seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatType() {
		return this.seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getServiceUniqCode() {
		return this.serviceUniqCode;
	}
	public void setServiceUniqCode(String serviceUniqCode) {
		this.serviceUniqCode = serviceUniqCode;
	}

	public String getSkillGroupId() {
		return this.skillGroupId;
	}
	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
	}

	public String getSkillGroupType() {
		return this.skillGroupType;
	}
	public void setSkillGroupType(String skillGroupType) {
		this.skillGroupType = skillGroupType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
