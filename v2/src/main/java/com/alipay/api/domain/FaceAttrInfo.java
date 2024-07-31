package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸属性结构，包括不限于人脸矩形框
 *
 * @author auto create
 * @since 1.0, 2018-09-20 17:52:11
 */
public class FaceAttrInfo extends AlipayObject {

	private static final long serialVersionUID = 4234212388346846671L;

	/**
	 * left,top,width,height 人脸图片中的人脸框的左上点和宽高，图片内坐标，无需脱敏
	 */
	@ApiField("rect")
	private String rect;

	public String getRect() {
		return this.rect;
	}
	public void setRect(String rect) {
		this.rect = rect;
	}

}
