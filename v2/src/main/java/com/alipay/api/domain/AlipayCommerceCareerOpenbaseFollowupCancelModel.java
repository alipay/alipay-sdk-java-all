package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI跟进-取消任务
 *
 * @author auto create
 * @since 1.0, 2026-10-14 15:32:58
 */
public class AlipayCommerceCareerOpenbaseFollowupCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1798656958289829378L;

	/**
	 * 客户业务单号，任务定位键。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 取消原因，仅作记录，不影响状态流转；平台统一按客户主动取消处理。
	 */
	@ApiField("reason")
	private String reason;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
