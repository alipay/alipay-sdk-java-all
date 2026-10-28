package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 打款认证结果查询
 *
 * @author auto create
 * @since 1.0, 2026-10-22 18:32:58
 */
public class AlipayTradeSaasBankverifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3644431917483585852L;

	/**
	 * 创建打款认证链接时使用的客户幂等号，长度 1-64，仅允许 `[A-Za-z0-9_-]+`
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
