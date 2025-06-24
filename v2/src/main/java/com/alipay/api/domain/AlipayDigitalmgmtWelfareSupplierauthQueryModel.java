package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商查询福利权益
 *
 * @author auto create
 * @since 1.0, 2025-04-29 19:08:09
 */
public class AlipayDigitalmgmtWelfareSupplierauthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3255489463997314155L;

	/**
	 * 该参数用来标识供应商请求的服务内容，是由蚂蚁提供给供应商，蚂蚁侧会根据此参数识别供应商
	 */
	@ApiField("api_key")
	private String apiKey;

	/**
	 * 该参数用来标识进入供应商系统的用户标志，是登录供应商应用后解析来的，蚂蚁EAP会将此参数作为用户标志之一
	 */
	@ApiField("emp_sid")
	private String empSid;

	/**
	 * 该参数用来标识存场景扩展信息，是供应商不同的场景传入对应的信息，蚂蚁侧会进行留存
	 */
	@ApiField("ext_info")
	private WelfareAuthExtReq extInfo;

	/**
	 * 该参数用来标识不同渠道的登录标识，是根据用户登录供应商系统后，由供应商传入
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 该参数用来标识用户访问场景，是供应商不同的场景传入对应的来源，蚂蚁侧会根据此来判断员工是否在权益范围内
	 */
	@ApiField("scene")
	private String scene;

	public String getApiKey() {
		return this.apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getEmpSid() {
		return this.empSid;
	}
	public void setEmpSid(String empSid) {
		this.empSid = empSid;
	}

	public WelfareAuthExtReq getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(WelfareAuthExtReq extInfo) {
		this.extInfo = extInfo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
