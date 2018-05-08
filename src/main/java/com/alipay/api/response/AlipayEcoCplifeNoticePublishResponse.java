package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 18:17:16
 */
public class AlipayEcoCplifeNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 1562542693959789819L;

	/** 
	 * 支付宝平台统一生产的通知公告唯一ID标示.
	 */
	@ApiField("notice_id")
	private String noticeId;

	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeId( ) {
		return this.noticeId;
	}

}
