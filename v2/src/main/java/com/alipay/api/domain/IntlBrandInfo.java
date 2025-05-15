package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 品牌信息
 *
 * @author auto create
 * @since 1.0, 2023-12-19 11:44:59
 */
public class IntlBrandInfo extends AlipayObject {

	private static final long serialVersionUID = 1251737789741593531L;

	/**
	 * 品牌多语言描述信息
	 */
	@ApiField("brand_description")
	private String brandDescription;

	/**
	 * 品牌的logo图片信息
	 */
	@ApiField("brand_logo")
	private PhotoInfo brandLogo;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 版本信息
	 */
	@ApiField("brand_version")
	private Long brandVersion;

	/**
	 * 简体中文的字段
	 */
	@ApiField("cn_name")
	private String cnName;

	/**
	 * 扩展信息，map的格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 品牌id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 标签名称
	 */
	@ApiListField("label_names")
	@ApiField("string")
	private List<String> labelNames;

	/**
	 * 头图
	 */
	@ApiField("master_photo")
	private PhotoInfo masterPhoto;

	/**
	 * 售卖区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 视频地址
	 */
	@ApiField("video_url")
	private String videoUrl;

	public String getBrandDescription() {
		return this.brandDescription;
	}
	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public PhotoInfo getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(PhotoInfo brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getBrandVersion() {
		return this.brandVersion;
	}
	public void setBrandVersion(Long brandVersion) {
		this.brandVersion = brandVersion;
	}

	public String getCnName() {
		return this.cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<String> getLabelNames() {
		return this.labelNames;
	}
	public void setLabelNames(List<String> labelNames) {
		this.labelNames = labelNames;
	}

	public PhotoInfo getMasterPhoto() {
		return this.masterPhoto;
	}
	public void setMasterPhoto(PhotoInfo masterPhoto) {
		this.masterPhoto = masterPhoto;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public String getVideoUrl() {
		return this.videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

}
