package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体用户信息修改
 *
 * @author auto create
 * @since 1.0, 2024-08-19 10:59:59
 */
public class AlipayCloudCloudpromoAgentUserModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2857236781169433568L;

	/**
	 * 用户证件
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 商户自定义的用户Id。
	 */
	@ApiField("custom_id")
	private String customId;

	/**
	 * 智能体实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 用户手机
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户名字
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCustomId() {
		return this.customId;
	}
	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
