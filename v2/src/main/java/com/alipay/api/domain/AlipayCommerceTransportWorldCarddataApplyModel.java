package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非中国大陆用户获取卡种子及相关数据。
 *
 * @author auto create
 * @since 1.0, 2022-12-02 18:11:31
 */
public class AlipayCommerceTransportWorldCarddataApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8497757859156542512L;

	/**
	 * 请求号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用户的卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡类型，城市交通部门维度，如羊城通是一种cardtype。
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 客户端SDK版本
	 */
	@ApiField("client_gencode_sdkversion")
	private String clientGencodeSdkversion;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 请求来源，大湾区本期只支持“GN_HK”。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getClientGencodeSdkversion() {
		return this.clientGencodeSdkversion;
	}
	public void setClientGencodeSdkversion(String clientGencodeSdkversion) {
		this.clientGencodeSdkversion = clientGencodeSdkversion;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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
