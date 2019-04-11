package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值税发票内容识别
 *
 * @author auto create
 * @since 1.0, 2019-01-25 17:15:05
 */
public class AlipayIserviceCognitiveInvoicesInferenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6379292412669437381L;

	/**
	 * 图片base64加密后的内容
	 */
	@ApiField("img_content")
	private String imgContent;

	public String getImgContent() {
		return this.imgContent;
	}
	public void setImgContent(String imgContent) {
		this.imgContent = imgContent;
	}

}
