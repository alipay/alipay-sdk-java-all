package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询官网用户组织角色
 *
 * @author auto create
 * @since 1.0, 2025-06-23 15:16:46
 */
public class AnttechOceanbaseUserorgandroleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6638816858989573889L;

	/**
	 * 查询范围的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用户ID
	 */
	@ApiListField("passport_id_list")
	@ApiField("string")
	private List<String> passportIdList;

	/**
	 * 查询的开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<String> getPassportIdList() {
		return this.passportIdList;
	}
	public void setPassportIdList(List<String> passportIdList) {
		this.passportIdList = passportIdList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
