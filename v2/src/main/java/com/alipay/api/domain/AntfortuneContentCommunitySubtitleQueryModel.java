package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询字幕的纠正文案
 *
 * @author auto create
 * @since 1.0, 2021-04-01 20:51:09
 */
public class AntfortuneContentCommunitySubtitleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5757442677528477132L;

	/**
	 * 10s内字幕文本，最多1000个字
	 */
	@ApiField("content")
	private String content;

	/**
	 * 字幕扩展字段
	 */
	@ApiField("ext")
	private AliveSubtitleExt ext;

	/**
	 * 直播ID
	 */
	@ApiField("live_id")
	private String liveId;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public AliveSubtitleExt getExt() {
		return this.ext;
	}
	public void setExt(AliveSubtitleExt ext) {
		this.ext = ext;
	}

	public String getLiveId() {
		return this.liveId;
	}
	public void setLiveId(String liveId) {
		this.liveId = liveId;
	}

}
