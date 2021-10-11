package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户互通产品查询接口
 *
 * @author auto create
 * @since 1.0, 2017-06-22 16:42:37
 */
public class AlipayUserCustomerIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 7126388254434937612L;

	/**
	 * 预留参数，用于商户区分同一appId下的不同业务场景。默认场景不用传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 设备及环境信息
	 */
	@ApiField("device_info")
	private AlipayUserDeviceInfo deviceInfo;

	/**
	 * 预留业务扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户主体信息。要求AlipayUserPrincipalInfo中的user_id、mobile、email属性，有且只有一个非空。否则接口会忽略除去优先级最高的属性之外的其他属性。
	 */
	@ApiField("principal")
	private AlipayUserPrincipalInfo principal;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public AlipayUserDeviceInfo getDeviceInfo() {
		return this.deviceInfo;
	}
	public void setDeviceInfo(AlipayUserDeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public AlipayUserPrincipalInfo getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(AlipayUserPrincipalInfo principal) {
		this.principal = principal;
	}

}
