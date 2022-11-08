package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联基金结果
 *
 * @author auto create
 * @since 1.0, 2022-02-25 22:03:44
 */
public class LinkFundResult extends AlipayObject {

	private static final long serialVersionUID = 5528393579382837854L;

	/**
	 * 基金代码
	 */
	@ApiField("fund_code")
	private String fundCode;

	/**
	 * 基金名称
	 */
	@ApiField("fund_name")
	private String fundName;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 费率
	 */
	@ApiField("rate_list")
	private ChargeRateDTO rateList;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getFundName() {
		return this.fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public ChargeRateDTO getRateList() {
		return this.rateList;
	}
	public void setRateList(ChargeRateDTO rateList) {
		this.rateList = rateList;
	}

}
