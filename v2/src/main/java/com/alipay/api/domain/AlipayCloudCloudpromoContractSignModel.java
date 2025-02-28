package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房合同签约
 *
 * @author auto create
 * @since 1.0, 2024-08-19 17:21:17
 */
public class AlipayCloudCloudpromoContractSignModel extends AlipayObject {

	private static final long serialVersionUID = 4685188167818733839L;

	/**
	 * 业务机器id，用于埋点数据上报
	 */
	@ApiField("apdid_token")
	private String apdidToken;

	/**
	 * 租房合同id
	 */
	@ApiField("contract_id")
	private String contractId;

	/**
	 * 用户主体id
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 用户登录id
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 租房业务的用户角色
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 用户的签名图片地址
	 */
	@ApiField("sign_pic")
	private String signPic;

	/**
	 * 三方小程序的appId
	 */
	@ApiField("source_id")
	private String sourceId;

	public String getApdidToken() {
		return this.apdidToken;
	}
	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
	}

	public String getContractId() {
		return this.contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getSignPic() {
		return this.signPic;
	}
	public void setSignPic(String signPic) {
		this.signPic = signPic;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

}
