package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建代卖人收购单接口
 *
 * @author auto create
 * @since 1.0, 2026-09-20 10:52:15
 */
public class AlipayCommerceEcRecyclinginvoiceProxyorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2228414194226423337L;

	/**
	 * 农户支付宝账号，用于查询实名账户信息。
	 */
	@ApiField("farmer_account_no")
	private String farmerAccountNo;

	/**
	 * 农户支付宝账号类型，可选值为PHONE或EMAIL。
	 */
	@ApiField("farmer_account_type")
	private String farmerAccountType;

	/**
	 * 农户身份证号，用于核验农户实名信息。
	 */
	@ApiField("farmer_cert_no")
	private String farmerCertNo;

	/**
	 * 农户姓名，需要与农户支付宝实名信息一致。
	 */
	@ApiField("farmer_name")
	private String farmerName;

	/**
	 * 服务商侧请求流水号，用于接口幂等。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付订单号，用于关联支付链路与收购单。
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/**
	 * 代卖人支付宝账号，用于查询实名账户信息。
	 */
	@ApiField("proxy_account_no")
	private String proxyAccountNo;

	/**
	 * 代卖人支付宝账号类型，可选值为PHONE或EMAIL。
	 */
	@ApiField("proxy_account_type")
	private String proxyAccountType;

	/**
	 * 代卖人身份证号，用于核验代卖人实名信息。
	 */
	@ApiField("proxy_cert_no")
	private String proxyCertNo;

	/**
	 * 保证金，用于收购单展示和后续分账计算，单位为元。
	 */
	@ApiField("proxy_earnest_amount")
	private String proxyEarnestAmount;

	/**
	 * 代卖人姓名，需要与代卖人支付宝实名信息一致。
	 */
	@ApiField("proxy_name")
	private String proxyName;

	public String getFarmerAccountNo() {
		return this.farmerAccountNo;
	}
	public void setFarmerAccountNo(String farmerAccountNo) {
		this.farmerAccountNo = farmerAccountNo;
	}

	public String getFarmerAccountType() {
		return this.farmerAccountType;
	}
	public void setFarmerAccountType(String farmerAccountType) {
		this.farmerAccountType = farmerAccountType;
	}

	public String getFarmerCertNo() {
		return this.farmerCertNo;
	}
	public void setFarmerCertNo(String farmerCertNo) {
		this.farmerCertNo = farmerCertNo;
	}

	public String getFarmerName() {
		return this.farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayOrderNo() {
		return this.payOrderNo;
	}
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public String getProxyAccountNo() {
		return this.proxyAccountNo;
	}
	public void setProxyAccountNo(String proxyAccountNo) {
		this.proxyAccountNo = proxyAccountNo;
	}

	public String getProxyAccountType() {
		return this.proxyAccountType;
	}
	public void setProxyAccountType(String proxyAccountType) {
		this.proxyAccountType = proxyAccountType;
	}

	public String getProxyCertNo() {
		return this.proxyCertNo;
	}
	public void setProxyCertNo(String proxyCertNo) {
		this.proxyCertNo = proxyCertNo;
	}

	public String getProxyEarnestAmount() {
		return this.proxyEarnestAmount;
	}
	public void setProxyEarnestAmount(String proxyEarnestAmount) {
		this.proxyEarnestAmount = proxyEarnestAmount;
	}

	public String getProxyName() {
		return this.proxyName;
	}
	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}

}
