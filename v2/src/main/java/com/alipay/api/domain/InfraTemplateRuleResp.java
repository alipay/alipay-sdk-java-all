package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意模版元素限制规则对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:58
 */
public class InfraTemplateRuleResp extends AlipayObject {

	private static final long serialVersionUID = 8845952468592996718L;

	/**
	 * 素材必传校验规则,如果值为MUST则代表必填,如果值为OPTIONAL则代表非必填
	 */
	@ApiField("check_rule")
	private String checkRule;

	/**
	 * 元素限制规则描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 高,单位为px(图片与视频的尺寸高度限制)
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 图片大小最大限制，限制单位：KB； 
视频大小最大限制，限制单位：KB； 
文本最大长度限制
	 */
	@ApiField("max_size")
	private Long maxSize;

	/**
	 * 最低码率，单位为vbs(仅针对与视频)
	 */
	@ApiField("min_bitrate")
	private Long minBitrate;

	/**
	 * 视频播放时长下限，单位为毫秒(仅针对与视频)
	 */
	@ApiField("min_play_time")
	private Long minPlayTime;

	/**
	 * 文本长度最小限制(仅针对文本)
	 */
	@ApiField("min_size")
	private Long minSize;

	/**
	 * 宽,单位为px(图片与视频的尺寸宽度限制)
	 */
	@ApiField("width")
	private Long width;

	public String getCheckRule() {
		return this.checkRule;
	}
	public void setCheckRule(String checkRule) {
		this.checkRule = checkRule;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getMaxSize() {
		return this.maxSize;
	}
	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
	}

	public Long getMinBitrate() {
		return this.minBitrate;
	}
	public void setMinBitrate(Long minBitrate) {
		this.minBitrate = minBitrate;
	}

	public Long getMinPlayTime() {
		return this.minPlayTime;
	}
	public void setMinPlayTime(Long minPlayTime) {
		this.minPlayTime = minPlayTime;
	}

	public Long getMinSize() {
		return this.minSize;
	}
	public void setMinSize(Long minSize) {
		this.minSize = minSize;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
