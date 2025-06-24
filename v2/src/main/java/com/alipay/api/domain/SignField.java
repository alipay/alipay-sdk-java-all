package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class SignField extends AlipayObject {

	private static final long serialVersionUID = 1763934818172688236L;

	/**
	 * 平台自动签
	 */
	@ApiField("auto_execute")
	private String autoExecute;

	/**
	 * 签署人信息
	 */
	@ApiField("signer")
	private Signer signer;

	/**
	 * 模板组件id
	 */
	@ApiField("struct_key")
	private String structKey;

	public String getAutoExecute() {
		return this.autoExecute;
	}
	public void setAutoExecute(String autoExecute) {
		this.autoExecute = autoExecute;
	}

	public Signer getSigner() {
		return this.signer;
	}
	public void setSigner(Signer signer) {
		this.signer = signer;
	}

	public String getStructKey() {
		return this.structKey;
	}
	public void setStructKey(String structKey) {
		this.structKey = structKey;
	}

}
