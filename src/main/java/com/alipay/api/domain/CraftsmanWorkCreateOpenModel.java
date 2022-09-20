package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人作品
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:32:38
 */
public class CraftsmanWorkCreateOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2424179198146197641L;

	/**
	 * 视频资源必传，视频时长，单位(秒)
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 媒体资源id（通过 alipay.offline.material.image.upload 接口上传图片获取的资源id）。图片上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。视频上限最大50M,支持MP4格式。
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 媒体类型。仅支持图片/视频格式，图片类型时传入PICTURE；视频类型时传入VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 外部作品id,isv的appId+外部作品id全局唯一
	 */
	@ApiField("out_work_id")
	private String outWorkId;

	/**
	 * 作品标题，上限10个字。
	 */
	@ApiField("title")
	private String title;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
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

	public String getOutWorkId() {
		return this.outWorkId;
	}
	public void setOutWorkId(String outWorkId) {
		this.outWorkId = outWorkId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
