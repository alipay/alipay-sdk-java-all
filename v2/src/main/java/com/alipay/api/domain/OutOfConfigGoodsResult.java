package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配置外商品结果
 *
 * @author auto create
 * @since 1.0, 2024-03-28 09:59:47
 */
public class OutOfConfigGoodsResult extends AlipayObject {

	private static final long serialVersionUID = 4579936367457571672L;

	/**
	 * 算法id
	 */
	@ApiField("algorithm_id")
	private String algorithmId;

	public String getAlgorithmId() {
		return this.algorithmId;
	}
	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
	}

}
