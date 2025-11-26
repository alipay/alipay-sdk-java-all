package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动单据信息
 *
 * @author auto create
 * @since 1.0, 2025-05-14 16:02:27
 */
public class CampOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 4395788846448379435L;

	/**
	 * 抽奖平台活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动单据ID
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 外部单号ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 活动单据主状态
	 */
	@ApiField("status")
	private String status;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
