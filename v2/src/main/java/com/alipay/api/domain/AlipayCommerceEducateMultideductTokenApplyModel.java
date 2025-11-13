package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取校园支付token
 *
 * @author auto create
 * @since 1.0, 2025-06-16 16:27:19
 */
public class AlipayCommerceEducateMultideductTokenApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8898449133751455791L;

	/**
	 * 业务码。可选的字段枚举说明：{SCHOOL_MULTI_DEDUCT:校园支付;SCHOOL_PAYMENT:刷脸支付}
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * operationType	操作类型。可选的字段枚举说明：{SIGN_SCHOOL_DEDUCT:签约校园支付;QUERY_DETAIL:查询校园支付;OPEN_SMALL_POUCH:家长开通小荷包}
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 家长手机号。SIGN_SCHOOL_DEDUCT时提供会在签约时自动筛选并推荐家长支付宝账号
	 */
	@ApiField("parent_phone")
	private String parentPhone;

	/**
	 * 支付设置。SIGN_SCHOOL_DEDUCT或OPEN_SMALL_POUCH时必传
	 */
	@ApiField("pay_config")
	private PayConfig payConfig;

	/**
	 * 查询资产，按照枚举填写
	 */
	@ApiField("query_asset")
	private String queryAsset;

	/**
	 * 学校（或教育机构）内标。支付宝提供的学校编号，如果您不知道学校编号，可以联系您的BD咨询获取
	 */
	@ApiField("school_code")
	private String schoolCode;

	/**
	 * 学生或教职工的证件号。OPEN_SMALL_POUCH时可选，其他情况必填
	 */
	@ApiField("user_cert_no")
	private String userCertNo;

	/**
	 * 学生或教职工的证件类型。可选的字段枚举说明：{1:居民身份证; RP_HK_MC:港澳居民居住证; RP_TAIWAN:台湾居民居住证}。OPEN_SMALL_POUCH时可选，其他情况必填
	 */
	@ApiField("user_cert_type")
	private String userCertType;

	/**
	 * 学生或教职工的姓名。OPEN_SMALL_POUCH时可选，其他情况必填
	 */
	@ApiField("user_name")
	private String userName;

	/**
	 * 学生或教职工在学校（或教育机构）的唯一编号（由商户自己生成）。支付宝侧后续通知不会告知学生证件信息，只返回当前唯一标号，商户需要据此识别出校内学生（结合学校（或教育机构）外标）。OPEN_SMALL_POUCH时可选，其他情况必填
	 */
	@ApiField("user_unique_id")
	private String userUniqueId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getParentPhone() {
		return this.parentPhone;
	}
	public void setParentPhone(String parentPhone) {
		this.parentPhone = parentPhone;
	}

	public PayConfig getPayConfig() {
		return this.payConfig;
	}
	public void setPayConfig(PayConfig payConfig) {
		this.payConfig = payConfig;
	}

	public String getQueryAsset() {
		return this.queryAsset;
	}
	public void setQueryAsset(String queryAsset) {
		this.queryAsset = queryAsset;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getUserCertNo() {
		return this.userCertNo;
	}
	public void setUserCertNo(String userCertNo) {
		this.userCertNo = userCertNo;
	}

	public String getUserCertType() {
		return this.userCertType;
	}
	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserUniqueId() {
		return this.userUniqueId;
	}
	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}

}
