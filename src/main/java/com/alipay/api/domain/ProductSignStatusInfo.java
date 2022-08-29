package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户产品签约状态结果对象
 *
 * @author auto create
 * @since 1.0, 2021-11-22 13:23:05
 */
public class ProductSignStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 3134484738827984372L;

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
	 * none:未签约，表示还没有签约该产品
valid:已生效，表示合约已经生效，不需要再签约了
restrictValid:受限生效，表示合约已经生效，但是资料不全，功能受限
audit:审核中，已经有合约在审核中，请等待审核完成
waitConfirm:待商户确认协议，合约已经审核通过，需要商户确认后合约才生效
auditReject:审核未通过
invalid:合约失效，曾经签过合约，但已经失效了，可以重新发起签约
restrictInvalid:受限失效，受限合约失效了
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
