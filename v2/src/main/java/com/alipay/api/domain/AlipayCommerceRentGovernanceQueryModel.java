package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁商户治理记录查询
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:47:54
 */
public class AlipayCommerceRentGovernanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6896475889735532125L;

	/**
	 * 如果传了target_id则只返回匹配的记录
	 */
	@ApiField("target_id")
	private String targetId;

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
