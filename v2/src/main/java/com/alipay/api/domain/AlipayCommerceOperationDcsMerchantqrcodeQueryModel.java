package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 进件商户绑码消息查询
 *
 * @author auto create
 * @since 1.0, 2023-06-27 13:46:16
 */
public class AlipayCommerceOperationDcsMerchantqrcodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3211822776922144681L;

	/**
	 * 进件商户PID
	 */
	@ApiField("apply_merchant_pid")
	private String applyMerchantPid;

	/**
	 * 运营服务商PID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 被运营商户PID
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

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

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
