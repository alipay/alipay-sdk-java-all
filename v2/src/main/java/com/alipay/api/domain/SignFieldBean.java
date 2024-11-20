package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签署区
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:44:20
 */
public class SignFieldBean extends AlipayObject {

	private static final long serialVersionUID = 6752258692972281893L;

	/**
	 * 签署类型：

platform-平台自动签：无需指定签署人。创建流程后，系统将自动盖上商户的默认企业印章。

person-个人签署：需要指定签署人个人信息。创建流程后，需通过签署插件完成签署。
org-企业签署：需要指定签署企业信息与经办人个人信息。创建流程后，需经办人代企业完成签署。（企业暂不支持插件签署，可通过获取签署地址接口获取企业签署地址）
	 */
	@ApiField("sign_field_type")
	private String signFieldType;

	/**
	 * 签署人信息
	 */
	@ApiField("signer")
	private SignerBean signer;

	/**
	 * 签署区key值
	 */
	@ApiField("struct_key")
	private String structKey;

	public String getSignFieldType() {
		return this.signFieldType;
	}
	public void setSignFieldType(String signFieldType) {
		this.signFieldType = signFieldType;
	}

	public SignerBean getSigner() {
		return this.signer;
	}
	public void setSigner(SignerBean signer) {
		this.signer = signer;
	}

	public String getStructKey() {
		return this.structKey;
	}
	public void setStructKey(String structKey) {
		this.structKey = structKey;
	}

}
