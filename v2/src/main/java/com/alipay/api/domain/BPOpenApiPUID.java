package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 流程全局唯一ID
 *
 * @author auto create
 * @since 1.0, 2024-08-08 14:12:45
 */
public class BPOpenApiPUID extends AlipayObject {

	private static final long serialVersionUID = 8869788586126925687L;

	/**
	 * 系统名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 业务ID，对应业务单条记录的ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务类型。不要填写下划线、点等特殊符号
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 一般留空。如果一个biz_id可发起多个流程实例，则填写此值
	 */
	@ApiField("unique_key")
	private String uniqueKey;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getUniqueKey() {
		return this.uniqueKey;
	}
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

}
