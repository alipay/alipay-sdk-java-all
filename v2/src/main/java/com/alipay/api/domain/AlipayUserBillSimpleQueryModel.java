package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易流水精简信息查询
 *
 * @author auto create
 * @since 1.0, 2023-01-30 14:50:50
 */
public class AlipayUserBillSimpleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2872473696718698466L;

	/**
	 * 28位或32位支付宝交易流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 本方卡号（对应用户userid），即16位的2088开头的支付宝uid。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 本方卡号（对应用户userid），即16位的2088开头的支付宝uid。
	 */
	@ApiField("owner_card_no")
	private String ownerCardNo;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOwnerCardNo() {
		return this.ownerCardNo;
	}
	public void setOwnerCardNo(String ownerCardNo) {
		this.ownerCardNo = ownerCardNo;
	}

}
