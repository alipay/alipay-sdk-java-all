package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 链盾内容风控读取数字水印
 *
 * @author auto create
 * @since 1.0, 2019-04-09 16:06:30
 */
public class AlipayDataIotdataRiskgoWatermarkIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 6846418828216266391L;

	/**
	 * 待提取水印图像oss地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
