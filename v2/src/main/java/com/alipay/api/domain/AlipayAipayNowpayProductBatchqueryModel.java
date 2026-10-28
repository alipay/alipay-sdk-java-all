package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询商品
 *
 * @author auto create
 * @since 1.0, 2026-10-20 11:48:00
 */
public class AlipayAipayNowpayProductBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2566417659441982825L;

	/**
	 * 外部平台资源归属账号
	 */
	@ApiField("external_owner_id")
	private String externalOwnerId;

	/**
	 * null
	 */
	@ApiListField("out_product_ids")
	@ApiField("string")
	private List<String> outProductIds;

	public String getExternalOwnerId() {
		return this.externalOwnerId;
	}
	public void setExternalOwnerId(String externalOwnerId) {
		this.externalOwnerId = externalOwnerId;
	}

	public List<String> getOutProductIds() {
		return this.outProductIds;
	}
	public void setOutProductIds(List<String> outProductIds) {
		this.outProductIds = outProductIds;
	}

}
