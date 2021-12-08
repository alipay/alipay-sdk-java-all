package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户可以获得的流量模式
 *
 * @author auto create
 * @since 1.0, 2018-12-04 15:30:08
 */
public class AlipayEbppFlowModeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3136667551993771568L;

	/**
	 * json扩展字段
	 */
	@ApiField("ext_msg")
	private String extMsg;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtMsg() {
		return this.extMsg;
	}
	public void setExtMsg(String extMsg) {
		this.extMsg = extMsg;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
