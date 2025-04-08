package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 书籍价格信息
 *
 * @author auto create
 * @since 1.0, 2023-07-07 11:42:32
 */
public class BookPriceInfo extends AlipayObject {

	private static final long serialVersionUID = 5369587653539137378L;

	/**
	 * 书籍原价。单位元，最多两位小数。收费书籍必填
	 */
	@ApiField("price")
	private String price;

	/**
	 * 销售方式：BOOK（整本售卖）、SINGLE_SINGLE_CHAPTER（单个章节售卖）
收费书籍必填
	 */
	@ApiField("sell_type")
	private String sellType;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getSellType() {
		return this.sellType;
	}
	public void setSellType(String sellType) {
		this.sellType = sellType;
	}

}
