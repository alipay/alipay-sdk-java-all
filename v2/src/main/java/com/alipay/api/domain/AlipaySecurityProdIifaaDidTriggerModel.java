package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * did管理
 *
 * @author auto create
 * @since 1.0, 2025-10-29 11:06:49
 */
public class AlipaySecurityProdIifaaDidTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 4447984164488843835L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * IIFAA did别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * IIFAA设备唯一标识
	 */
	@ApiField("did")
	private String did;

	/**
	 * 用户公钥结构
	 */
	@ApiListField("methods")
	@ApiField("string")
	private List<String> methods;

	/**
	 * did协议版本号
	 */
	@ApiField("pro_version")
	private String proVersion;

	/**
	 * 用户自签名信息，需要验证用户身份时传入
	 */
	@ApiListField("self_sign_info")
	@ApiField("self_sign_info")
	private List<SelfSignInfo> selfSignInfo;

	/**
	 * did文档和签名值
	 */
	@ApiField("sign_document")
	private String signDocument;

	/**
	 * []
	 */
	@ApiListField("sign_methods")
	@ApiField("did_method_info")
	private List<DidMethodInfo> signMethods;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDid() {
		return this.did;
	}
	public void setDid(String did) {
		this.did = did;
	}

	public List<String> getMethods() {
		return this.methods;
	}
	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public String getProVersion() {
		return this.proVersion;
	}
	public void setProVersion(String proVersion) {
		this.proVersion = proVersion;
	}

	public List<SelfSignInfo> getSelfSignInfo() {
		return this.selfSignInfo;
	}
	public void setSelfSignInfo(List<SelfSignInfo> selfSignInfo) {
		this.selfSignInfo = selfSignInfo;
	}

	public String getSignDocument() {
		return this.signDocument;
	}
	public void setSignDocument(String signDocument) {
		this.signDocument = signDocument;
	}

	public List<DidMethodInfo> getSignMethods() {
		return this.signMethods;
	}
	public void setSignMethods(List<DidMethodInfo> signMethods) {
		this.signMethods = signMethods;
	}

}
