package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝亲情号账号关系创建
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:22:54
 */
public class AlipayTradePeerpayprodRelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6511542469143618828L;

	/**
	 * 支付宝userId，可以为空，用于传递被开通人
	 */
	@ApiField("aliapy_related_id")
	private String aliapyRelatedId;

	/**
	 * 支付宝userId，可以为空，用于开通人
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 开通人与被开通人的关系标签，user_id,related_id关系
	 */
	@ApiField("relation_name")
	private String relationName;

	/**
	 * 开通人和被开通人的关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 淘宝userId，可以为空，用于传递被开通人
	 */
	@ApiField("taobao_related_id")
	private String taobaoRelatedId;

	/**
	 * 淘宝用户userId,可以传递空，用于开通人
	 */
	@ApiField("taobao_user_id")
	private String taobaoUserId;

	public String getAliapyRelatedId() {
		return this.aliapyRelatedId;
	}
	public void setAliapyRelatedId(String aliapyRelatedId) {
		this.aliapyRelatedId = aliapyRelatedId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getRelationName() {
		return this.relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getTaobaoRelatedId() {
		return this.taobaoRelatedId;
	}
	public void setTaobaoRelatedId(String taobaoRelatedId) {
		this.taobaoRelatedId = taobaoRelatedId;
	}

	public String getTaobaoUserId() {
		return this.taobaoUserId;
	}
	public void setTaobaoUserId(String taobaoUserId) {
		this.taobaoUserId = taobaoUserId;
	}

}
