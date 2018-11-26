package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.notice.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 14:54:03
 */
public class KoubeiServindustryExerciseNoticeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7832993938576935183L;

	/** 
	 * 通知ID
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
