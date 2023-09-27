package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业信息
 *
 * @author auto create
 * @since 1.0, 2023-08-24 20:42:11
 */
public class EnterpriseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3465453497873757182L;

	/**
	 * 共同账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 因公签约状态
	 */
	@ApiField("activate")
	private String activate;

	/**
	 * 企业认证等级
	 */
	@ApiField("auth_level")
	private String authLevel;

	/**
	 * 认证状态
	 */
	@ApiField("auth_status")
	private String authStatus;

	/**
	 * 认证时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * 企业简称
	 */
	@ApiField("enterprise_alias")
	private String enterpriseAlias;

	/**
	 * 统一社会信用码
	 */
	@ApiField("enterprise_code")
	private String enterpriseCode;

	/**
	 * 企业邮箱
	 */
	@ApiField("enterprise_email")
	private String enterpriseEmail;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 企业名称
	 */
	@ApiField("enterprise_name")
	private String enterpriseName;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 封闭场景（如班车）的人脸库id
	 */
	@ApiField("iot_group_id")
	private String iotGroupId;

	/**
	 * 开放场景（如团餐）的人脸库id
	 */
	@ApiField("iot_logic_group_id")
	private String iotLogicGroupId;

	/**
	 * 外部平台code
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 外部平台id
	 */
	@ApiField("platform_out_id")
	private String platformOutId;

	/**
	 * 企业码服务协议签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 企业当前状态
	 */
	@ApiField("status")
	private String status;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getActivate() {
		return this.activate;
	}
	public void setActivate(String activate) {
		this.activate = activate;
	}

	public String getAuthLevel() {
		return this.authLevel;
	}
	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}

	public String getAuthStatus() {
		return this.authStatus;
	}
	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getEnterpriseAlias() {
		return this.enterpriseAlias;
	}
	public void setEnterpriseAlias(String enterpriseAlias) {
		this.enterpriseAlias = enterpriseAlias;
	}

	public String getEnterpriseCode() {
		return this.enterpriseCode;
	}
	public void setEnterpriseCode(String enterpriseCode) {
		this.enterpriseCode = enterpriseCode;
	}

	public String getEnterpriseEmail() {
		return this.enterpriseEmail;
	}
	public void setEnterpriseEmail(String enterpriseEmail) {
		this.enterpriseEmail = enterpriseEmail;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIotGroupId() {
		return this.iotGroupId;
	}
	public void setIotGroupId(String iotGroupId) {
		this.iotGroupId = iotGroupId;
	}

	public String getIotLogicGroupId() {
		return this.iotLogicGroupId;
	}
	public void setIotLogicGroupId(String iotLogicGroupId) {
		this.iotLogicGroupId = iotLogicGroupId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformOutId() {
		return this.platformOutId;
	}
	public void setPlatformOutId(String platformOutId) {
		this.platformOutId = platformOutId;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
