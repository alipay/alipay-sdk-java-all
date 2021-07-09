package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 约定应约接口
 *
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:16
 */
public class ZhimaCustomerContractAcceptCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7419286368388429751L;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
