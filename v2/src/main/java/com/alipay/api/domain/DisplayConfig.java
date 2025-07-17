package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券的描述信息
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
public class DisplayConfig extends AlipayObject {

	private static final long serialVersionUID = 7462897967916297771L;

	/**
	 * 券的宣传语
含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 券的宣传图片文件ID
含圈人的直领活动，且投放渠道选择了店铺的情况下必填
	 */
	@ApiField("slogan_img")
	private String sloganImg;

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getSloganImg() {
		return this.sloganImg;
	}
	public void setSloganImg(String sloganImg) {
		this.sloganImg = sloganImg;
	}

}
