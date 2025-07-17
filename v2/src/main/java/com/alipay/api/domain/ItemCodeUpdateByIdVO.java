package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过id修改商品编码的请求对象
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:36
 */
public class ItemCodeUpdateByIdVO extends AlipayObject {

	private static final long serialVersionUID = 1399792245884846314L;

	/**
	 * 要修改的商品的id
	 */
	@ApiField("source_item_id")
	private String sourceItemId;

	/**
	 * 要修改成的商品code, 由app方自行生成
	 */
	@ApiField("target_item_code")
	private String targetItemCode;

	public String getSourceItemId() {
		return this.sourceItemId;
	}
	public void setSourceItemId(String sourceItemId) {
		this.sourceItemId = sourceItemId;
	}

	public String getTargetItemCode() {
		return this.targetItemCode;
	}
	public void setTargetItemCode(String targetItemCode) {
		this.targetItemCode = targetItemCode;
	}

}
