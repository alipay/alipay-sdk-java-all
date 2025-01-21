package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版数据，包含文本、标题、卡片数据
 *
 * @author auto create
 * @since 1.0, 2024-09-10 20:01:19
 */
public class TemplateDataDTO extends AlipayObject {

	private static final long serialVersionUID = 4285942728978243518L;

	/**
	 * 卡片数据，卡片数据是不同卡片对象的JSONSTring字符串
	 */
	@ApiField("card_data")
	private String cardData;

	/**
	 * 文本回答
	 */
	@ApiField("text")
	private String text;

	/**
	 * 卡片标题
	 */
	@ApiField("title")
	private String title;

	public String getCardData() {
		return this.cardData;
	}
	public void setCardData(String cardData) {
		this.cardData = cardData;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
