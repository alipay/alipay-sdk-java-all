package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交通卡种子及脚本数据
 *
 * @author auto create
 * @since 1.0, 2020-02-25 18:36:35
 */
public class WorldOfflineDataInfo extends AlipayObject {

	private static final long serialVersionUID = 3563612193262184358L;

	/**
	 * 生码模式
	 */
	@ApiField("auth_mode")
	private String authMode;

	/**
	 * 可用票种
	 */
	@ApiListField("available_ticket_types")
	@ApiField("world_ticket_type")
	private List<WorldTicketType> availableTicketTypes;

	/**
	 * 凭证服务类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 配置信息
	 */
	@ApiField("config")
	private String config;

	/**
	 * 数据来源
	 */
	@ApiField("data_from")
	private String dataFrom;

	/**
	 * 签名失效时间（long类型数据）
	 */
	@ApiField("expire_time")
	private Long expireTime;

	/**
	 * 脱机数据
	 */
	@ApiField("offline_data")
	private String offlineData;

	/**
	 * 用户秘钥
	 */
	@ApiField("private_key")
	private String privateKey;

	/**
	 * 二维码数据
	 */
	@ApiField("qrcode")
	private String qrcode;

	/**
	 * 脚本mac
	 */
	@ApiField("script_mac")
	private String scriptMac;

	/**
	 * 脚本名称
	 */
	@ApiField("script_name")
	private String scriptName;

	/**
	 * 脚本类型
	 */
	@ApiField("script_type")
	private String scriptType;

	/**
	 * 上传原始码开关
	 */
	@ApiField("upload_raw_code")
	private Boolean uploadRawCode;

	/**
	 * 启动脚本生码
	 */
	@ApiField("use_script")
	private Boolean useScript;

	public String getAuthMode() {
		return this.authMode;
	}
	public void setAuthMode(String authMode) {
		this.authMode = authMode;
	}

	public List<WorldTicketType> getAvailableTicketTypes() {
		return this.availableTicketTypes;
	}
	public void setAvailableTicketTypes(List<WorldTicketType> availableTicketTypes) {
		this.availableTicketTypes = availableTicketTypes;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	public String getDataFrom() {
		return this.dataFrom;
	}
	public void setDataFrom(String dataFrom) {
		this.dataFrom = dataFrom;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public String getOfflineData() {
		return this.offlineData;
	}
	public void setOfflineData(String offlineData) {
		this.offlineData = offlineData;
	}

	public String getPrivateKey() {
		return this.privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getQrcode() {
		return this.qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public String getScriptMac() {
		return this.scriptMac;
	}
	public void setScriptMac(String scriptMac) {
		this.scriptMac = scriptMac;
	}

	public String getScriptName() {
		return this.scriptName;
	}
	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getScriptType() {
		return this.scriptType;
	}
	public void setScriptType(String scriptType) {
		this.scriptType = scriptType;
	}

	public Boolean getUploadRawCode() {
		return this.uploadRawCode;
	}
	public void setUploadRawCode(Boolean uploadRawCode) {
		this.uploadRawCode = uploadRawCode;
	}

	public Boolean getUseScript() {
		return this.useScript;
	}
	public void setUseScript(Boolean useScript) {
		this.useScript = useScript;
	}

}
