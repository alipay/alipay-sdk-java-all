package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 职得工作证图片上传
 *
 * @author auto create
 * @since 1.0, 2022-05-07 10:18:07
 */
public class ZhimaCustomerJobworthPictureUploadModel extends AlipayObject {

	private static final long serialVersionUID = 4721476177722445511L;

	/**
	 * 图片对应的base64字符串，支持jpg和png，1M之内
	 */
	@ApiField("content")
	private String content;

	/**
	 * 只能传入指定类型，具体类型看文档
	 */
	@ApiField("pic_type")
	private String picType;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getPicType() {
		return this.picType;
	}
	public void setPicType(String picType) {
		this.picType = picType;
	}

}
