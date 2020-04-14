package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV同步售后单状态
 *
 * @author auto create
 * @since 1.0, 2019-08-29 11:20:20
 */
public class AlipayEcoMycarMaintainAftersaleSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3815153532828154673L;

	/**
	 * 车主平台售后编号
	 */
	@ApiField("aftersale_no")
	private String aftersaleNo;

	/**
	 * 客服拒绝退款原因描述
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 1：受理 2：拒绝
	 */
	@ApiField("status")
	private String status;

	public String getAftersaleNo() {
		return this.aftersaleNo;
	}
	public void setAftersaleNo(String aftersaleNo) {
		this.aftersaleNo = aftersaleNo;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
