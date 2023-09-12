package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LogisticsAccountStatusDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.instantdelivery.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 16:40:13
 */
public class AlipayOpenInstantdeliveryAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7758777975667374358L;

	/** 
	 * 账户余额
	 */
	@ApiField("balance")
	private String balance;

	/** 
	 * 企业营业执照图片正反面
	 */
	@ApiField("business_license")
	private String businessLicense;

	/** 
	 * 经营范围
	 */
	@ApiField("business_scope")
	private String businessScope;

	/** 
	 * 统一社会信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/** 
	 * 联系人邮箱
	 */
	@ApiField("email")
	private String email;

	/** 
	 * 企业地址
	 */
	@ApiField("enterprise_address")
	private String enterpriseAddress;

	/** 
	 * 企业所在地，市编码
	 */
	@ApiField("enterprise_city")
	private String enterpriseCity;

	/** 
	 * 企业所在地，区编码
	 */
	@ApiField("enterprise_district")
	private String enterpriseDistrict;

	/** 
	 * 企业全称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/** 
	 * 企业所在地，省编码
	 */
	@ApiField("enterprise_province")
	private String enterpriseProvince;

	/** 
	 * 企业类型
	 */
	@ApiField("enterprise_type")
	private String enterpriseType;

	/** 
	 * 在配送公司的账户状态信息
	 */
	@ApiListField("logistics_account_status")
	@ApiField("logistics_account_status_d_t_o")
	private List<LogisticsAccountStatusDTO> logisticsAccountStatus;

	/** 
	 * 联系人手机号
	 */
	@ApiField("phone")
	private String phone;

	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBalance( ) {
		return this.balance;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}
	public String getBusinessLicense( ) {
		return this.businessLicense;
	}

	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}
	public String getBusinessScope( ) {
		return this.businessScope;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}
	public String getCreditCode( ) {
		return this.creditCode;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail( ) {
		return this.email;
	}

	public void setEnterpriseAddress(String enterpriseAddress) {
		this.enterpriseAddress = enterpriseAddress;
	}
	public String getEnterpriseAddress( ) {
		return this.enterpriseAddress;
	}

	public void setEnterpriseCity(String enterpriseCity) {
		this.enterpriseCity = enterpriseCity;
	}
	public String getEnterpriseCity( ) {
		return this.enterpriseCity;
	}

	public void setEnterpriseDistrict(String enterpriseDistrict) {
		this.enterpriseDistrict = enterpriseDistrict;
	}
	public String getEnterpriseDistrict( ) {
		return this.enterpriseDistrict;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getEnterpriseName( ) {
		return this.enterpriseName;
	}

	public void setEnterpriseProvince(String enterpriseProvince) {
		this.enterpriseProvince = enterpriseProvince;
	}
	public String getEnterpriseProvince( ) {
		return this.enterpriseProvince;
	}

	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}
	public String getEnterpriseType( ) {
		return this.enterpriseType;
	}

	public void setLogisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
		this.logisticsAccountStatus = logisticsAccountStatus;
	}
	public List<LogisticsAccountStatusDTO> getLogisticsAccountStatus( ) {
		return this.logisticsAccountStatus;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone( ) {
		return this.phone;
	}

}
