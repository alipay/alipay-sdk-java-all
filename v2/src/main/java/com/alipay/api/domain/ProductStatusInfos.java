package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请单中每个产品的签约状态
 *
 * @author auto create
 * @since 1.0, 2024-09-14 11:47:20
 */
public class ProductStatusInfos extends AlipayObject {

	private static final long serialVersionUID = 4239561641818221949L;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品被驳回的原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

}
