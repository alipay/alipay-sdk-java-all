package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量更新商品, 执行失败信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:32
 */
public class ItemUpdateFailInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5319352584183873424L;

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
