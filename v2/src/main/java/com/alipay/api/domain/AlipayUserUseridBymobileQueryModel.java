package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据绑定手机查询支付宝userId接口
 *
 * @author auto create
 * @since 1.0, 2019-01-26 16:33:26
 */
public class AlipayUserUseridBymobileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2384788824674517384L;

	/**
	 * 手机号码，大陆的目前是11位手机号码；海外的是国家码、横杠和号码，如1-123123123
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户类型：1 - 企业类型； 2 - 个人类型。
按照所传内容进行过滤，如果不传则不过滤。
	 */
	@ApiField("user_type")
	private Long userType;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getUserType() {
		return this.userType;
	}
	public void setUserType(Long userType) {
		this.userType = userType;
	}

}
