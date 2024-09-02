package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过时间查询注册用户信息
 *
 * @author auto create
 * @since 1.0, 2023-10-08 11:04:47
 */
public class AnttechOceanbasePassportinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6878835985684229439L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 通行证id列表
	 */
	@ApiListField("passport_ids")
	@ApiField("string")
	private List<String> passportIds;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<String> getPassportIds() {
		return this.passportIds;
	}
	public void setPassportIds(List<String> passportIds) {
		this.passportIds = passportIds;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
