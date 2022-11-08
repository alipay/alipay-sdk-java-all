package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试路由转发groovy脚本
 *
 * @author auto create
 * @since 1.0, 2022-10-10 18:45:04
 */
public class AlipayOpenOperationOpenbizmockRzonegroovyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3822534294716174624L;

	/**
	 * 测试
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 测试
	 */
	@ApiField("uid")
	private String uid;

	public AgreementParams getAgreementParams() {
		return this.agreementParams;
	}
	public void setAgreementParams(AgreementParams agreementParams) {
		this.agreementParams = agreementParams;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
