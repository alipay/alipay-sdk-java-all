package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物业社区通知通告图片
 *
 * @author auto create
 * @since 1.0, 2018-06-09 20:18:37
 */
public class CplifeNoticeImg extends AlipayObject {

	private static final long serialVersionUID = 2556935597422621965L;

	/**
	 * 在通知中需要展示的图片链接，API调用之后，该图片将会被自动下载到物业社区平台服务器，用于系统显示。API调用成功之后，手工更改URL对应的图片资源时，用户在支付宝APP端看到的图片将保持不变。
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 在通知中需要展示的图片的缩略图链接，API调用之后，该图片将会被自动下载到物业社区平台服务器，用于系统显示。API调用成功之后，手工更改URL对应的图片资源时，用户在支付宝APP端看到的图片将保持不变。
	 */
	@ApiField("thumbnail_url")
	private String thumbnailUrl;

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getThumbnailUrl() {
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

}
