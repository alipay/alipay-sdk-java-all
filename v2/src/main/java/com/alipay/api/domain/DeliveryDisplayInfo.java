package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广展示信息
 *
 * @author auto create
 * @since 1.0, 2023-07-06 19:53:11
 */
public class DeliveryDisplayInfo extends AlipayObject {

	private static final long serialVersionUID = 7574319949339381934L;

	/**
	 * 副标题。
	 */
	@ApiField("main_title")
	private String mainTitle;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	public String getMainTitle() {
		return this.mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}
