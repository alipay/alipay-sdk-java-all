package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容风险识别接口服务
 *
 * @author auto create
 * @since 1.0, 2021-06-23 16:17:40
 */
public class AlipaySecurityRiskContentAnalyzeModel extends AlipayObject {

	private static final long serialVersionUID = 5116725475373353511L;

	/**
	 * 内容的发表账户号，用于将需要检测的内容（文本、链接、图片、音视频）等和账户进行关联
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 账户类型：

用户： 0
商户： 1
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 应用主场景
	 */
	@ApiField("app_main_scene")
	private String appMainScene;

	/**
	 * 应用主场景主体ID
	 */
	@ApiField("app_main_scene_id")
	private String appMainSceneId;

	/**
	 * 应用名称，用于区分内容的应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 应用场景
	 */
	@ApiField("app_scene")
	private String appScene;

	/**
	 * 业务ID，例如发帖的帖子ID
	 */
	@ApiField("app_scene_data_id")
	private String appSceneDataId;

	/**
	 * 进行识别的音频地址列表
	 */
	@ApiListField("audio_urls")
	@ApiField("string")
	private List<String> audioUrls;

	/**
	 * 进行识别的链接地址列表
	 */
	@ApiListField("link_urls")
	@ApiField("string")
	private List<String> linkUrls;

	/**
	 * 进行识别的图片地址列表
	 */
	@ApiListField("picture_urls")
	@ApiField("string")
	private List<String> pictureUrls;

	/**
	 * 发布时间
	 */
	@ApiField("publish_date")
	private Date publishDate;

	/**
	 * 文本内容
	 */
	@ApiField("text")
	private String text;

	/**
	 * 文本类型
	 */
	@ApiField("text_type")
	private String textType;

	/**
	 * 进行识别的视频地址列表
	 */
	@ApiListField("video_urls")
	@ApiField("string")
	private List<String> videoUrls;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAppMainScene() {
		return this.appMainScene;
	}
	public void setAppMainScene(String appMainScene) {
		this.appMainScene = appMainScene;
	}

	public String getAppMainSceneId() {
		return this.appMainSceneId;
	}
	public void setAppMainSceneId(String appMainSceneId) {
		this.appMainSceneId = appMainSceneId;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppScene() {
		return this.appScene;
	}
	public void setAppScene(String appScene) {
		this.appScene = appScene;
	}

	public String getAppSceneDataId() {
		return this.appSceneDataId;
	}
	public void setAppSceneDataId(String appSceneDataId) {
		this.appSceneDataId = appSceneDataId;
	}

	public List<String> getAudioUrls() {
		return this.audioUrls;
	}
	public void setAudioUrls(List<String> audioUrls) {
		this.audioUrls = audioUrls;
	}

	public List<String> getLinkUrls() {
		return this.linkUrls;
	}
	public void setLinkUrls(List<String> linkUrls) {
		this.linkUrls = linkUrls;
	}

	public List<String> getPictureUrls() {
		return this.pictureUrls;
	}
	public void setPictureUrls(List<String> pictureUrls) {
		this.pictureUrls = pictureUrls;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTextType() {
		return this.textType;
	}
	public void setTextType(String textType) {
		this.textType = textType;
	}

	public List<String> getVideoUrls() {
		return this.videoUrls;
	}
	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;
	}

}
