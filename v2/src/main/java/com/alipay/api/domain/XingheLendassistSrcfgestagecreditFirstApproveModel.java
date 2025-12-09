package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政企团购分期授信初审
 *
 * @author auto create
 * @since 1.0, 2025-03-21 17:36:55
 */
public class XingheLendassistSrcfgestagecreditFirstApproveModel extends AlipayObject {

	private static final long serialVersionUID = 2897414562997452893L;

	/**
	 * 政企客户经理所属市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 政企客客户经理身份证号
	 */
	@ApiField("cust_manager_id_card")
	private String custManagerIdCard;

	/**
	 * 政企客户经理姓名
	 */
	@ApiField("cust_manager_name")
	private String custManagerName;

	/**
	 * 政企客户经理所属区县
	 */
	@ApiField("district")
	private String district;

	/**
	 * 员工政企单位统一社会信用代码
	 */
	@ApiField("gov_enter_cert_no")
	private String govEnterCertNo;

	/**
	 * 员工政企单位名称
	 */
	@ApiField("gov_enter_name")
	private String govEnterName;

	/**
	 * 平台为接入客户分配
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 员工是否为领导标识，NOT_LEADER-不是领导 、LEADER-是领导
	 */
	@ApiField("leader_flag")
	private String leaderFlag;

	/**
	 * 客户经理所属运营商
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 政企客户经理所属公司名称
	 */
	@ApiField("operator_company")
	private String operatorCompany;

	/**
	 * 唯一标识政企员工团购分期授信请求
	 */
	@ApiField("out_bsn_no")
	private String outBsnNo;

	/**
	 * 业务所属产品，平台为业务分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 政企客户经理所属省
	 */
	@ApiField("provincial")
	private String provincial;

	/**
	 * 上传接口上传社保图片成功后返回的文件id
	 */
	@ApiField("social_security_image_id")
	private String socialSecurityImageId;

	/**
	 * 政企员工的身份证号
	 */
	@ApiField("user_id_card")
	private String userIdCard;

	/**
	 * 政企员工的姓名
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 政企员工名下手机号
	 */
	@ApiField("user_phone")
	private String userPhone;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCustManagerIdCard() {
		return this.custManagerIdCard;
	}
	public void setCustManagerIdCard(String custManagerIdCard) {
		this.custManagerIdCard = custManagerIdCard;
	}

	public String getCustManagerName() {
		return this.custManagerName;
	}
	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}

	public String getDistrict() {
		return this.district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getGovEnterCertNo() {
		return this.govEnterCertNo;
	}
	public void setGovEnterCertNo(String govEnterCertNo) {
		this.govEnterCertNo = govEnterCertNo;
	}

	public String getGovEnterName() {
		return this.govEnterName;
	}
	public void setGovEnterName(String govEnterName) {
		this.govEnterName = govEnterName;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getLeaderFlag() {
		return this.leaderFlag;
	}
	public void setLeaderFlag(String leaderFlag) {
		this.leaderFlag = leaderFlag;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorCompany() {
		return this.operatorCompany;
	}
	public void setOperatorCompany(String operatorCompany) {
		this.operatorCompany = operatorCompany;
	}

	public String getOutBsnNo() {
		return this.outBsnNo;
	}
	public void setOutBsnNo(String outBsnNo) {
		this.outBsnNo = outBsnNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProvincial() {
		return this.provincial;
	}
	public void setProvincial(String provincial) {
		this.provincial = provincial;
	}

	public String getSocialSecurityImageId() {
		return this.socialSecurityImageId;
	}
	public void setSocialSecurityImageId(String socialSecurityImageId) {
		this.socialSecurityImageId = socialSecurityImageId;
	}

	public String getUserIdCard() {
		return this.userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
