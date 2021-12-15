package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规caas咨询接口
 *
 * @author auto create
 * @since 1.0, 2021-01-29 14:53:08
 */
public class AlipayFincoreComplianceCaasBlacklistConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1696234855369168854L;

	/**
	 * app_name+调用方系统名称；会与分配的app_token做校验
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token+每一个app分配一个
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * biz_code+咨询服务分配的业务code
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * event_code+服务方分配的咨询事件code
	 */
	@ApiField("event_code")
	private String eventCode;

	/**
	 * merchant_pid+商户pid，与组织机构代码不可全部为空
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * org_code+商户组织机构代码； 与Pid不可全部为空
	 */
	@ApiField("org_code")
	private String orgCode;

	/**
	 * request_id+请求方自行生成的请求号
	 */
	@ApiField("request_id")
	private String requestId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getEventCode() {
		return this.eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
