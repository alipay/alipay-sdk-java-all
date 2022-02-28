package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建虎符的auth请求
 *
 * @author auto create
 * @since 1.0, 2021-09-06 13:53:21
 */
public class AlipaySecurityRiskHufuAuthCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6523199898418228794L;

	/**
	 * 虎符认证成功后的回调地址
	 */
	@ApiField("callback")
	private String callback;

	/**
	 * 虎符提供的高级策略配置
	 */
	@ApiField("policy")
	private String policy;

	/**
	 * 接入应用的流水号，用于问题的排查等
	 */
	@ApiField("serial")
	private String serial;

	/**
	 * 用户可选的虎符认证类型
	 */
	@ApiField("strategies")
	private String strategies;

	/**
	 * 用户的唯一标识id，这个id是接入应用的用户id，虎符的认证会利用这个id来智能检测用户的设备安全信息
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 需要认证的用户参数，如短信需要提供手机号
	 */
	@ApiField("user")
	private String user;

	public String getCallback() {
		return this.callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}

	public String getPolicy() {
		return this.policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getSerial() {
		return this.serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getStrategies() {
		return this.strategies;
	}
	public void setStrategies(String strategies) {
		this.strategies = strategies;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}

}
