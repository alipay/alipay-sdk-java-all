package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医院数据同步接口
 *
 * @author auto create
 * @since 1.0, 2019-09-17 22:53:33
 */
public class AlipayEcoMedicalcareHospitalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3854197325278968497L;

	/**
	 * 增量查询变更数据所属时间段的终止时间,yyyyMMdd格式
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 增量查询变更数据所属时间段的起始时间,yyyyMMdd格式
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
