package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoTBPaaS通用二维码图片生成
 *
 * @author auto create
 * @since 1.0, 2021-09-07 15:03:04
 */
public class AlipayOpenIotbpaasQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8337114385757951384L;

	/**
	 * 文本内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 二维码大小，默认M，取值L、M、S
	 */
	@ApiField("size")
	private String size;

	/**
	 * 二维码样式，默认BLANK，取值同码平台定义，有NOSTYLE、BLACK可选
	 */
	@ApiField("style")
	private String style;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getStyle() {
		return this.style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

}
