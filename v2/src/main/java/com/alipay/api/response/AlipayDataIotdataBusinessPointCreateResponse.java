package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.business.point.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 20:32:30
 */
public class AlipayDataIotdataBusinessPointCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3755681316356249633L;

	/** 
	 * 点位描述
	 */
	@ApiField("point_desc")
	private String pointDesc;

	/** 
	 * 生成的点位id
	 */
	@ApiField("point_id")
	private Long pointId;

	/** 
	 * 点位名称
	 */
	@ApiField("point_name")
	private String pointName;

	/** 
	 * 点位备注信息
	 */
	@ApiField("remark")
	private String remark;

	/** 
	 * 点位状态
	 */
	@ApiField("status")
	private Long status;

	public void setPointDesc(String pointDesc) {
		this.pointDesc = pointDesc;
	}
	public String getPointDesc( ) {
		return this.pointDesc;
	}

	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}
	public Long getPointId( ) {
		return this.pointId;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public String getPointName( ) {
		return this.pointName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemark( ) {
		return this.remark;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

}
