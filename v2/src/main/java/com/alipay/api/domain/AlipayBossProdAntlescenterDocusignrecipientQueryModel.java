package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取签署人签署链接
 *
 * @author auto create
 * @since 1.0, 2024-08-02 16:35:03
 */
public class AlipayBossProdAntlescenterDocusignrecipientQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7456543368167889125L;

	/**
	 * 应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 用户签署完成跳转URL
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 签署任务业务方唯一id
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 用户邮箱地址
	 */
	@ApiField("email")
	private String email;

	/**
	 * 签署人recipient id，用于鉴别用户身份的
	 */
	@ApiField("recipient_id")
	private String recipientId;

	/**
	 * 签署任务流水id
	 */
	@ApiField("sign_task_id")
	private String signTaskId;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRecipientId() {
		return this.recipientId;
	}
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getSignTaskId() {
		return this.signTaskId;
	}
	public void setSignTaskId(String signTaskId) {
		this.signTaskId = signTaskId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
