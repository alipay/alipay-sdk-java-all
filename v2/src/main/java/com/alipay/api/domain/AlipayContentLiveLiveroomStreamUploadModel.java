package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直播间推流
 *
 * @author auto create
 * @since 1.0, 2025-04-29 14:28:48
 */
public class AlipayContentLiveLiveroomStreamUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7231734951758186172L;

	/**
	 * 脱敏后的支付宝直播间ID
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/**
	 * 主播生活号ID
	 */
	@ApiField("alipay_public_id")
	private String alipayPublicId;

	/**
	 * 直播流地址
	 */
	@ApiField("live_stream_url")
	private String liveStreamUrl;

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

	public String getLiveStreamUrl() {
		return this.liveStreamUrl;
	}
	public void setLiveStreamUrl(String liveStreamUrl) {
		this.liveStreamUrl = liveStreamUrl;
	}

}
