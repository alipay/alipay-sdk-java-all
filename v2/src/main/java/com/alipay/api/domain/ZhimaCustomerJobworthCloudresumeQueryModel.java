package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云简历基本数据查询
 *
 * @author auto create
 * @since 1.0, 2023-12-29 11:25:50
 */
public class ZhimaCustomerJobworthCloudresumeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4873174451397161759L;

	/**
	 * 长效的认证令牌：zhima.credit.payafteruse.creditagreement.sign 的out_agreement_no
	 */
	@ApiField("conn_key")
	private String connKey;

	/**
	 * 交换云简历的单次token：zhima.credit.payafteruse.creditagreement.sign 的

extra_param入参onceToken（授权后5分钟内，单次有效
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
