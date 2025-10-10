package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据skuId查询sku信息
 *
 * @author auto create
 * @since 1.0, 2025-09-26 11:04:57
 */
public class AlipayOpenSpNcoilopenSkuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2493444726275668713L;

	/**
	 * 流水id，通过调用alipay.open.sp.ncoilopen.reference.create接口返回值中获取reference_id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
