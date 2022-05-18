package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过文本合成语音
 *
 * @author auto create
 * @since 1.0, 2021-04-09 15:07:03
 */
public class AlipayCommerceIotServiceutilBuildtextSendModel extends AlipayObject {

	private static final long serialVersionUID = 5363579962748496967L;

	/**
	 * 要合成语音文件的文本
	 */
	@ApiField("text")
	private String text;

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
