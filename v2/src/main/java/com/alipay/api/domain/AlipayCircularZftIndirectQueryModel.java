package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁直付通进件查询
 *
 * @author auto create
 * @since 1.0, 2025-12-05 16:46:55
 */
public class AlipayCircularZftIndirectQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5139836699991726147L;

	/**
	 * 签约支付宝账户
	 */
	@ApiField("binding_alipay_logon_id")
	private String bindingAlipayLogonId;

	/**
	 * 进件申请单中的二级商户openid
	 */
	@ApiField("relation_openid")
	private String relationOpenid;

	/**
	 * 进件申请单中的二级商户uid
	 */
	@ApiField("relation_uid")
	private String relationUid;

	/**
	 * 场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBindingAlipayLogonId() {
		return this.bindingAlipayLogonId;
	}
	public void setBindingAlipayLogonId(String bindingAlipayLogonId) {
		this.bindingAlipayLogonId = bindingAlipayLogonId;
	}

	public String getRelationOpenid() {
		return this.relationOpenid;
	}
	public void setRelationOpenid(String relationOpenid) {
		this.relationOpenid = relationOpenid;
	}

	public String getRelationUid() {
		return this.relationUid;
	}
	public void setRelationUid(String relationUid) {
		this.relationUid = relationUid;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
