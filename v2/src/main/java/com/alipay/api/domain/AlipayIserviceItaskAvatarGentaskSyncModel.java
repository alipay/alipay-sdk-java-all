package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字人短视频生产
 *
 * @author auto create
 * @since 1.0, 2025-03-27 21:27:21
 */
public class AlipayIserviceItaskAvatarGentaskSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4783415233385943711L;

	/**
	 * 位置信息
	 */
	@ApiField("location")
	private String location;

	/**
	 * 多分镜配置
	 */
	@ApiListField("multi_page_config")
	@ApiField("avatar_multi_page_config")
	private List<AvatarMultiPageConfig> multiPageConfig;

	/**
	 * 需要添加水印
	 */
	@ApiField("need_water_mark")
	private Boolean needWaterMark;

	/**
	 * 播报内容，不超过1000个字
	 */
	@ApiField("ori_text")
	private String oriText;

	/**
	 * 播报列表，最终会替换到模版上
	 */
	@ApiListField("ori_text_list")
	@ApiField("string")
	private List<String> oriTextList;

	/**
	 * 项目id
	 */
	@ApiField("project_id")
	private Long projectId;

	/**
	 * 分辨率，单位为像素
	 */
	@ApiField("resolution")
	private String resolution;

	/**
	 * 发生3.0级地震
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 如果模版只有一个页面，分镜有多个页面，如果传入true，会自动把模版应用于所有分镜
	 */
	@ApiField("template_apply_all_page")
	private Boolean templateApplyAllPage;

	/**
	 * 导出视频的模版id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	/**
	 * 填入视频名称，不要超过15个字
	 */
	@ApiField("video_name")
	private String videoName;

	/**
	 * 产出视频类型，默认mp4
	 */
	@ApiField("video_type")
	private String videoType;

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public List<AvatarMultiPageConfig> getMultiPageConfig() {
		return this.multiPageConfig;
	}
	public void setMultiPageConfig(List<AvatarMultiPageConfig> multiPageConfig) {
		this.multiPageConfig = multiPageConfig;
	}

	public Boolean getNeedWaterMark() {
		return this.needWaterMark;
	}
	public void setNeedWaterMark(Boolean needWaterMark) {
		this.needWaterMark = needWaterMark;
	}

	public String getOriText() {
		return this.oriText;
	}
	public void setOriText(String oriText) {
		this.oriText = oriText;
	}

	public List<String> getOriTextList() {
		return this.oriTextList;
	}
	public void setOriTextList(List<String> oriTextList) {
		this.oriTextList = oriTextList;
	}

	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getResolution() {
		return this.resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Boolean getTemplateApplyAllPage() {
		return this.templateApplyAllPage;
	}
	public void setTemplateApplyAllPage(Boolean templateApplyAllPage) {
		this.templateApplyAllPage = templateApplyAllPage;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

	public String getVideoName() {
		return this.videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoType() {
		return this.videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}

}
