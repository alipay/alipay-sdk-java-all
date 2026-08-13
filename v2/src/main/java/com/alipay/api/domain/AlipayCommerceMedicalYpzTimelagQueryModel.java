package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询时差数据明细
 *
 * @author auto create
 * @since 1.0, 2026-08-13 17:10:54
 */
public class AlipayCommerceMedicalYpzTimelagQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4136558914777896759L;

	/**
	 * 查询结束时间（事件发生时间）
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 查询开始时间（事件发生时间）
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 医疗机构统一社会信用代码
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
