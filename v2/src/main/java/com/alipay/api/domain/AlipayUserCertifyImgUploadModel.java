package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认证图片上传
 *
 * @author auto create
 * @since 1.0, 2022-01-14 11:04:13
 */
public class AlipayUserCertifyImgUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1772888647469863155L;

	/**
	 * 业务来源，用于支付宝认证系统识别是哪个业务方
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 标识一个业务证件的ID；如果没有可以传UUID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 证件类型；参考com.alipay.cif.model.core.emuns.CertTypeEnum
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 图片对应的base64字符串
	 */
	@ApiField("content")
	private String content;

	/**
	 * 图片类型；FACE正面，VERSO背面
	 */
	@ApiField("image_type")
	private String imageType;

	/**
	 * 指定图片的存储类型，SFS与OSS,目前只有这两个值，个人图片要指定为SFS，企业类型图片要指定为OSS
	 */
	@ApiField("storage_type")
	private String storageType;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImageType() {
		return this.imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getStorageType() {
		return this.storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

}
