package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliveSubtitleExt;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.subtitle.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-01 20:51:09
 */
public class AntfortuneContentCommunitySubtitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4493182532684686584L;

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
