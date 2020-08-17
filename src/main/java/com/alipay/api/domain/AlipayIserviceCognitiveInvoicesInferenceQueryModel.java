package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增值税发票内容识别
 *
 * @author auto create
 * @since 1.0, 2019-09-05 20:07:54
 */
public class AlipayIserviceCognitiveInvoicesInferenceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4625958645261917725L;

	/**
	 * 图片文件类型，pdf或jpg，默认pdf
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 图片base64加密后的内容
	 */
	@ApiField("img_content")
	private String imgContent;

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getImgContent() {
		return this.imgContent;
	}
	public void setImgContent(String imgContent) {
		this.imgContent = imgContent;
	}

}
