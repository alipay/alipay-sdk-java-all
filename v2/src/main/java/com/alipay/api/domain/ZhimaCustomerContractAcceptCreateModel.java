package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 约定应约接口
 *
 * @author auto create
 * @since 1.0, 2022-11-16 15:38:14
 */
public class ZhimaCustomerContractAcceptCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5883265529522332517L;

	/**
	 * 业务主体id，比如淘宝id
	 */
	@ApiField("biz_principal_id")
	private String bizPrincipalId;

	/**
	 * 业务主体类型
	 */
	@ApiField("biz_principal_type")
	private String bizPrincipalType;

	/**
	 * 合约号
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizPrincipalId() {
		return this.bizPrincipalId;
	}
	public void setBizPrincipalId(String bizPrincipalId) {
		this.bizPrincipalId = bizPrincipalId;
	}

	public String getBizPrincipalType() {
		return this.bizPrincipalType;
	}
	public void setBizPrincipalType(String bizPrincipalType) {
		this.bizPrincipalType = bizPrincipalType;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
