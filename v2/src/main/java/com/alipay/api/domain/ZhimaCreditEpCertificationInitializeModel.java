package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁企业信用认证初始化
 *
 * @author auto create
 * @since 1.0, 2023-11-02 15:49:45
 */
public class ZhimaCreditEpCertificationInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 3241156873512777883L;

	/**
	 * 支付宝登陆账号(邮箱或者手机号)
	 */
	@ApiField("alipay_account")
	private String alipayAccount;

	/**
	 * 认证类别，由蚂蚁企业信用方分发提供，配置有误会返回参数错误
	 */
	@ApiField("certify_category")
	private String certifyCategory;

	/**
	 * 使用蚂蚁企业信用认证服务后，回跳到该商户指定的地址
	 */
	@ApiField("certify_return_url")
	private String certifyReturnUrl;

	/**
	 * 仅针对有委托书需求的平台商户，后台沟通确定委托书模版后（包括参数key和值格式以及是否必填等业务校验），可通过该字段传入平台业务参数用于委托书渲染。
	 */
	@ApiField("customize_content")
	private String customizeContent;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户唯一业务流水号，由大小写字母和数字构成
	 */
	@ApiField("org_biz_no")
	private String orgBizNo;

	/**
	 * 产品码，请填写示例值里提供的值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 证件号码，仅支持身份证号
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 个人用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	public String getAlipayAccount() {
		return this.alipayAccount;
	}
	public void setAlipayAccount(String alipayAccount) {
		this.alipayAccount = alipayAccount;
	}

	public String getCertifyCategory() {
		return this.certifyCategory;
	}
	public void setCertifyCategory(String certifyCategory) {
		this.certifyCategory = certifyCategory;
	}

	public String getCertifyReturnUrl() {
		return this.certifyReturnUrl;
	}
	public void setCertifyReturnUrl(String certifyReturnUrl) {
		this.certifyReturnUrl = certifyReturnUrl;
	}

	public String getCustomizeContent() {
		return this.customizeContent;
	}
	public void setCustomizeContent(String customizeContent) {
		this.customizeContent = customizeContent;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrgBizNo() {
		return this.orgBizNo;
	}
	public void setOrgBizNo(String orgBizNo) {
		this.orgBizNo = orgBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
