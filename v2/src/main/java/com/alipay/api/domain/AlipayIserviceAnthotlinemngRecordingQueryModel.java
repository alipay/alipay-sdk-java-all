package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 热线渠道服务录音查询接口
 *
 * @author auto create
 * @since 1.0, 2023-12-11 10:41:56
 */
public class AlipayIserviceAnthotlinemngRecordingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5692833328484171843L;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务域权限验签
	 */
	@ApiField("biz_sign")
	private String bizSign;

	/**
	 * 通话id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 热线渠道实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizSign() {
		return this.bizSign;
	}
	public void setBizSign(String bizSign) {
		this.bizSign = bizSign;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

}
