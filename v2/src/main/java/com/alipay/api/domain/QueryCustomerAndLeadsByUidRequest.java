package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-12 15:47:41
 */
public class QueryCustomerAndLeadsByUidRequest extends AlipayObject {

	private static final long serialVersionUID = 6773242723179145979L;

	/**
	 * 官网uid
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 渠道uid
	 */
	@ApiField("platform_uid")
	private String platformUid;

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getPlatformUid() {
		return this.platformUid;
	}
	public void setPlatformUid(String platformUid) {
		this.platformUid = platformUid;
	}

}
