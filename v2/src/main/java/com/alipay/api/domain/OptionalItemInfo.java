package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 选配物料明细
 *
 * @author auto create
 * @since 1.0, 2025-07-24 11:19:41
 */
public class OptionalItemInfo extends AlipayObject {

	private static final long serialVersionUID = 2591924921546873937L;

	/**
	 * 选配物料对应数量
	 */
	@ApiField("apply_count")
	private String applyCount;

	/**
	 * 选配物料id
	 */
	@ApiField("optional_item_id")
	private String optionalItemId;

	public String getApplyCount() {
		return this.applyCount;
	}
	public void setApplyCount(String applyCount) {
		this.applyCount = applyCount;
	}

	public String getOptionalItemId() {
		return this.optionalItemId;
	}
	public void setOptionalItemId(String optionalItemId) {
		this.optionalItemId = optionalItemId;
	}

}
