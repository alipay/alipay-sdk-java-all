package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询指定产品开通的场景列表
 *
 * @author auto create
 * @since 1.0, 2021-09-22 17:40:55
 */
public class AlipayOpenMiniAmpeSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7539285957743962197L;

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
