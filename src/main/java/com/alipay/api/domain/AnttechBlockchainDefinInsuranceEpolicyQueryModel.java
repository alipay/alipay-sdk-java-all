package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链产业保险电子保单查询
 *
 * @author auto create
 * @since 1.0, 2022-03-31 11:30:12
 */
public class AnttechBlockchainDefinInsuranceEpolicyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7667366489174222663L;

	/**
	 * 投保返回的交易流水号
	 */
	@ApiField("apply_trade_no")
	private String applyTradeNo;

	/**
	 * 统一客户平台的业务线编码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 统一客户平台的会员类型
	 */
	@ApiField("platform_access_type")
	private String platformAccessType;

	/**
	 * 统一客户平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品运营中心开通的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 唯一交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getApplyTradeNo() {
		return this.applyTradeNo;
	}
	public void setApplyTradeNo(String applyTradeNo) {
		this.applyTradeNo = applyTradeNo;
	}

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getPlatformAccessType() {
		return this.platformAccessType;
	}
	public void setPlatformAccessType(String platformAccessType) {
		this.platformAccessType = platformAccessType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
