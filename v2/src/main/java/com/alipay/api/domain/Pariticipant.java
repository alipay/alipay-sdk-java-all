package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 咨询主体信息
 *
 * @author auto create
 * @since 1.0, 2023-07-18 15:58:41
 */
public class Pariticipant extends AlipayObject {

	private static final long serialVersionUID = 7331966298163477786L;

	/**
	 * 风控主体标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 风控主体标识类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 风控主体名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 入驻平台的时间点，格式是yyyy-MM-dd HH:mm，biz_scene是CONSULT_BY_RISK_SCENE时必填
	 */
	@ApiField("settle_in_time")
	private String settleInTime;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSettleInTime() {
		return this.settleInTime;
	}
	public void setSettleInTime(String settleInTime) {
		this.settleInTime = settleInTime;
	}

}
