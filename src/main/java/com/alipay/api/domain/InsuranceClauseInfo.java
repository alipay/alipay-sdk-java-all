package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险条款信息
 *
 * @author auto create
 * @since 1.0, 2021-06-21 19:31:43
 */
public class InsuranceClauseInfo extends AlipayObject {

	private static final long serialVersionUID = 4344152247511259645L;

	/**
	 * 附加条款内容
	 */
	@ApiField("additional_item")
	private String additionalItem;

	/**
	 * 主险条款代码
	 */
	@ApiField("main_item_code")
	private String mainItemCode;

	/**
	 * 主险条款内容
	 */
	@ApiField("main_item_content")
	private String mainItemContent;

	/**
	 * 特别约定
	 */
	@ApiField("special")
	private String special;

	public String getAdditionalItem() {
		return this.additionalItem;
	}
	public void setAdditionalItem(String additionalItem) {
		this.additionalItem = additionalItem;
	}

	public String getMainItemCode() {
		return this.mainItemCode;
	}
	public void setMainItemCode(String mainItemCode) {
		this.mainItemCode = mainItemCode;
	}

	public String getMainItemContent() {
		return this.mainItemContent;
	}
	public void setMainItemContent(String mainItemContent) {
		this.mainItemContent = mainItemContent;
	}

	public String getSpecial() {
		return this.special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}

}
