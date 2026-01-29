package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 素材详情
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:34:22
 */
public class AdMaterialDetail extends AlipayObject {

	private static final long serialVersionUID = 6229841859559964867L;

	/**
	 * 播放时长，单位ms
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 素材高度，单位px
	 */
	@ApiField("height")
	private Long height;

	/**
	 * 素材类型，1图片2视频
	 */
	@ApiField("material_type")
	private Long materialType;

	/**
	 * 素材值
	 */
	@ApiField("material_value")
	private String materialValue;

	/**
	 * 文件大小，单位kb
	 */
	@ApiField("size")
	private Long size;

	/**
	 * 素材来源
	 */
	@ApiField("source")
	private Long source;

	/**
	 * 素材状态 0有效，1已删除
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 上传时间，重复上传会覆盖
	 */
	@ApiField("upload_time")
	private String uploadTime;

	/**
	 * 素材库id
	 */
	@ApiField("user_material_lib_id")
	private String userMaterialLibId;

	/**
	 * 素材宽度，单位px
	 */
	@ApiField("width")
	private Long width;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getHeight() {
		return this.height;
	}
	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}

	public String getMaterialValue() {
		return this.materialValue;
	}
	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
	}

	public Long getSize() {
		return this.size;
	}
	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSource() {
		return this.source;
	}
	public void setSource(Long source) {
		this.source = source;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getUploadTime() {
		return this.uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getUserMaterialLibId() {
		return this.userMaterialLibId;
	}
	public void setUserMaterialLibId(String userMaterialLibId) {
		this.userMaterialLibId = userMaterialLibId;
	}

	public Long getWidth() {
		return this.width;
	}
	public void setWidth(Long width) {
		this.width = width;
	}

}
