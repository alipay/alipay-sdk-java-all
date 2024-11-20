package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文本信息
 *
 * @author auto create
 * @since 1.0, 2023-07-27 10:24:48
 */
public class TextGroup extends AlipayObject {

	private static final long serialVersionUID = 4552521999451282914L;

	/**
	 * 价格优惠字段
	 */
	@ApiField("discount_text")
	private TextSource discountText;

	/**
	 * 主文本信息List
	 */
	@ApiListField("main_text_list")
	@ApiField("text_source")
	private List<TextSource> mainTextList;

	/**
	 * 副文本信息list
	 */
	@ApiListField("sub_text_list")
	@ApiField("text_source")
	private List<TextSource> subTextList;

	public TextSource getDiscountText() {
		return this.discountText;
	}
	public void setDiscountText(TextSource discountText) {
		this.discountText = discountText;
	}

	public List<TextSource> getMainTextList() {
		return this.mainTextList;
	}
	public void setMainTextList(List<TextSource> mainTextList) {
		this.mainTextList = mainTextList;
	}

	public List<TextSource> getSubTextList() {
		return this.subTextList;
	}
	public void setSubTextList(List<TextSource> subTextList) {
		this.subTextList = subTextList;
	}

}
