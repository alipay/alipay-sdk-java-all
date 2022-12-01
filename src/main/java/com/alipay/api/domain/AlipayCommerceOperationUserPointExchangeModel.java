package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户积分兑换
 *
 * @author auto create
 * @since 1.0, 2022-11-16 11:13:16
 */
public class AlipayCommerceOperationUserPointExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 1441769491993476635L;

	/**
	 * 积分核销ID，验证point与benefitId的一致性，才能使用对应的积分
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 业务发生时间，格式yyyyMMddHHmmssSSS
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 蚂蚁open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 将要扣减的用户积分
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 每次请求必须有唯一号，如果唯一号相等，会进行幂等返回
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景代码，由行业运营平台分配，提供枚举值。 user_id + scene_code 确定扣减积分的场景。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 请求来源方，由行业运营分配。
例如：linkedmall
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
