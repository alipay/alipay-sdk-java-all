package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 项目时刻表
 *
 * @author auto create
 * @since 1.0, 2021-08-06 20:23:11
 */
public class ProjectTimeTable extends AlipayObject {

	private static final long serialVersionUID = 6798736459688747668L;

	/**
	 * 计划开始时间
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 里程碑
	 */
	@ApiField("content")
	private String content;

	/**
	 * 计划完成时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
