package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改亲情卡
 *
 * @author auto create
 * @since 1.0, 2023-05-11 16:53:15
 */
public class AlipayPayAppPaysharingprodFamilypayModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8831564477761317947L;

	/**
	 * 亲情卡卡唯一id,可通过查询接口响应参数获取
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 亲情卡功能管理，包含状态修改，功能修改
	 */
	@ApiField("modify_type")
	private String modifyType;

	/**
	 * 亲情卡额度信息，额度修改操作必传
	 */
	@ApiField("quota_info")
	private FamilyPayQuotaInfo quotaInfo;

	/**
	 * 当前操作人在亲情卡产品的角色
	 */
	@ApiField("self_role")
	private String selfRole;

	/**
	 * 支付宝亲情卡业务定义给外部平台唯一业务身份标识，接入值咨询@子矛
	 */
	@ApiField("source")
	private String source;

	/**
	 * 当前操作人用户信息
	 */
	@ApiField("user_info")
	private FamilyPayBizUserInfo userInfo;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getModifyType() {
		return this.modifyType;
	}
	public void setModifyType(String modifyType) {
		this.modifyType = modifyType;
	}

	public FamilyPayQuotaInfo getQuotaInfo() {
		return this.quotaInfo;
	}
	public void setQuotaInfo(FamilyPayQuotaInfo quotaInfo) {
		this.quotaInfo = quotaInfo;
	}

	public String getSelfRole() {
		return this.selfRole;
	}
	public void setSelfRole(String selfRole) {
		this.selfRole = selfRole;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public FamilyPayBizUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(FamilyPayBizUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
