package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告主用户数据结构
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:41
 */
public class AdUser extends AlipayObject {

	private static final long serialVersionUID = 4639983147553843221L;

	/**
	 * 广告主营业执照url
	 */
	@ApiField("company_license")
	private String companyLicense;

	/**
	 * 广告主所属公司
	 */
	@ApiField("company_name")
	private String companyName;

	/**
	 * 公司行业信息
	 */
	@ApiField("company_trade")
	private String companyTrade;

	/**
	 * 1级行业ID
	 */
	@ApiField("first_trade_id")
	private String firstTradeId;

	/**
	 * ICP营业执照编码
	 */
	@ApiField("icp_license")
	private String icpLicense;

	/**
	 * 营业执照图片url
	 */
	@ApiField("icp_license_url")
	private String icpLicenseUrl;

	/**
	 * 广告主公司地址
	 */
	@ApiField("register_place")
	private String registerPlace;

	/**
	 * 2级行业ID
	 */
	@ApiField("second_trade_id")
	private String secondTradeId;

	/**
	 * 广告主电话
	 */
	@ApiField("telephone")
	private String telephone;

	/**
	 * 第三方平台用户ID
	 */
	@ApiField("third_user_id")
	private String thirdUserId;

	/**
	 * 广告主邮箱
	 */
	@ApiField("user_mail")
	private String userMail;

	/**
	 * 广告系统用户
	 */
	@ApiField("user_name")
	private String userName;

	public String getCompanyLicense() {
		return this.companyLicense;
	}
	public void setCompanyLicense(String companyLicense) {
		this.companyLicense = companyLicense;
	}

	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyTrade() {
		return this.companyTrade;
	}
	public void setCompanyTrade(String companyTrade) {
		this.companyTrade = companyTrade;
	}

	public String getFirstTradeId() {
		return this.firstTradeId;
	}
	public void setFirstTradeId(String firstTradeId) {
		this.firstTradeId = firstTradeId;
	}

	public String getIcpLicense() {
		return this.icpLicense;
	}
	public void setIcpLicense(String icpLicense) {
		this.icpLicense = icpLicense;
	}

	public String getIcpLicenseUrl() {
		return this.icpLicenseUrl;
	}
	public void setIcpLicenseUrl(String icpLicenseUrl) {
		this.icpLicenseUrl = icpLicenseUrl;
	}

	public String getRegisterPlace() {
		return this.registerPlace;
	}
	public void setRegisterPlace(String registerPlace) {
		this.registerPlace = registerPlace;
	}

	public String getSecondTradeId() {
		return this.secondTradeId;
	}
	public void setSecondTradeId(String secondTradeId) {
		this.secondTradeId = secondTradeId;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getThirdUserId() {
		return this.thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

	public String getUserMail() {
		return this.userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
