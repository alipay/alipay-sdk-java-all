package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投诉处理时提交的图片文件
 *
 * @author auto create
 * @since 1.0, 2023-05-12 15:44:42
 */
public class ImgFile extends AlipayObject {

	private static final long serialVersionUID = 6464459922568691571L;

	/**
	 * 调用投诉文件上传接口返回的文件url
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 调用投诉文件上传接口返回的文件key
	 */
	@ApiField("img_url_key")
	private String imgUrlKey;

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getImgUrlKey() {
		return this.imgUrlKey;
	}
	public void setImgUrlKey(String imgUrlKey) {
		this.imgUrlKey = imgUrlKey;
	}

}
