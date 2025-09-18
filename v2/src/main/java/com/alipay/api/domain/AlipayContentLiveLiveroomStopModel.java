package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭直播间
 *
 * @author auto create
 * @since 1.0, 2025-04-22 13:57:46
 */
public class AlipayContentLiveLiveroomStopModel extends AlipayObject {

	private static final long serialVersionUID = 1892681859676735653L;

	/**
	 * 支付宝直播间id，创建直播间接口返回
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 用户生活号标识id
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 关闭原因
	 */
	@ApiField("reason")
	private String reason;

	public String getAlipayLiveId() {
		return this.alipayLiveId;
	}
	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
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
