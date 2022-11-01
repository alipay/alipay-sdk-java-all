package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 表格类型的图片信息抽取服务
 *
 * @author auto create
 * @since 1.0, 2018-07-04 14:04:09
 */
public class AlipayIserviceCognitiveOcrTablesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5329537463295666819L;

	/**
	 * 图片base64后内容，大小控制在1M以内
	 */
	@ApiField("image_content")
	private String imageContent;

	public String getImageContent() {
		return this.imageContent;
	}
	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
	}

}
