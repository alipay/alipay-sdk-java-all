package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约协议
 *
 * @author auto create
 * @since 1.0, 2025-08-25 09:19:37
 */
public class AlipayCommerceMedicalInsuranceUserSignModel extends AlipayObject {

	private static final long serialVersionUID = 1848321374947363879L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 查询凭证
	 */
	@ApiField("query_token")
	private String queryToken;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getQueryToken() {
		return this.queryToken;
	}
	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}

}
