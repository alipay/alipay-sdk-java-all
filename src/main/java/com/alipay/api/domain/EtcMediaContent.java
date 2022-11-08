package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC办理时证件资料信息
 *
 * @author auto create
 * @since 1.0, 2022-02-16 17:06:17
 */
public class EtcMediaContent extends AlipayObject {

	private static final long serialVersionUID = 1672439492894335123L;

	/**
	 * "VIO_IDCARD_FRONT":"车主身份证正面照"
"VIO_IDCARD_BACK":"车主身份证反面照"
"VI_LICENSE_FRONT":"行驶证正页"
"VI_LICENSE_VICE":"行驶证副页"
"VI_PHOTO_45":"车头45度照片"
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 资料base64值
	 */
	@ApiField("content")
	private String content;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
