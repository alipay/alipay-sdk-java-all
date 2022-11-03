package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 增加名单内容
 *
 * @author auto create
 * @since 1.0, 2018-12-19 14:58:59
 */
public class AlipaySecurityDataNamelistSendModel extends AlipayObject {

	private static final long serialVersionUID = 8235245139238744963L;

	/**
	 * 业务名称,用来区分消息处理类目
	 */
	@ApiField("bizname")
	private String bizname;

	/**
	 * json格式具体内容.
	 */
	@ApiField("payload")
	private String payload;

	/**
	 * 对方系统名称,用于追踪消息发送来源系统
	 */
	@ApiField("sysname")
	private String sysname;

	public String getBizname() {
		return this.bizname;
	}
	public void setBizname(String bizname) {
		this.bizname = bizname;
	}

	public String getPayload() {
		return this.payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getSysname() {
		return this.sysname;
	}
	public void setSysname(String sysname) {
		this.sysname = sysname;
	}

}
