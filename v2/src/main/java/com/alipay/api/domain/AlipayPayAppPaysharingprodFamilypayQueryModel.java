package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 亲情卡信息查询
 *
 * @author auto create
 * @since 1.0, 2023-05-05 19:46:07
 */
public class AlipayPayAppPaysharingprodFamilypayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7434848536634423921L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 亲情卡卡号，如果需要查询指定亲情卡信息，需传入
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 支付宝亲情卡业务定义给外部平台唯一业务身份标识，接入前请咨询支付对接技术同学
	 */
	@ApiField("source")
	private String source;

	/**
	 * 当前用户信息
	 */
	@ApiField("user_info")
	private FamilyPayBizUserInfo userInfo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
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
