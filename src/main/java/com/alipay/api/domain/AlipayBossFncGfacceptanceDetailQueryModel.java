package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业财受理详情查询
 *
 * @author auto create
 * @since 1.0, 2021-09-16 18:17:31
 */
public class AlipayBossFncGfacceptanceDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4834488585982249725L;

	/**
	 * 16位。支付宝UID或者2088000000000XX0，倒数2、3位数字用来决策LDC ZoneUid和分库位
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 业财受理查询请求体
	 */
	@ApiField("query")
	private GFAOpenAPIQueryRequest query;

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public GFAOpenAPIQueryRequest getQuery() {
		return this.query;
	}
	public void setQuery(GFAOpenAPIQueryRequest query) {
		this.query = query;
	}

}
