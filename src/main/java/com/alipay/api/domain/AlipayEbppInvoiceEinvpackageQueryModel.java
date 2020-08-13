package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户发票包的明细信息
 *
 * @author auto create
 * @since 1.0, 2020-08-11 09:58:43
 */
public class AlipayEbppInvoiceEinvpackageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3727564646468716774L;

	/**
	 * 加密过的uid
	 */
	@ApiField("encrypted_uid")
	private String encryptedUid;

	/**
	 * 发票包id
	 */
	@ApiField("package_id")
	private String packageId;

	public String getEncryptedUid() {
		return this.encryptedUid;
	}
	public void setEncryptedUid(String encryptedUid) {
		this.encryptedUid = encryptedUid;
	}

	public String getPackageId() {
		return this.packageId;
	}
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

}
