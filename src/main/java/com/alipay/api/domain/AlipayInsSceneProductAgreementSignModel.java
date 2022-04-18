package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签订商户商品协议
 *
 * @author auto create
 * @since 1.0, 2022-03-28 17:19:56
 */
public class AlipayInsSceneProductAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 1859641922929468677L;

	/**
	 * 签约类型，参见com.alipay.insopenprod.common.service.facade.model.enums.InsSignTypeEnum
	 */
	@ApiField("agreement_sign_type")
	private String agreementSignType;

	/**
	 * 支付宝2088开头的商户userid
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 商户渠道编码，由系统分配固定值
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 商户产品签约失效时间，格式为： yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("effect_end_time")
	private String effectEndTime;

	/**
	 * 商户产品签约生效起始时间，格式为yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("effect_start_time")
	private String effectStartTime;

	/**
	 * 产品的机构code
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 签约用户ID，月sign_user_type类型匹配
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签约用户ID的类型，参加枚举SignUserTypeEnum
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	public String getAgreementSignType() {
		return this.agreementSignType;
	}
	public void setAgreementSignType(String agreementSignType) {
		this.agreementSignType = agreementSignType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getEffectEndTime() {
		return this.effectEndTime;
	}
	public void setEffectEndTime(String effectEndTime) {
		this.effectEndTime = effectEndTime;
	}

	public String getEffectStartTime() {
		return this.effectStartTime;
	}
	public void setEffectStartTime(String effectStartTime) {
		this.effectStartTime = effectStartTime;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getSignUserType() {
		return this.signUserType;
	}
	public void setSignUserType(String signUserType) {
		this.signUserType = signUserType;
	}

}
