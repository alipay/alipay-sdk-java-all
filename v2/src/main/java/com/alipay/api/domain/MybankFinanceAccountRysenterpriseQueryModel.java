package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询融易收企业账户余额
 *
 * @author auto create
 * @since 1.0, 2018-12-11 10:23:03
 */
public class MybankFinanceAccountRysenterpriseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5835343713436212281L;

	/**
	 * 融易收资金账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 客户编号
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 客户角色号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 阿里云用户Id
	 */
	@ApiField("out_channel_id")
	private String outChannelId;

	/**
	 * 外部渠道类型
	 */
	@ApiField("out_channel_type")
	private String outChannelType;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOutChannelId() {
		return this.outChannelId;
	}
	public void setOutChannelId(String outChannelId) {
		this.outChannelId = outChannelId;
	}

	public String getOutChannelType() {
		return this.outChannelType;
	}
	public void setOutChannelType(String outChannelType) {
		this.outChannelType = outChannelType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
