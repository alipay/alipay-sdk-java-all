package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝亲情号协议查询
 *
 * @author auto create
 * @since 1.0, 2019-11-21 11:36:18
 */
public class AlipayUserPeerpayprodAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4858388565241932596L;

	/**
	 * 支付宝userId，用于亲情号被开通人
	 */
	@ApiField("alipay_related_uid")
	private String alipayRelatedUid;

	/**
	 * 支付宝userId，用于亲情号开通人
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayRelatedUid() {
		return this.alipayRelatedUid;
	}
	public void setAlipayRelatedUid(String alipayRelatedUid) {
		this.alipayRelatedUid = alipayRelatedUid;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
