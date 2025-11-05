package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商联合会员信息同步
 *
 * @author auto create
 * @since 1.0, 2024-06-12 15:16:24
 */
public class AlipayCommerceAcommunicationUnionmemberActionSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8182292189113363416L;

	/**
	 * 用户的行为类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户发生该行为的时间
	 */
	@ApiField("execute_time")
	private Date executeTime;

	/**
	 * 用于幂等控制行为
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 联合会员办理业务的手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 联合会员的外部用户Id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * JSON格式字符串。会员行为的相关参数
	 */
	@ApiField("params")
	private String params;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Date getExecuteTime() {
		return this.executeTime;
	}
	public void setExecuteTime(Date executeTime) {
		this.executeTime = executeTime;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
