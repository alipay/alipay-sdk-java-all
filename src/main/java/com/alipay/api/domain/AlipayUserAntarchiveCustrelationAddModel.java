package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 添加蚂蚁档案客户关联
 *
 * @author auto create
 * @since 1.0, 2020-06-05 20:07:38
 */
public class AlipayUserAntarchiveCustrelationAddModel extends AlipayObject {

	private static final long serialVersionUID = 7542194762837574325L;

	/**
	 * 待关联客户id
	 */
	@ApiField("cust_id")
	private String custId;

	/**
	 * 蚂蚁档案身份信息证明
	 */
	@ApiField("identity_certificate")
	private AntArchiveIdentityCertificate identityCertificate;

	public String getCustId() {
		return this.custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

	public AntArchiveIdentityCertificate getIdentityCertificate() {
		return this.identityCertificate;
	}
	public void setIdentityCertificate(AntArchiveIdentityCertificate identityCertificate) {
		this.identityCertificate = identityCertificate;
	}

}
