package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机负一屏卡片发送接口
 *
 * @author auto create
 * @since 1.0, 2020-12-14 21:52:14
 */
public class AlipayUserAccountNegativecardSendModel extends AlipayObject {

	private static final long serialVersionUID = 5812355882467376149L;

	/**
	 * 模板参数,键值对，以竖线分割
	 */
	@ApiField("arguments")
	private String arguments;

	/**
	 * 扩展信息。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 负一屏卡片业务码
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getArguments() {
		return this.arguments;
	}
	public void setArguments(String arguments) {
		this.arguments = arguments;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
