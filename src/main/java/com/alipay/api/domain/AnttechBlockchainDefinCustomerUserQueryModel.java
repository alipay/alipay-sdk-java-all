package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询客户信息
 *
 * @author auto create
 * @since 1.0, 2020-09-23 17:02:46
 */
public class AnttechBlockchainDefinCustomerUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5279747539174311158L;

	/**
	 * DCHAIN("DCHAIN","供应链信用流转平台"), ABS("ABS","ABS资产流转平台"), BAMBOO("BAMBOO","BAMBOO项目"), LOGISTICS_FIN("LOGISTICS_FIN", "物流金融"), TRUSPLE("TRUSPLE", "跨境贸易金融平台");
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 通过角色类型查询用户信息
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * user id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
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

}
