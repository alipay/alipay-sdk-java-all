package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 社区物业业主鉴权状态更新
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:30:43
 */
public class AlipayEcoCplifeUseridentityStatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7426288131459467845L;

	/**
	 * 业务明细
	 */
	@ApiField("biz_details")
	private String bizDetails;

	/**
	 * 当前业务状态
	 */
	@ApiField("biz_state")
	private String bizState;

	/**
	 * 业务单据ID
	 */
	@ApiField("req_id")
	private String reqId;

	public String getBizDetails() {
		return this.bizDetails;
	}
	public void setBizDetails(String bizDetails) {
		this.bizDetails = bizDetails;
	}

	public String getBizState() {
		return this.bizState;
	}
	public void setBizState(String bizState) {
		this.bizState = bizState;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

}
