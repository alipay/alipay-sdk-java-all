package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手艺人作品返回对象
 *
 * @author auto create
 * @since 1.0, 2017-01-13 16:33:13
 */
public class CraftsmanWorkOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2279322642539371695L;

	/**
	 * 口碑手艺人id。是创建手艺人接口koubei.craftsman.data.provider.create返回的craftsman_id，或通过查询手艺人信息接口koubei.craftsman.data.provider查询craftsman_id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 视频资源必传 视频时长 单位（秒）
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 媒体资源id（通过 alipay.offline.material.image.upload 接口上传图片获取的资源id）。图片上限最大5M,支持bmp,png,jpeg,jpg,gif格式的图片。视频上限最大50M,支持MP4格式。
	 */
	@ApiField("media_id")
	private String mediaId;

	/**
	 * 媒体类型。仅支持图片/视频格式，图片类型时为PICTURE；视频类型时为VIDEO
	 */
	@ApiField("media_type")
	private String mediaType;

	/**
	 * 状态： EFFECTIVE 生效，INVALID 失效。失效状态主要用于平台对作品的处罚，例如作品涉黄赌毒、被用户投诉欺诈等。
	 */
	@ApiField("status")
	private String status;

	/**
	 * 作品标题，上限10个字。
	 */
	@ApiField("title")
	private String title;

	/**
	 * 口碑手艺人作品id，是创建手艺人作品接口koubei.craftsman.data.work.create返回的work_id
	 */
	@ApiField("work_id")
	private String workId;

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWorkId() {
		return this.workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}

}
