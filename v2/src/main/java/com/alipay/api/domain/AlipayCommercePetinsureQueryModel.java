package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险投保详情查询
 *
 * @author auto create
 * @since 1.0, 2025-01-21 15:05:54
 */
public class AlipayCommercePetinsureQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5256236896321464869L;

	/**
	 * 外部业务单号，每一笔新的投保请求应该保持唯一。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 查询保单的来源场景，为空默认为默认场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 买家用户Id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 支付宝宠物Id
	 */
	@ApiField("pet_id")
	private String petId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

}
