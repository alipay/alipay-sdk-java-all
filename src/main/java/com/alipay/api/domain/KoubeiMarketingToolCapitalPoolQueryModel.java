package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-09 02:41:48
 */
public class KoubeiMarketingToolCapitalPoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7479983389578926561L;

	/**
	 * 资金池ID，填了资金池ID则查询指定资金池信息，不填ID则默认查询ISV下的所有资金池列表
	 */
	@ApiField("pool_id")
	private String poolId;

	public String getPoolId() {
		return this.poolId;
	}
	public void setPoolId(String poolId) {
		this.poolId = poolId;
	}

}
