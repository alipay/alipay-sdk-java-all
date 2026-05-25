package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduMpPrizeSendOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campaign.drawcamp.trigger response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-18 20:47:45
 */
public class AlipayCommerceEducateCampaignDrawcampTriggerResponse extends AlipayResponse {

	private static final long serialVersionUID = 6876581555343327573L;

	/** 
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/** 
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/** 
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/** 
	 * 中奖流水列表
	 */
	@ApiListField("send_order_list")
	@ApiField("edu_mp_prize_send_order")
	private List<EduMpPrizeSendOrder> sendOrderList;

	/** 
	 * 发奖信息
	 */
	@ApiField("trigger_result")
	private Boolean triggerResult;

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeId( ) {
		return this.prizeId;
	}

	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeName( ) {
		return this.prizeName;
	}

	public void setSendOrderList(List<EduMpPrizeSendOrder> sendOrderList) {
		this.sendOrderList = sendOrderList;
	}
	public List<EduMpPrizeSendOrder> getSendOrderList( ) {
		return this.sendOrderList;
	}

	public void setTriggerResult(Boolean triggerResult) {
		this.triggerResult = triggerResult;
	}
	public Boolean getTriggerResult( ) {
		return this.triggerResult;
	}

}
