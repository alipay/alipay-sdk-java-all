package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.dcs.merchantqrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-27 13:46:56
 */
public class AlipayCommerceOperationDcsMerchantqrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5723298998472918884L;

	/** 
	 * 支付宝进件商户PID, 仅支持进件绑码过查询
	 */
	@ApiField("apply_merchant_pid")
	private String applyMerchantPid;

	/** 
	 * 直连商户:pid，间联商户:smid
	 */
	@ApiField("role_id")
	private String roleId;

	/** 
	 * 角色ID集合, 直连商户:pid，间联商户:smid
	 */
	@ApiListField("role_ids")
	@ApiField("string")
	private List<String> roleIds;

	public void setApplyMerchantPid(String applyMerchantPid) {
		this.applyMerchantPid = applyMerchantPid;
	}
	public String getApplyMerchantPid( ) {
		return this.applyMerchantPid;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleId( ) {
		return this.roleId;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}
	public List<String> getRoleIds( ) {
		return this.roleIds;
	}

}
