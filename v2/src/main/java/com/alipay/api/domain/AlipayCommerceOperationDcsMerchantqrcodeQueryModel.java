package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进件商户绑码消息查询
 *
 * @author auto create
 * @since 1.0, 2024-01-23 15:21:46
 */
public class AlipayCommerceOperationDcsMerchantqrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5852513815831284158L;

	/**
	 * 进件商户PID
	 */
	@ApiField("apply_merchant_pid")
	private String applyMerchantPid;

	/**
	 * 运营服务商PID 当前字段已废弃(通过网关上下文活动对应的参数)
	 */
	@ApiField("isv_pid")
	@Deprecated
	private String isvPid;

	/**
	 * 被运营商户PID 当前字段已废弃(通过网关上下文活动对应的参数)
	 */
	@ApiField("merchant_pid")
	@Deprecated
	private String merchantPid;

	/**
	 * 联营计划标识
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 通过商户传递标识(直连/间连), 返回对应商户PID
	 */
	@ApiField("role_id")
	private String roleId;

	public String getApplyMerchantPid() {
		return this.applyMerchantPid;
	}
	public void setApplyMerchantPid(String applyMerchantPid) {
		this.applyMerchantPid = applyMerchantPid;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
