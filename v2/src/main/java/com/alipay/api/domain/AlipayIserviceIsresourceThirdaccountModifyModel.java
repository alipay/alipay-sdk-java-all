package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新三方平台账号
 *
 * @author auto create
 * @since 1.0, 2026-03-30 14:57:44
 */
public class AlipayIserviceIsresourceThirdaccountModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6694874525421589781L;

	/**
	 * 扩展信息，JSON字符串，覆盖更新
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 企业用户账号
	 */
	@ApiField("external_acc_id")
	private String externalAccId;

	/**
	 * 状态：ACTIVE-激活，IFREEZE-冻结
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 星云用户ID
	 */
	@ApiField("verify_user_id")
	private String verifyUserId;

	/**
	 * 工作台
	 */
	@ApiField("workstation")
	private String workstation;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalAccId() {
		return this.externalAccId;
	}
	public void setExternalAccId(String externalAccId) {
		this.externalAccId = externalAccId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getVerifyUserId() {
		return this.verifyUserId;
	}
	public void setVerifyUserId(String verifyUserId) {
		this.verifyUserId = verifyUserId;
	}

	public String getWorkstation() {
		return this.workstation;
	}
	public void setWorkstation(String workstation) {
		this.workstation = workstation;
	}

}
