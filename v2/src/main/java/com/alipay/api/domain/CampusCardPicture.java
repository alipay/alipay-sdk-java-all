package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学生证图片数据模型
 *
 * @author auto create
 * @since 1.0, 2020-10-20 18:41:15
 */
public class CampusCardPicture extends AlipayObject {

	private static final long serialVersionUID = 2632284841154669272L;

	/**
	 * 枚举类型：内页（1）、外页 （2）、录取通知书（3）
	 */
	@ApiField("picture_type")
	private String pictureType;

	/**
	 * 学生证照片链接，注：需要提供图片oss URL访问地址，且url需要长期有效
	 */
	@ApiField("url")
	private String url;

	public String getPictureType() {
		return this.pictureType;
	}
	public void setPictureType(String pictureType) {
		this.pictureType = pictureType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
