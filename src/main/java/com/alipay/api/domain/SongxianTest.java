package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * SongxianTest
 *
 * @author auto create
 * @since 1.0, 2018-05-29 19:52:43
 */
public class SongxianTest extends AlipayObject {

	private static final long serialVersionUID = 6217686944919411374L;

	/**
	 * hahah
	 */
	@ApiField("item")
	private Item item;

	public Item getItem() {
		return this.item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

}
