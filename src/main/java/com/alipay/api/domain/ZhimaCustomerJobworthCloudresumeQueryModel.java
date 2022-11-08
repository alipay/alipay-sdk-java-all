package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云简历基本数据查询
 *
 * @author auto create
 * @since 1.0, 2022-11-03 17:53:00
 */
public class ZhimaCustomerJobworthCloudresumeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2652342512233774146L;

	/**
	 * 长效的认证令牌
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 交换云简历的单次token
	 */
	@ApiField("once_token")
	private String onceToken;

	public String getConnKey() {
		return this.connKey;
	}
	public void setConnKey(String connKey) {
		this.connKey = connKey;
	}

	public String getOnceToken() {
		return this.onceToken;
	}
	public void setOnceToken(String onceToken) {
		this.onceToken = onceToken;
	}

}
