package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试路由转发groovy脚本
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:20:37
 */
public class AlipayOpenOperationOpenbizmockRzonegroovyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5677853833111115253L;

	/**
	 * 测试
	 */
	@ApiField("agreement_params")
	private AgreementParams agreementParams;

	/**
	 * 测试
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
