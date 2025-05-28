package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.materiallibrary.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-28 15:37:26
 */
public class AlipayDataDataserviceAdMateriallibraryAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3244423279673246348L;

	/** 
	 * 视频时长
	 */
	@ApiField("duration")
	private Long duration;

	/** 
	 * 文件高
	 */
	@ApiField("height")
	private Long height;

	/** 
	 * 素材类型，1图片，2视频
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
	 * 素材状态：0有效，1无效
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 上传时间
	 */
	@ApiField("upload_time")
	private String uploadTime;

	/** 
	 * 素材库id
	 */
	@ApiField("user_material_lib_id")
	private String userMaterialLibId;

	/** 
	 * 文件宽
	 */
	@ApiField("width")
	private Long width;

	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getDuration( ) {
		return this.duration;
	}

	public void setHeight(Long height) {
		this.height = height;
	}
	public Long getHeight( ) {
		return this.height;
	}

	public void setMaterialType(Long materialType) {
		this.materialType = materialType;
	}
	public Long getMaterialType( ) {
		return this.materialType;
	}

	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
	}
	public String getMaterialValue( ) {
		return this.materialValue;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSize( ) {
		return this.size;
	}

	public void setSource(Long source) {
		this.source = source;
	}
	public Long getSource( ) {
		return this.source;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public String getUploadTime( ) {
		return this.uploadTime;
	}

	public void setUserMaterialLibId(String userMaterialLibId) {
		this.userMaterialLibId = userMaterialLibId;
	}
	public String getUserMaterialLibId( ) {
		return this.userMaterialLibId;
	}

	public void setWidth(Long width) {
		this.width = width;
	}
	public Long getWidth( ) {
		return this.width;
	}

}
