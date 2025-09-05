package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账号状态同步
 *
 * @author auto create
 * @since 1.0, 2025-04-28 17:15:02
 */
public class AlipayContentLifeaccountStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1256443227797298247L;

	/**
	 * 账号最新状态，当前仅支持注销
	 */
	@ApiField("account_status")
	private String accountStatus;

	/**
	 * 加密后的好大夫id，与public id一起指定一个操作用户
	 */
	@ApiField("hdf_id_encrypted")
	private String hdfIdEncrypted;

	/**
	 * 用于指定更新的内容号id
	 */
	@ApiField("public_id")
	private String publicId;

	public String getAccountStatus() {
		return this.accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getHdfIdEncrypted() {
		return this.hdfIdEncrypted;
	}
	public void setHdfIdEncrypted(String hdfIdEncrypted) {
		this.hdfIdEncrypted = hdfIdEncrypted;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

}
