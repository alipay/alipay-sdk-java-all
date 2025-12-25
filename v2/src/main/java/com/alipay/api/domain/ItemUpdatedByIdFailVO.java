package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过id修改商品编码返回的失败对象
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:36
 */
public class ItemUpdatedByIdFailVO extends AlipayObject {

	private static final long serialVersionUID = 1465366358993597521L;

	/**
	 * 提示信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品平台id
	 */
	@ApiField("source_item_id")
	private String sourceItemId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSourceItemId() {
		return this.sourceItemId;
	}
	public void setSourceItemId(String sourceItemId) {
		this.sourceItemId = sourceItemId;
	}

}
