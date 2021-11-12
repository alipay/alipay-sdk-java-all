package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实名证件信息比对验证咨询
 *
 * @author auto create
 * @since 1.0, 2021-04-20 17:24:22
 */
public class AlipayUserCertdocCertverifyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5674487117889977154L;

	/**
	 * 信息校验验证ID。通过<a href="https://opendocs.alipay.com/apis/api_2/alipay.user.certdoc.certverify.preconsult">alipay.user.certdoc.certverify.preconsult</a>(实名证件信息比对验证预咨询)接口获取。
	 */
	@ApiField("verify_id")
	private String verifyId;

	public String getVerifyId() {
		return this.verifyId;
	}
	public void setVerifyId(String verifyId) {
		this.verifyId = verifyId;
	}

}
