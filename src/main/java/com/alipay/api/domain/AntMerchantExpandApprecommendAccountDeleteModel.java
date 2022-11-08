package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消关联账号和小程序
 *
 * @author auto create
 * @since 1.0, 2022-10-10 12:08:57
 */
public class AntMerchantExpandApprecommendAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4223424594169325883L;

	/**
	 * 待解绑账号PID
	 */
	@ApiField("acc_no")
	private String accNo;

	/**
	 * 待解绑小程序的app_id
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
