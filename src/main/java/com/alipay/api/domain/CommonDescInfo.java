package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 到位通用的描述信息对象
 *
 * @author auto create
 * @since 1.0, 2017-01-16 11:30:10
 */
public class CommonDescInfo extends AlipayObject {

	private static final long serialVersionUID = 5833566618597467256L;

	/**
	 * 图片URL地址，最大不超过60K，必须使用https
	 */
	@ApiField("img")
	private String img;

	/**
	 * 文本描述
	 */
	@ApiField("text")
	private String text;

	public String getImg() {
		return this.img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
