package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户产品协议签约查询
 *
 * @author auto create
 * @since 1.0, 2018-11-30 21:26:04
 */
public class AlipayInsSceneProductAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3447782332998867656L;

	/**
	 * 签约协议类型，参见InsSignTypeEnum
	 */
	@ApiField("agreement_sign_type")
	private String agreementSignType;

	/**
	 * 支付宝2088开头的签约商户的用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 签约渠道，有系统分配给用户
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 商户协议有效时间查询的最大时间，格式为yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("end_effect_time")
	private Date endEffectTime;

	/**
	 * 产品机构编码
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 签约用户id，与sign_user_type匹配
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 签约用户类型，详见SignUserTypeEnum
	 */
	@ApiField("sign_user_type")
	private String signUserType;

	/**
	 * 查询的有效期范围的开始时间条件
	 */
	@ApiField("start_effect_time")
	private Date startEffectTime;

	/**
	 * 状态枚举详见InsAgreementStatusEnum
	 */
	@ApiField("status")
	private Long status;

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

	public Date getEndEffectTime() {
		return this.endEffectTime;
	}
	public void setEndEffectTime(Date endEffectTime) {
		this.endEffectTime = endEffectTime;
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

	public Date getStartEffectTime() {
		return this.startEffectTime;
	}
	public void setStartEffectTime(Date startEffectTime) {
		this.startEffectTime = startEffectTime;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
