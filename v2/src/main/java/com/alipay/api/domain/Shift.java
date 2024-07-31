package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选班时段信息
 *
 * @author auto create
 * @since 1.0, 2024-04-28 13:52:40
 */
public class Shift extends AlipayObject {

	private static final long serialVersionUID = 5852869725234496766L;

	/**
	 * 选班时段结束时间
	 */
	@ApiField("end")
	private Date end;

	/**
	 * 选班时段唯一标识
	 */
	@ApiField("shift_id")
	private String shiftId;

	/**
	 * 选班时段开始时间
	 */
	@ApiField("start")
	private Date start;

	public Date getEnd() {
		return this.end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	public String getShiftId() {
		return this.shiftId;
	}
	public void setShiftId(String shiftId) {
		this.shiftId = shiftId;
	}

	public Date getStart() {
		return this.start;
	}
	public void setStart(Date start) {
		this.start = start;
	}

}
