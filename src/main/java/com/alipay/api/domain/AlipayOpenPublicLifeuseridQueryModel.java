package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号高院查询匹配用户信息接口
 *
 * @author auto create
 * @since 1.0, 2018-03-19 10:49:19
 */
public class AlipayOpenPublicLifeuseridQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7124425651778538212L;

	/**
	 * 手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
