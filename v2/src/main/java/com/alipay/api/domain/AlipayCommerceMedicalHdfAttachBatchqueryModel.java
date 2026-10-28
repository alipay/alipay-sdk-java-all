package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 好大夫附件链接批量查询服务
 *
 * @author auto create
 * @since 1.0, 2026-10-14 16:27:59
 */
public class AlipayCommerceMedicalHdfAttachBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2848542544515886654L;

	/**
	 * null
	 */
	@ApiListField("attachment_id_list")
	@ApiField("string")
	private List<String> attachmentIdList;

	/**
	 * 鉴权参数
	 */
	@ApiField("auth_params")
	private String authParams;

	/**
	 * 鉴权方式（authtu转调时透传，由hdffile侧完成鉴权）
	 */
	@ApiField("auth_way")
	private String authWay;

	/**
	 * 业务key（用于计算图片参数）
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 业务桶类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 超时时间ms
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 高度px
	 */
	@ApiField("height")
	private String height;

	/**
	 * 图片格式：jpg、jpeg、png、gif、bmp、webp、tiff、svg、ico、avif、heic等
	 */
	@ApiField("img_format")
	private String imgFormat;

	/**
	 * 调用方用户ID（鉴权用）
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * null
	 */
	@ApiListField("patient_attachment_id_list")
	@ApiField("string")
	private List<String> patientAttachmentIdList;

	/**
	 * 附件参数
	 */
	@ApiField("pic_params")
	private String picParams;

	/**
	 * 尺寸类型
	 */
	@ApiField("size_type")
	private String sizeType;

	/**
	 * 宽度px
	 */
	@ApiField("width")
	private String width;

	public List<String> getAttachmentIdList() {
		return this.attachmentIdList;
	}
	public void setAttachmentIdList(List<String> attachmentIdList) {
		this.attachmentIdList = attachmentIdList;
	}

	public String getAuthParams() {
		return this.authParams;
	}
	public void setAuthParams(String authParams) {
		this.authParams = authParams;
	}

	public String getAuthWay() {
		return this.authWay;
	}
	public void setAuthWay(String authWay) {
		this.authWay = authWay;
	}

	public String getBiz() {
		return this.biz;
	}
	public void setBiz(String biz) {
		this.biz = biz;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getHeight() {
		return this.height;
	}
	public void setHeight(String height) {
		this.height = height;
	}

	public String getImgFormat() {
		return this.imgFormat;
	}
	public void setImgFormat(String imgFormat) {
		this.imgFormat = imgFormat;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public List<String> getPatientAttachmentIdList() {
		return this.patientAttachmentIdList;
	}
	public void setPatientAttachmentIdList(List<String> patientAttachmentIdList) {
		this.patientAttachmentIdList = patientAttachmentIdList;
	}

	public String getPicParams() {
		return this.picParams;
	}
	public void setPicParams(String picParams) {
		this.picParams = picParams;
	}

	public String getSizeType() {
		return this.sizeType;
	}
	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
