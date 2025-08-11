package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联账号和小程序
 *
 * @author auto create
 * @since 1.0, 2025-04-01 11:32:19
 */
public class AntMerchantExpandApprecommendAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6396844544336383445L;

	/**
	 * 待绑定账号PID
	 */
	@ApiField("acc_no")
	private String accNo;

	/**
	 * 待绑定小程序的app_id
	 */
	@ApiField("app_no")
	private String appNo;

	public String getAccNo() {
		return this.accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAppNo() {
		return this.appNo;
	}
	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

}
