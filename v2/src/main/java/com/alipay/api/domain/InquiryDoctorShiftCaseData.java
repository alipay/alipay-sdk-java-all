package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 专家问诊预约班次对象
 *
 * @author auto create
 * @since 1.0, 2024-03-07 11:00:44
 */
public class InquiryDoctorShiftCaseData extends AlipayObject {

	private static final long serialVersionUID = 6456378278715322559L;

	/**
	 * 外部排班编码
	 */
	@ApiField("ext_shift_case_id")
	private String extShiftCaseId;

	/**
	 * 可预约人数
	 */
	@ApiField("register_num")
	private String registerNum;

	/**
	 * 是否可预约
	 */
	@ApiField("register_status")
	private Boolean registerStatus;

	/**
	 * 问诊预约日期
	 */
	@ApiField("shift_date")
	private String shiftDate;

	/**
	 * 若为预约制，则必填
格式：
时间点-hh:mm
时间段-hh:mm-hh:mm
	 */
	@ApiField("shift_time_slot")
	private String shiftTimeSlot;

	/**
	 * 时间点/时间段/时间区间
	 */
	@ApiField("shift_time_slot_type")
	private String shiftTimeSlotType;

	public String getExtShiftCaseId() {
		return this.extShiftCaseId;
	}
	public void setExtShiftCaseId(String extShiftCaseId) {
		this.extShiftCaseId = extShiftCaseId;
	}

	public String getRegisterNum() {
		return this.registerNum;
	}
	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public Boolean getRegisterStatus() {
		return this.registerStatus;
	}
	public void setRegisterStatus(Boolean registerStatus) {
		this.registerStatus = registerStatus;
	}

	public String getShiftDate() {
		return this.shiftDate;
	}
	public void setShiftDate(String shiftDate) {
		this.shiftDate = shiftDate;
	}

	public String getShiftTimeSlot() {
		return this.shiftTimeSlot;
	}
	public void setShiftTimeSlot(String shiftTimeSlot) {
		this.shiftTimeSlot = shiftTimeSlot;
	}

	public String getShiftTimeSlotType() {
		return this.shiftTimeSlotType;
	}
	public void setShiftTimeSlotType(String shiftTimeSlotType) {
		this.shiftTimeSlotType = shiftTimeSlotType;
	}

}
