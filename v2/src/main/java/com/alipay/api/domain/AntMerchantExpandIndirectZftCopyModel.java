package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通二级商户迁移
 *
 * @author auto create
 * @since 1.0, 2024-09-23 21:53:50
 */
public class AntMerchantExpandIndirectZftCopyModel extends AlipayObject {

	private static final long serialVersionUID = 5597251611654413998L;

	/**
	 * 直付通二级商户迁移后所属服务商PID
	 */
	@ApiField("pid_new")
	private String pidNew;

	/**
	 * 待迁移的直付通二级商户smid
	 */
	@ApiField("smid_old")
	private String smidOld;

	public String getPidNew() {
		return this.pidNew;
	}
	public void setPidNew(String pidNew) {
		this.pidNew = pidNew;
	}

	public String getSmidOld() {
		return this.smidOld;
	}
	public void setSmidOld(String smidOld) {
		this.smidOld = smidOld;
	}

}
