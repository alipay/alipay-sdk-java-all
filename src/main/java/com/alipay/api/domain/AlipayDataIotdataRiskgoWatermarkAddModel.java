package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链盾内容风控写入数字水印
 *
 * @author auto create
 * @since 1.0, 2019-04-09 16:05:51
 */
public class AlipayDataIotdataRiskgoWatermarkAddModel extends AlipayObject {

	private static final long serialVersionUID = 7456686899898115125L;

	/**
	 * 图片OSS存储地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 写入的水印内容
	 */
	@ApiField("text")
	private String text;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
