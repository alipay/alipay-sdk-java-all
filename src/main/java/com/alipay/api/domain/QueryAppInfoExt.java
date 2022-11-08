package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 包含了一个应用的基本信息, 如应用名称等
 *
 * @author auto create
 * @since 1.0, 2022-11-02 15:36:17
 */
public class QueryAppInfoExt extends AlipayObject {

	private static final long serialVersionUID = 1256643159246845226L;

	/**
	 * 该应用的应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 该应用的APPID
	 */
	@ApiField("app_number")
	private String appNumber;

	/**
	 * 该应用的应用类型, 如:网页应用, 小程序等
	 */
	@ApiField("application_type")
	private String applicationType;

	/**
	 * 授权回调地址
	 */
	@ApiField("callback_url")
	private String callbackUrl;

	/**
	 * 编码格式
	 */
	@ApiField("charset_type")
	private String charsetType;

	/**
	 * 开发者ID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 网关地址
	 */
	@ApiField("gateway_url")
	private String gatewayUrl;

	/**
	 * 该APPID所挂载的所有功能包编码
	 */
	@ApiListField("package_code_set")
	@ApiField("string")
	private List<String> packageCodeSet;

	/**
	 * 签约主体商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 签名类型
	 */
	@ApiField("signature_type")
	private String signatureType;

	/**
	 * 是否可用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 是否强制加密
	 */
	@ApiField("use_encrypt")
	private Boolean useEncrypt;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppNumber() {
		return this.appNumber;
	}
	public void setAppNumber(String appNumber) {
		this.appNumber = appNumber;
	}

	public String getApplicationType() {
		return this.applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCharsetType() {
		return this.charsetType;
	}
	public void setCharsetType(String charsetType) {
		this.charsetType = charsetType;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
	}

	public String getGatewayUrl() {
		return this.gatewayUrl;
	}
	public void setGatewayUrl(String gatewayUrl) {
		this.gatewayUrl = gatewayUrl;
	}

	public List<String> getPackageCodeSet() {
		return this.packageCodeSet;
	}
	public void setPackageCodeSet(List<String> packageCodeSet) {
		this.packageCodeSet = packageCodeSet;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSignatureType() {
		return this.signatureType;
	}
	public void setSignatureType(String signatureType) {
		this.signatureType = signatureType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getUseEncrypt() {
		return this.useEncrypt;
	}
	public void setUseEncrypt(Boolean useEncrypt) {
		this.useEncrypt = useEncrypt;
	}

}
