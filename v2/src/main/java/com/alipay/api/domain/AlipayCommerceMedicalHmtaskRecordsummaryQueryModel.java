package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家空间减脂减重活动记录聚合信息查询
 *
 * @author auto create
 * @since 1.0, 2026-09-21 11:12:57
 */
public class AlipayCommerceMedicalHmtaskRecordsummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5569562872792143441L;

	/**
	 * 结束日期，格式：yyyy-mm-dd
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 记录类型
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 开始日期，格式：yyyy-mm-dd
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
