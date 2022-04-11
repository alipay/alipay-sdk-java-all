package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品签约状态信息，包含产品名称、产品码和产品状态、驳回信息
 *
 * @author auto create
 * @since 1.0, 2021-11-23 20:46:40
 */
public class ProductAgentStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 1613535557336792744L;

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
	 * 产品被驳回的原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * none:未签约，表示还没有签约该产品 valid:已生效，表示合约已经生效，不需要再签约了 restrictValid:受限生效，表示合约已经生效，但是资料不全，功能受限 audit:审核中，已经有合约在审核中，请等待审核完成 waitConfirm:待商户确认协议，合约已经审核通过，需要商户确认后合约才生效 auditReject:审核未通过 invalid:合约失效，曾经签过合约，但已经失效了，可以重新发起签约 restrictInvalid:受限失效，受限合约失效了
	 */
	@ApiField("status")
	private String status;

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

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
