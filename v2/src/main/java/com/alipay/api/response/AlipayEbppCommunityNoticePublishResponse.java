package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.notice.publish response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:03:37
 */
public class AlipayEbppCommunityNoticePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 6433614538336276581L;

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
