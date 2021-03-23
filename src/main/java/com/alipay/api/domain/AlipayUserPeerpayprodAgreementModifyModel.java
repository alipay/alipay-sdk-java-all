package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝亲情号协议修改
 *
 * @author auto create
 * @since 1.0, 2019-11-21 11:36:28
 */
public class AlipayUserPeerpayprodAgreementModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8487149818912338981L;

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

	/**
	 * 页面渲染默认修改的额度，单位是元，示例值是10000元
	 */
	@ApiField("quota")
	private String quota;

	/**
	 * 签约来源
	 */
	@ApiField("request_from")
	private String requestFrom;

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

	public String getQuota() {
		return this.quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

}
