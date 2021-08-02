package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建业务点位
 *
 * @author auto create
 * @since 1.0, 2019-03-04 21:51:54
 */
public class AlipayDataIotdataBusinessPointCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4568584759927348866L;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	/**
	 * 点位描述，可以是点位的具体地址
	 */
	@ApiField("point_desc")
	private String pointDesc;

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

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getPointDesc() {
		return this.pointDesc;
	}
	public void setPointDesc(String pointDesc) {
		this.pointDesc = pointDesc;
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

}
