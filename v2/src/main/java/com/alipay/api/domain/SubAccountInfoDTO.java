package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 子户信息数据传输对象，包含开户状态、子户信息等
 *
 * @author auto create
 * @since 1.0, 2020-08-31 19:43:23
 */
public class SubAccountInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3373963176244599847L;

	/**
	 * 开户状态
ACCEPTED: 受理成功状态，尚未发起开户
OPENING: 子户开通中，等待开户结果
SUCCESS: 子户开通成功状态，子户信息可查询
OPEN_FAILED: 开户失败，需重新发起
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 子户以及其绑定信息
只有当状态为SUCCESS时该参数才存在
	 */
	@ApiField("sub_account_info")
	private SubAccountAndBindDTO subAccountInfo;

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public SubAccountAndBindDTO getSubAccountInfo() {
		return this.subAccountInfo;
	}
	public void setSubAccountInfo(SubAccountAndBindDTO subAccountInfo) {
		this.subAccountInfo = subAccountInfo;
	}

}
