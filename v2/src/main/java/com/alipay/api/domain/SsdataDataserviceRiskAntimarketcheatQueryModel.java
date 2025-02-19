package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁盾营销反作弊服务
 *
 * @author auto create
 * @since 1.0, 2020-02-10 16:13:35
 */
public class SsdataDataserviceRiskAntimarketcheatQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3563354314163383872L;

	/**
	 * 行为发生时的身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

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
	 * 风险场景码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 版本号
	 */
	@ApiField("sys_version")
	private String sysVersion;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
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

}
