package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花名册详情查询
 *
 * @author auto create
 * @since 1.0, 2025-04-17 20:04:19
 */
public class AlipayCommerceEducateRosterDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1119519955287455132L;

	/**
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 花名册ID
	 */
	@ApiField("roster_id")
	private String rosterId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getRosterId() {
		return this.rosterId;
	}
	public void setRosterId(String rosterId) {
		this.rosterId = rosterId;
	}

}
