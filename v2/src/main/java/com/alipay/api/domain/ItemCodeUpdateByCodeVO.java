package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药品库存数据集合的json格式数组
 *
 * @author auto create
 * @since 1.0, 2025-01-14 14:27:40
 */
public class ItemCodeUpdateByCodeVO extends AlipayObject {

	private static final long serialVersionUID = 4812658691456922688L;

	/**
	 * 原始商品编码, app方已经设置的商品编码
	 */
	@ApiField("source_item_code")
	private String sourceItemCode;

	/**
	 * 目标商品编码, 新生成的, 要设置的商品编码
	 */
	@ApiField("target_item_code")
	private String targetItemCode;

	public String getSourceItemCode() {
		return this.sourceItemCode;
	}
	public void setSourceItemCode(String sourceItemCode) {
		this.sourceItemCode = sourceItemCode;
	}

	public String getTargetItemCode() {
		return this.targetItemCode;
	}
	public void setTargetItemCode(String targetItemCode) {
		this.targetItemCode = targetItemCode;
	}

}
