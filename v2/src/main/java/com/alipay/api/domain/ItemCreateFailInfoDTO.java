package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量创建商品, 执行失败信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:29
 */
public class ItemCreateFailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2475884456973637863L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * OMS厂商商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
