package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.notice.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppCommunityNoticeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1474668193424721736L;

	/** 
	 * 支付宝通知id
	 */
	@ApiField("alipay_notice_id")
	private String alipayNoticeId;

	public void setAlipayNoticeId(String alipayNoticeId) {
		this.alipayNoticeId = alipayNoticeId;
	}
	public String getAlipayNoticeId( ) {
		return this.alipayNoticeId;
	}

}
