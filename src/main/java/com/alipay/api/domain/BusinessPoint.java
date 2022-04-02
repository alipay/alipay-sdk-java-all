package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务点位列表
 *
 * @author auto create
 * @since 1.0, 2019-01-23 11:54:09
 */
public class BusinessPoint extends AlipayObject {

	private static final long serialVersionUID = 4623238718668645583L;

	/**
	 * 点位描述
	 */
	@ApiField("point_desc")
	private String pointDesc;

	/**
	 * 业务点位id
	 */
	@ApiField("point_id")
	private Long pointId;

	/**
	 * 点位名称
	 */
	@ApiField("point_name")
	private String pointName;

	/**
	 * 点位备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 点位状态
	 */
	@ApiField("status")
	private Long status;

	public String getPointDesc() {
		return this.pointDesc;
	}
	public void setPointDesc(String pointDesc) {
		this.pointDesc = pointDesc;
	}

	public Long getPointId() {
		return this.pointId;
	}
	public void setPointId(Long pointId) {
		this.pointId = pointId;
	}

	public String getPointName() {
		return this.pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
