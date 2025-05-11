package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会话历史记录查询
 *
 * @author auto create
 * @since 1.0, 2024-04-18 15:45:53
 */
public class AntfortuneFinresearchSessionHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6257548428238454168L;

	/**
	 * 本次会话的主体ID
	 */
	@ApiField("identity_id")
	private String identityId;

	public String getIdentityId() {
		return this.identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}

}
