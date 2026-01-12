package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 号源VO
 *
 * @author auto create
 * @since 1.0, 2024-12-09 15:02:44
 */
public class SourceVO extends AlipayObject {

	private static final long serialVersionUID = 1289529283286419677L;

	/**
	 * 每小时一个时间段，按该字段分组筛选号源
	 */
	@ApiField("source_group")
	private String sourceGroup;

	/**
	 * 号源id
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 1号
	 */
	@ApiField("source_no")
	private String sourceNo;

	/**
	 * 14:00-14:30
	 */
	@ApiField("source_time")
	private String sourceTime;

	/**
	 * 2024年11月15日
	 */
	@ApiField("treat_date")
	private String treatDate;

	public String getSourceGroup() {
		return this.sourceGroup;
	}
	public void setSourceGroup(String sourceGroup) {
		this.sourceGroup = sourceGroup;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceNo() {
		return this.sourceNo;
	}
	public void setSourceNo(String sourceNo) {
		this.sourceNo = sourceNo;
	}

	public String getSourceTime() {
		return this.sourceTime;
	}
	public void setSourceTime(String sourceTime) {
		this.sourceTime = sourceTime;
	}

	public String getTreatDate() {
		return this.treatDate;
	}
	public void setTreatDate(String treatDate) {
		this.treatDate = treatDate;
	}

}
