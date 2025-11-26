package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-13 14:32:41
 */
public class ResourceAuditResult extends AlipayObject {

	private static final long serialVersionUID = 8684391456261333832L;

	/**
	 * 要审核的资源value值，文字为文案，图片为图片url，视频为视频url
	 */
	@ApiField("data")
	private String data;

	/**
	 * 不通过原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
