package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询
 *
 * @author auto create
 * @since 1.0, 2019-03-04 21:56:29
 */
public class AlipayDataIotdataDataDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4216688867892156627L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Long endTime;

	/**
	 * 点位id
	 */
	@ApiField("point_id")
	private Long pointId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Long startTime;

	/**
	 * 子业务id
	 */
	@ApiField("sub_biz_id")
	private String subBizId;

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public Long getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public Long getPointId() {
		return this.pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}

	public Long getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public String getSubBizId() {
		return this.subBizId;
	}
	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
	}

}
