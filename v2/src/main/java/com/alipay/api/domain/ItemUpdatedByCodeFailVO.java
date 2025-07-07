package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过id更新商品编码失败返回对象
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:40
 */
public class ItemUpdatedByCodeFailVO extends AlipayObject {

	private static final long serialVersionUID = 8731985171159817922L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 原商品code
	 */
	@ApiField("source_item_code")
	private String sourceItemCode;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSourceItemCode() {
		return this.sourceItemCode;
	}
	public void setSourceItemCode(String sourceItemCode) {
		this.sourceItemCode = sourceItemCode;
	}

}
