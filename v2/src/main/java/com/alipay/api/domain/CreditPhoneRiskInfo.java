package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购机风控参数
 *
 * @author auto create
 * @since 1.0, 2024-02-04 15:36:44
 */
public class CreditPhoneRiskInfo extends AlipayObject {

	private static final long serialVersionUID = 8111211737794713624L;

	/**
	 * 分公司
	 */
	@ApiField("branch_company")
	private String branchCompany;

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
	 * 门店支付宝账号
	 */
	@ApiField("sub_pid")
	private String subPid;

	/**
	 * 套餐合约手机号的机主姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBranchCompany() {
		return this.branchCompany;
	}
	public void setBranchCompany(String branchCompany) {
		this.branchCompany = branchCompany;
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

}
