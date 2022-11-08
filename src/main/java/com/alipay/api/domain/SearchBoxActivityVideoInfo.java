package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达活动视频信息
 *
 * @author auto create
 * @since 1.0, 2022-04-08 15:27:52
 */
public class SearchBoxActivityVideoInfo extends AlipayObject {

	private static final long serialVersionUID = 8131557859378493453L;

	/**
	 * 视频按钮文案，2-4个汉字
	 */
	@ApiField("video_btn_text")
	private String videoBtnText;

	/**
	 * 视频封面图片id，图片id可以通过调用接口alipay.open.file.upload上传图片，获取图片id。图片规范：https://opendocs.alipay.com/mini/operation/atmospheredesign
	 */
	@ApiField("video_coverimg_id")
	private String videoCoverimgId;

	/**
	 * 视频副标题，2-16个汉字
	 */
	@ApiField("video_sub_title")
	private String videoSubTitle;

	/**
	 * 视频主标题，2-10个汉字
	 */
	@ApiField("video_title")
	private String videoTitle;

	public String getVideoBtnText() {
		return this.videoBtnText;
	}
	public void setVideoBtnText(String videoBtnText) {
		this.videoBtnText = videoBtnText;
	}

	public String getVideoCoverimgId() {
		return this.videoCoverimgId;
	}
	public void setVideoCoverimgId(String videoCoverimgId) {
		this.videoCoverimgId = videoCoverimgId;
	}

	public String getVideoSubTitle() {
		return this.videoSubTitle;
	}
	public void setVideoSubTitle(String videoSubTitle) {
		this.videoSubTitle = videoSubTitle;
	}

	public String getVideoTitle() {
		return this.videoTitle;
	}
	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

}
