package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购机风控参数
 *
 * @author auto create
 * @since 1.0, 2025-06-10 11:23:40
 */
public class CreditPhoneRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 2723427915292113983L;

	/**
	 * 入网时间
	 */
	@ApiField("acc_time")
	private Date accTime;

	/**
	 * 分公司
	 */
	@ApiField("branch_company")
	private String branchCompany;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * true有，false无
	 */
	@ApiField("contract_reg_cust_flag")
	private Boolean contractRegCustFlag;

	/**
	 * 门店地址
	 */
	@ApiField("merchant_addr")
	private String merchantAddr;

	/**
	 * 门店市
	 */
	@ApiField("merchant_city")
	private String merchantCity;

	/**
	 * 门店区
	 */
	@ApiField("merchant_district")
	private String merchantDistrict;

	/**
	 * 门店在运营商内部ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 门店名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 门店省份
	 */
	@ApiField("merchant_province")
	private String merchantProvince;

	/**
	 * 单位是元。近半年每月消费额度X元
	 */
	@ApiField("monetary_6m")
	private String monetary6m;

	/**
	 * 网龄。用户在网年份
	 */
	@ApiField("net_age")
	private Long netAge;

	/**
	 * 进件员工ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 业务受理时间。与调用我们的下单时间注意区分。这是用户决定办理业务的时间
	 */
	@ApiField("service_accept_time")
	private Date serviceAcceptTime;

	/**
	 * 子机构支付宝登录号
	 */
	@ApiField("sub_alipay_account")
	private String subAlipayAccount;

	/**
	 * 门店支付宝账号
	 */
	@ApiField("sub_pid")
	private String subPid;

	/**
	 * 套餐合约手机号的机主姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户户籍所在省份
	 */
	@ApiField("user_province")
	private String userProvince;

	public Date getAccTime() {
		return this.accTime;
	}
	public void setAccTime(Date accTime) {
		this.accTime = accTime;
	}

	public String getBranchCompany() {
		return this.branchCompany;
	}
	public void setBranchCompany(String branchCompany) {
		this.branchCompany = branchCompany;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Boolean getContractRegCustFlag() {
		return this.contractRegCustFlag;
	}
	public void setContractRegCustFlag(Boolean contractRegCustFlag) {
		this.contractRegCustFlag = contractRegCustFlag;
	}

	public String getMerchantAddr() {
		return this.merchantAddr;
	}
	public void setMerchantAddr(String merchantAddr) {
		this.merchantAddr = merchantAddr;
	}

	public String getMerchantCity() {
		return this.merchantCity;
	}
	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantDistrict() {
		return this.merchantDistrict;
	}
	public void setMerchantDistrict(String merchantDistrict) {
		this.merchantDistrict = merchantDistrict;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantProvince() {
		return this.merchantProvince;
	}
	public void setMerchantProvince(String merchantProvince) {
		this.merchantProvince = merchantProvince;
	}

	public String getMonetary6m() {
		return this.monetary6m;
	}
	public void setMonetary6m(String monetary6m) {
		this.monetary6m = monetary6m;
	}

	public Long getNetAge() {
		return this.netAge;
	}
	public void setNetAge(Long netAge) {
		this.netAge = netAge;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Date getServiceAcceptTime() {
		return this.serviceAcceptTime;
	}
	public void setServiceAcceptTime(Date serviceAcceptTime) {
		this.serviceAcceptTime = serviceAcceptTime;
	}

	public String getSubAlipayAccount() {
		return this.subAlipayAccount;
	}
	public void setSubAlipayAccount(String subAlipayAccount) {
		this.subAlipayAccount = subAlipayAccount;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserProvince() {
		return this.userProvince;
	}
	public void setUserProvince(String userProvince) {
		this.userProvince = userProvince;
	}

}
