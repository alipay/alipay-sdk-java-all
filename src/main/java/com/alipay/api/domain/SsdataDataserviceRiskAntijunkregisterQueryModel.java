package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾垃圾注册测试
 *
 * @author auto create
 * @since 1.0, 2017-07-26 14:35:23
 */
public class SsdataDataserviceRiskAntijunkregisterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6527314593378825735L;

	/**
	 * 行为发生时的Apdid值
	 */
	@ApiField("apdid")
	private String apdid;

	/**
	 * 行为发生时的IP值
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 调用服务的商户id ，如果是第三方服务商，需要将其实际的商户id透传过来，如果是普通商户传入自己的appid即可
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 行为发生时的手机号
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 风险场景码，不传该参数，则走默认的场景
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 业务场景，不传该参数，则走默认的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 版本号
	 */
	@ApiField("sys_version")
	private String sysVersion;

	/**
	 * 行为发生时的UMID值
	 */
	@ApiField("umid")
	private String umid;

	public String getApdid() {
		return this.apdid;
	}
	public void setApdid(String apdid) {
		this.apdid = apdid;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSysVersion() {
		return this.sysVersion;
	}
	public void setSysVersion(String sysVersion) {
		this.sysVersion = sysVersion;
	}

	public String getUmid() {
		return this.umid;
	}
	public void setUmid(String umid) {
		this.umid = umid;
	}

}
