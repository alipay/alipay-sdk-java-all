package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告物料信息
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:16:36
 */
public class AdMaterial extends AlipayObject {

	private static final long serialVersionUID = 3212793838975225579L;

	/**
	 * 物料宽度
	 */
	@ApiField("height")
	private String height;

	/**
	 * 物料模板位置编号，编号从0开始
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 物料类型，IMG：图片；VIDEO：视频；H5：H5
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 物料文件签名，天猫业务签名使用MD5算法，使用base64编码，用于物料转储校验
	 */
	@ApiField("mt_signature")
	private String mtSignature;

	/**
	 * 物料播放时长，单位：毫秒
	 */
	@ApiField("play_time")
	private String playTime;

	/**
	 * 物料存储URL地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 物料宽度
	 */
	@ApiField("width")
	private String width;

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMtSignature() {
		return this.mtSignature;
	}
	public void setMtSignature(String mtSignature) {
		this.mtSignature = mtSignature;
	}

	public String getPlayTime() {
		return this.playTime;
	}
	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
