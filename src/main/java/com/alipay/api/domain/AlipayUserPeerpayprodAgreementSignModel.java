package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝亲情号协议签约
 *
 * @author auto create
 * @since 1.0, 2019-11-21 11:36:40
 */
public class AlipayUserPeerpayprodAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 1323751844227282515L;

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
	 * 页面渲染默认签约的额度，单位是元，示例值是10000元
	 */
	@ApiField("quota")
	private Long quota;

	/**
	 * 开通人与被开通人的关系标签；alipay_user_id,alipay_related_id的关系；
如果传空默认为"其他亲友"
其他示例值:
"爸爸","妈妈","儿子","女儿","其他亲友","公公","婆婆","老婆","老公","岳父","岳母"
	 */
	@ApiField("relation_name")
	private String relationName;

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

	public Long getQuota() {
		return this.quota;
	}
	public void setQuota(Long quota) {
		this.quota = quota;
	}

	public String getRelationName() {
		return this.relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

}
