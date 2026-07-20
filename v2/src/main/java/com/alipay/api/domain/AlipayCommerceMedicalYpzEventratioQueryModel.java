package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构智能体SDK质控看板事件占比查询
 *
 * @author auto create
 * @since 1.0, 2026-06-23 11:40:53
 */
public class AlipayCommerceMedicalYpzEventratioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2873478478928244744L;

	/**
	 * 查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 统一社会信用代码
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
