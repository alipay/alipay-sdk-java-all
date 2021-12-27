package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝认证图片上传
 *
 * @author auto create
 * @since 1.0, 2021-12-24 13:59:17
 */
public class AlipayUserCertifyImgUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7456476313569881411L;

	/**
	 * 业务来源，用于支付宝认证系统识别是哪个业务方
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 图片对应的base64字符串
	 */
	@ApiField("content")
	private String content;

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

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getStorageType() {
		return this.storageType;
	}
	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

}
