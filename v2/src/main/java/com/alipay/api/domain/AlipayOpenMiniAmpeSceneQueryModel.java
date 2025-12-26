package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定产品开通的场景列表
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:27:52
 */
public class AlipayOpenMiniAmpeSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8757378327361497894L;

	/**
	 * 设备产品的productId，由系统生成
	 */
	@ApiField("product_id")
	private Long productId;

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
