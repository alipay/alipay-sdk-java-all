package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc申请单资料列表
 *
 * @author auto create
 * @since 1.0, 2021-12-28 20:29:30
 */
public class MediaContentList extends AlipayObject {

	private static final long serialVersionUID = 3846481364391925337L;

	/**
	 * 业务标识。
1：身份证正面照片；
2：身份证背面照片；
3：行驶证正页正面照片；
4：行驶证副页正面照片；
5：车头照片
	 */
	@ApiField("biz_type")
	private Long bizType;

	/**
	 * 资料base64值
	 */
	@ApiField("content")
	private String content;

	/**
	 * 媒体类型。
1：jpg图片；
2：png图片；
3：mp4视频
	 */
	@ApiField("media_type")
	private Long mediaType;

	public Long getBizType() {
		return this.bizType;
	}
	public void setBizType(Long bizType) {
		this.bizType = bizType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Long getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(Long mediaType) {
		this.mediaType = mediaType;
	}

}
