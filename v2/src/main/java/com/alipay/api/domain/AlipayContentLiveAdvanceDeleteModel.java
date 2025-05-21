package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除支付宝直播预告
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:58:31
 */
public class AlipayContentLiveAdvanceDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1778838189413118133L;

	/**
	 * 用户生活号标识id
	 */
	@ApiField("alipay_advance_id")
	private String alipayAdvanceId;

	/**
	 * 用户生活号标识id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 预告删除原因
	 */
	@ApiField("reason")
	private String reason;

	public String getAlipayAdvanceId() {
		return this.alipayAdvanceId;
	}
	public void setAlipayAdvanceId(String alipayAdvanceId) {
		this.alipayAdvanceId = alipayAdvanceId;
	}

	public String getAlipayPublicId() {
		return this.alipayPublicId;
	}
	public void setAlipayPublicId(String alipayPublicId) {
		this.alipayPublicId = alipayPublicId;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
