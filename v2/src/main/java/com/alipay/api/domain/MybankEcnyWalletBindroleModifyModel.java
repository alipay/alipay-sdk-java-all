package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定变更
 *
 * @author auto create
 * @since 1.0, 2026-05-13 13:54:39
 */
public class MybankEcnyWalletBindroleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2368593375979526968L;

	/**
	 * 绑定场景
	 */
	@ApiField("bind_scene")
	private String bindScene;

	/**
	 * 标识一次单独的接口调用，用于接口幂等处理和问题排查的索引
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 角色类型
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 钱包编号
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getBindScene() {
		return this.bindScene;
	}
	public void setBindScene(String bindScene) {
		this.bindScene = bindScene;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
