package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业四要素认证结果查询
 *
 * @author auto create
 * @since 1.0, 2026-10-22 18:32:58
 */
public class AlipayTradeSaasEnterprisecertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3143758787324331631L;

	/**
	 * 创建企业认证链接时使用的客户幂等号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
