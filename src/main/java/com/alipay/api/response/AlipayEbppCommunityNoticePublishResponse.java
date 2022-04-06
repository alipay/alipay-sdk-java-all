package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:33:36
 */
public class AlipayEbppCommunityNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 2875432779959573696L;

	/** 
	 * 公告id
	 */
	@ApiField("alipay_notice_id")
	private Long alipayNoticeId;

	public void setAlipayNoticeId(Long alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}
	public Long getAlipayNoticeId( ) {
		return this.alipayNoticeId;
	}

}
