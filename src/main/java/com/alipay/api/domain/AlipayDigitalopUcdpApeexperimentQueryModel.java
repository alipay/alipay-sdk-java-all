package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape实验查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-06 20:01:18
 */
public class AlipayDigitalopUcdpApeexperimentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1623366816175759538L;

	/**
	 * 查询实验数据的结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 查询实验数据的开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
