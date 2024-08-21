package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁计划报价查询
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:07:08
 */
public class AlipayCommerceLeaseOfferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6182295912549568431L;

	/**
	 * 租赁商pid
	 */
	@ApiField("lessor_pid")
	private String lessorPid;

	/**
	 * 租赁计划id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getLessorPid() {
		return this.lessorPid;
	}
	public void setLessorPid(String lessorPid) {
		this.lessorPid = lessorPid;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
