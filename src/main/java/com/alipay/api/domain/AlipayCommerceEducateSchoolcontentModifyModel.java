package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 校园搜索内容提报
 *
 * @author auto create
 * @since 1.0, 2022-07-18 15:00:36
 */
public class AlipayCommerceEducateSchoolcontentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7383521879663375899L;

	/**
	 * 自动关联服务（默认true，推荐使用false）
	 */
	@ApiField("auto_bind")
	private Boolean autoBind;

	/**
	 * 来源应用ID
	 */
	@ApiField("carrier_app_id")
	private String carrierAppId;

	/**
	 * 来源链接
	 */
	@ApiField("carrier_source_url")
	private String carrierSourceUrl;

	/**
	 * 支付宝返回的内容唯一ID，修改时需要传入
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 详情链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 内容类型（text：纯文本、text_step：步骤文本、text_section：分段文本、image：图文、video：视频）
	 */
	@ApiField("display_style")
	private String displayStyle;

	/**
	 * 图片信息
	 */
	@ApiListField("image_data")
	@ApiField("string")
	private List<String> imageData;

	/**
	 * 内容外部ID，要求唯一
	 */
	@ApiField("out_content_id")
	private String outContentId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 已上架服务id列表
	 */
	@ApiListField("service_ids")
	@ApiField("string")
	private List<String> serviceIds;

	/**
	 * 来源ID
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 学校描述
	 */
	@ApiListField("text_data")
	@ApiField("string")
	private List<String> textData;

	/**
	 * 视频信息
	 */
	@ApiListField("video_data")
	@ApiField("string")
	private List<String> videoData;

	public Boolean getAutoBind() {
		return this.autoBind;
	}
	public void setAutoBind(Boolean autoBind) {
		this.autoBind = autoBind;
	}

	public String getCarrierAppId() {
		return this.carrierAppId;
	}
	public void setCarrierAppId(String carrierAppId) {
		this.carrierAppId = carrierAppId;
	}

	public String getCarrierSourceUrl() {
		return this.carrierSourceUrl;
	}
	public void setCarrierSourceUrl(String carrierSourceUrl) {
		this.carrierSourceUrl = carrierSourceUrl;
	}

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDisplayStyle() {
		return this.displayStyle;
	}
	public void setDisplayStyle(String displayStyle) {
		this.displayStyle = displayStyle;
	}

	public List<String> getImageData() {
		return this.imageData;
	}
	public void setImageData(List<String> imageData) {
		this.imageData = imageData;
	}

	public String getOutContentId() {
		return this.outContentId;
	}
	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public List<String> getServiceIds() {
		return this.serviceIds;
	}
	public void setServiceIds(List<String> serviceIds) {
		this.serviceIds = serviceIds;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public List<String> getTextData() {
		return this.textData;
	}
	public void setTextData(List<String> textData) {
		this.textData = textData;
	}

	public List<String> getVideoData() {
		return this.videoData;
	}
	public void setVideoData(List<String> videoData) {
		this.videoData = videoData;
	}

}
