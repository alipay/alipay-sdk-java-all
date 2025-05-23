package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-05-14 16:02:27
 */
public class PrizeSendOrderDetailRes extends AlipayObject {

	private static final long serialVersionUID = 8174688234953725822L;

	/**
	 * 单个奖品金额，单位元。
	 */
	@ApiField("price")
	private String price;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 发奖奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 发奖orderId
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 发奖状态
	 */
	@ApiField("send_status")
	private String sendStatus;

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
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
