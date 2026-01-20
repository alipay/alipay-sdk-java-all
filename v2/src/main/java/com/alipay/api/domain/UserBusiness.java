package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户所管理的业务
 *
 * @author auto create
 * @since 1.0, 2019-01-23 11:54:14
 */
public class UserBusiness extends AlipayObject {

	private static final long serialVersionUID = 3141276545973253278L;

	/**
	 * 用户权限等级
	 */
	@ApiField("access_level")
	private Long accessLevel;

	/**
	 * 业务描述
	 */
	@ApiField("business_desc")
	private String businessDesc;

	/**
	 * 业务id
	 */
	@ApiField("business_id")
	private Long businessId;

	/**
	 * 业务名称
	 */
	@ApiField("business_name")
	private String businessName;

	/**
	 * 业务备注信息
	 */
	@ApiField("business_remark")
	private String businessRemark;

	/**
	 * 业务状态
	 */
	@ApiField("business_status")
	private String businessStatus;

	/**
	 * 是否是owner，是：1；否：0
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 对于该业务的用户状态
	 */
	@ApiField("user_status")
	private Long userStatus;

	public Long getAccessLevel() {
		return this.accessLevel;
	}
	public void setAccessLevel(Long accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getBusinessDesc() {
		return this.businessDesc;
	}
	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public Long getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return this.businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getBusinessRemark() {
		return this.businessRemark;
	}
	public void setBusinessRemark(String businessRemark) {
		this.businessRemark = businessRemark;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Long getUserStatus() {
		return this.userStatus;
	}
	public void setUserStatus(Long userStatus) {
		this.userStatus = userStatus;
	}

}
