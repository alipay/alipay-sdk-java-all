package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliveSubtitleExt;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.subtitle.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AntfortuneContentCommunitySubtitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1549765845541987845L;

	/** 
	 * 纠偏后的结果
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 字幕部分透传的字段
	 */
	@ApiField("ext")
	private AliveSubtitleExt ext;

	/** 
	 * 直播Id
	 */
	@ApiField("live_id")
	private String liveId;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setExt(AliveSubtitleExt ext) {
		this.ext = ext;
	}
	public AliveSubtitleExt getExt( ) {
		return this.ext;
	}

	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}
	public String getLiveId( ) {
		return this.liveId;
	}

}
