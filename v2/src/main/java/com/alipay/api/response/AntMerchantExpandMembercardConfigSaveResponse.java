package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.config.save response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:26:30
 */
public class AntMerchantExpandMembercardConfigSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5838436918671653748L;

	/** 
	 * 商家的安心充配置的唯一编号；
如果是代配置模式不会立刻产生此编号，需要在确认之后；如果是自配置模式，会立刻产生此编号
	 */
	@ApiField("member_product_id")
	private String memberProductId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setMemberProductId(String memberProductId) {
		this.memberProductId = memberProductId;
	}
	public String getMemberProductId( ) {
		return this.memberProductId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
