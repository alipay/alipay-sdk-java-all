package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家安心充退卡
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:44:16
 */
public class AntMerchantExpandMembercardRefundSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 8452748451132489116L;

	/**
	 * 商家的安心充配置的唯一编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemberProductId() {
		return this.memberProductId;
	}
	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
