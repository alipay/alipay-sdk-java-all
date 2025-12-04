package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告创意返回信息
 *
 * @author auto create
 * @since 1.0, 2024-03-01 14:59:49
 */
public class AdMaterialResultDTO extends AlipayObject {

	private static final long serialVersionUID = 3453637298316985626L;

	/**
	 * 物料宽度
	 */
	@ApiField("height")
	private Long height;

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
	private Long playTime;

	/**
	 * 物料存储URL地址
	 */
	@ApiField("url")
	private String url;

	/**
	 * 物料宽度
	 */
	@ApiField("width")
	private Long width;

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
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

	public Long getPlayTime() {
		return this.playTime;
	}
	public void setPlayTime(Long playTime) {
		this.playTime = playTime;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
