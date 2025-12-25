package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票账单合规匹配结果详情
 *
 * @author auto create
 * @since 1.0, 2024-07-17 14:34:15
 */
public class InvoiceComplianceCheckResult extends AlipayObject {

	private static final long serialVersionUID = 3824645371498187158L;

	/**
	 * 发票和账单匹配的合规检查结果：
0 - 模糊匹配
1 - 精准匹配
	 */
	@ApiField("match_result_type")
	private String matchResultType;

	public String getMatchResultType() {
		return this.matchResultType;
	}
	public void setMatchResultType(String matchResultType) {
		this.matchResultType = matchResultType;
	}

}
