package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 星云排班基础信息
 *
 * @author auto create
 * @since 1.0, 2024-07-24 20:04:25
 */
public class ShiftBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 2494132745348911677L;

	/**
	 * 班次唯一编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 星云租户下小二的唯一身份标识
	 */
	@ApiField("nebula_user_id")
	private String nebulaUserId;

	/**
	 * 当前班次结束时间,单位/s
	 */
	@ApiField("pb_end_time")
	private Date pbEndTime;

	/**
	 * 当前班次开始时间，单位/s
	 */
	@ApiField("pb_start_time")
	private Date pbStartTime;

	/**
	 * 班次类型
	 */
	@ApiField("shift_type")
	private String shiftType;

	/**
	 * 星云技能组列表，一般只有一个
	 */
	@ApiListField("skill_group_id_list")
	@ApiField("string")
	private List<String> skillGroupIdList;

	/**
	 * 星云租户ID，开放平台appid对应
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getNebulaUserId() {
		return this.nebulaUserId;
	}
	public void setNebulaUserId(String nebulaUserId) {
		this.nebulaUserId = nebulaUserId;
	}

	public Date getPbEndTime() {
		return this.pbEndTime;
	}
	public void setPbEndTime(Date pbEndTime) {
		this.pbEndTime = pbEndTime;
	}

	public Date getPbStartTime() {
		return this.pbStartTime;
	}
	public void setPbStartTime(Date pbStartTime) {
		this.pbStartTime = pbStartTime;
	}

	public String getShiftType() {
		return this.shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}

	public List<String> getSkillGroupIdList() {
		return this.skillGroupIdList;
	}
	public void setSkillGroupIdList(List<String> skillGroupIdList) {
		this.skillGroupIdList = skillGroupIdList;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
