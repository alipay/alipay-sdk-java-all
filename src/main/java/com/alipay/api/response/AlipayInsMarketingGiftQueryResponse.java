package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RightNoOpenedList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.gift.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 10:58:17
 */
public class AlipayInsMarketingGiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3471233421481957256L;

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
	 * 是否开通
	 */
	@ApiField("opened")
	private Boolean opened;

	/** 
	 * 赠险产品是否开通列表
	 */
	@ApiListField("right_no_opened_list")
	@ApiField("right_no_opened_list")
	private List<RightNoOpenedList> rightNoOpenedList;

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

	public void setOpened(Boolean opened) {
		this.opened = opened;
	}
	public Boolean getOpened( ) {
		return this.opened;
	}

	public void setRightNoOpenedList(List<RightNoOpenedList> rightNoOpenedList) {
		this.rightNoOpenedList = rightNoOpenedList;
	}
	public List<RightNoOpenedList> getRightNoOpenedList( ) {
		return this.rightNoOpenedList;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
