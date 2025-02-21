package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品信息
 *
 * @author auto create
 * @since 1.0, 2025-02-07 14:32:25
 */
public class RecycleQcReportProductInfo extends AlipayObject {

	private static final long serialVersionUID = 1294412231579294982L;

	/**
	 * 用户下单前的预估价格，单位为元，最多两位小数
	 */
	@ApiField("estimated_price")
	private String estimatedPrice;

	/**
	 * 产品编码，支付宝定义并在下单时回传给服务商
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 质检之后最终报价，单位为元，最多两位小数
	 */
	@ApiField("real_price")
	private String realPrice;

	public String getEstimatedPrice() {
		return this.estimatedPrice;
	}
	public void setEstimatedPrice(String estimatedPrice) {
		this.estimatedPrice = estimatedPrice;
	}

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

	public String getRealPrice() {
		return this.realPrice;
	}
	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}

}
