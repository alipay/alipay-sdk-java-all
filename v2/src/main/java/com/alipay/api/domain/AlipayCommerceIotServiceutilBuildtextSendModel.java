package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过文本合成语音
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:48:08
 */
public class AlipayCommerceIotServiceutilBuildtextSendModel extends AlipayObject {

	private static final long serialVersionUID = 1194165934415695877L;

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
