package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RightNoSendList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.gift.send response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 10:57:57
 */
public class AlipayInsMarketingGiftSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165111788153727931L;

	/** 
	 * 渠道规则码
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 赠险产品标志
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/** 
	 * 赠险产品保额发放列表
	 */
	@ApiListField("right_no_send_list")
	@ApiField("right_no_send_list")
	private List<RightNoSendList> rightNoSendList;

	/** 
	 * 本次发放总保额
	 */
	@ApiField("send_sum_insured")
	private String sendSumInsured;

	/** 
	 * 业务成功失败标记
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}
	public String getGiftProdCode( ) {
		return this.giftProdCode;
	}

	public void setRightNoSendList(List<RightNoSendList> rightNoSendList) {
		this.rightNoSendList = rightNoSendList;
	}
	public List<RightNoSendList> getRightNoSendList( ) {
		return this.rightNoSendList;
	}

	public void setSendSumInsured(String sendSumInsured) {
		this.sendSumInsured = sendSumInsured;
	}
	public String getSendSumInsured( ) {
		return this.sendSumInsured;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
