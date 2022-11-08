package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分期扩展字段
 *
 * @author auto create
 * @since 1.0, 2022-05-16 17:32:26
 */
public class FQExtendParams extends AlipayObject {

	private static final long serialVersionUID = 5721549422642167626L;

	/**
	 * 分期期数
	 */
	@ApiField("fq_number")
	private String fqNumber;

	/**
	 * 表示卖家承担比例
	 */
	@ApiField("fq_seller_percent")
	private String fqSellerPercent;

	public String getFqNumber() {
		return this.fqNumber;
	}
	public void setFqNumber(String fqNumber) {
		this.fqNumber = fqNumber;
	}

	public String getFqSellerPercent() {
		return this.fqSellerPercent;
	}
	public void setFqSellerPercent(String fqSellerPercent) {
		this.fqSellerPercent = fqSellerPercent;
	}

}
