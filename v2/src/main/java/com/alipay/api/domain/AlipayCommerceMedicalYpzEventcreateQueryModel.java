package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构智能体SDK质控看板事件创建查询
 *
 * @author auto create
 * @since 1.0, 2026-06-23 11:47:57
 */
public class AlipayCommerceMedicalYpzEventcreateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3824167978665785965L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 机构统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

}
