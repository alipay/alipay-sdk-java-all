package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作品内容
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:35:15
 */
public class OpusInfo extends AlipayObject {

	private static final long serialVersionUID = 6325682835525687755L;

	/**
	 * 展示权重；必须大于等于0；排序规则：权重倒叙;默认值为0
	 */
	@ApiField("display_weight")
	private String displayWeight;

	/**
	 * 外部作品id
	 */
	@ApiField("external_opus_id")
	private String externalOpusId;

	/**
	 * 素材id
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 头图素材type；
枚举类型：PICTURE/VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 素材url
	 */
	@ApiField("media_url")
	private String mediaUrl;

	/**
	 * 作品id
	 */
	@ApiField("opus_id")
	private String opusId;

	/**
	 * 素材标题
	 */
	@ApiField("title")
	private String title;

	public String getDisplayWeight() {
		return this.displayWeight;
	}
	public void setDisplayWeight(String displayWeight) {
		this.displayWeight = displayWeight;
	}

	public String getExternalOpusId() {
		return this.externalOpusId;
	}
	public void setExternalOpusId(String externalOpusId) {
		this.externalOpusId = externalOpusId;
	}

	public String getMediaId() {
		return this.mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaType() {
		return this.mediaType;
	}
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getMediaUrl() {
		return this.mediaUrl;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public String getOpusId() {
		return this.opusId;
	}
	public void setOpusId(String opusId) {
		this.opusId = opusId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
