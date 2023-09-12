package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权信息查询图片信息对象
 *
 * @author auto create
 * @since 1.0, 2021-01-26 17:22:12
 */
public class AlipayUserPicture extends AlipayObject {

	private static final long serialVersionUID = 3267735682681272432L;

	/**
	 * 图片类型，包括身份证正反面、营业执照等
	 */
	@ApiField("picture_type")
	private String pictureType;

	/**
	 * 用于调用alipay.user.certify.image.fetch接口，获取图片资源
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	public String getPictureType() {
		return this.pictureType;
	}
	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
