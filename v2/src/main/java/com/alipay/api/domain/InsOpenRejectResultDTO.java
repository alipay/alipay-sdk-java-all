package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拦截原因
 *
 * @author auto create
 * @since 1.0, 2022-11-21 23:21:42
 */
public class InsOpenRejectResultDTO extends AlipayObject {

	private static final long serialVersionUID = 6715331169166684492L;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 拦截原因编码
	 */
	@ApiField("reject_reason_code")
	private String rejectReasonCode;

	/**
	 * 拦截原因描述
	 */
	@ApiField("reject_reason_msg")
	private String rejectReasonMsg;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRejectReasonCode() {
		return this.rejectReasonCode;
	}
	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}

	public String getRejectReasonMsg() {
		return this.rejectReasonMsg;
	}
	public void setRejectReasonMsg(String rejectReasonMsg) {
		this.rejectReasonMsg = rejectReasonMsg;
	}

}
