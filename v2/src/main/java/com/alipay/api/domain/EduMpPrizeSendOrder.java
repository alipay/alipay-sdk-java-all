package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中奖流水模型
 *
 * @author auto create
 * @since 1.0, 2026-05-18 19:51:15
 */
public class EduMpPrizeSendOrder extends AlipayObject {

	private static final long serialVersionUID = 7439851761175489268L;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动流水id
	 */
	@ApiField("camp_order_id")
	private String campOrderId;

	/**
	 * 奖品对客信息
	 */
	@ApiField("prize_custom_display_info")
	private EduPrizeCustomDisplayInfo prizeCustomDisplayInfo;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 发奖流水
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 发奖状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampOrderId() {
		return this.campOrderId;
	}
	public void setCampOrderId(String campOrderId) {
		this.campOrderId = campOrderId;
	}

	public EduPrizeCustomDisplayInfo getPrizeCustomDisplayInfo() {
		return this.prizeCustomDisplayInfo;
	}
	public void setPrizeCustomDisplayInfo(EduPrizeCustomDisplayInfo prizeCustomDisplayInfo) {
		this.prizeCustomDisplayInfo = prizeCustomDisplayInfo;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getSendStatus() {
		return this.sendStatus;
	}
	public void setSendStatus(String sendStatus) {
		this.sendStatus = sendStatus;
	}

}
