package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字人多分镜页面配置
 *
 * @author auto create
 * @since 1.0, 2024-04-25 17:02:57
 */
public class AvatarMultiPageConfig extends AlipayObject {

	private static final long serialVersionUID = 1654175437862181893L;

	/**
	 * 播报内容
	 */
	@ApiField("ori_text")
	private String oriText;

	/**
	 * 地图图片的url信息
业务方调用天地图的静态地图接口拿到的url信息
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	public String getOriText() {
		return this.oriText;
	}
	public void setOriText(String oriText) {
		this.oriText = oriText;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

}
