package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多产品签约后的产品签约状态查询
 *
 * @author auto create
 * @since 1.0, 2019-12-27 10:39:33
 */
public class ProductInviteStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 2171225844436811115L;

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
	 * NONE：未签约，表示还没有签约该产品
MERCHANT_AUDITING：审核中，已经有合约在审核中，请等待审核完成
MERCHANT_CONFIRM_SUCCESS：已生效，表示合约已经生效，不需要再签约了
MERCHANT_APPLY_ORDER_CANCELED：审核未通过
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
