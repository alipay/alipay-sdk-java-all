package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益前置咨询
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:24:54
 */
public class AlipayMarketingAssetPreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4892876399432551328L;

	/**
	 * 作为内部交易号使用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务参数大字段，优惠咨询的控制参数，json格式；目前支持传入useBigAmountSkipOrderThold为N来控制不使用大金额跳过优惠的订单门槛检查；默认不传；
	 */
	@ApiField("business_param")
	private String businessParam;

	/**
	 * 证件号码，例如身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，支持传入身份证类型：IDENTITY_CARD
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 商品咨询请求列表（当需要咨询单品券时必传，如果某商品不希望参与本次单品优惠咨询则不传递对应信息即可）
	 */
	@ApiListField("item_consult_list")
	@ApiField("item_consult_request")
	private List<ItemConsultRequest> itemConsultList;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 营销信息，包含promo_taobao等信息
	 */
	@ApiField("promo_info")
	private String promoInfo;

	/**
	 * 参考调用收银台的promoParams，如需咨询结果与拉起收银台一致需要保证这个参数一致
	 */
	@ApiField("promo_rule")
	private String promoRule;

	/**
	 * 场景码，每个业务场景独立分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 券指定的核销appid（如果配券时指定了核销范围为线上小程序及相应的appid则此处必传）
	 */
	@ApiField("specified_app_id")
	private String specifiedAppId;

	/**
	 * 出资的支付宝用户id 限制: 1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBusinessParam() {
		return this.businessParam;
	}
	public void setBusinessParam(String businessParam) {
		this.businessParam = businessParam;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<ItemConsultRequest> getItemConsultList() {
		return this.itemConsultList;
	}
	public void setItemConsultList(List<ItemConsultRequest> itemConsultList) {
		this.itemConsultList = itemConsultList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPromoInfo() {
		return this.promoInfo;
	}
	public void setPromoInfo(String promoInfo) {
		this.promoInfo = promoInfo;
	}

	public String getPromoRule() {
		return this.promoRule;
	}
	public void setPromoRule(String promoRule) {
		this.promoRule = promoRule;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSpecifiedAppId() {
		return this.specifiedAppId;
	}
	public void setSpecifiedAppId(String specifiedAppId) {
		this.specifiedAppId = specifiedAppId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
