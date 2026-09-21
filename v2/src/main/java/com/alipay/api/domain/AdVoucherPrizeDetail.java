package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-10 10:12:57
 */
public class AdVoucherPrizeDetail extends AlipayObject {

	private static final long serialVersionUID = 5693712349384289556L;

	/**
	 * 推荐过期时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 发奖系数(一次可能发多个奖品，该字段指明一次发奖个数)
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * 外部奖品ID
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 奖品父发奖单据id
	 */
	@ApiField("parent_order_id")
	private String parentOrderId;

	/**
	 * 奖品金额,单位元
	 */
	@ApiField("price")
	private Long price;

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
	 * 奖品子类型
	 */
	@ApiField("prize_sub_type")
	private String prizeSubType;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 发奖单据ID
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 发奖时间
	 */
	@ApiField("send_time")
	private String sendTime;

	/**
	 * 奖品状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 核销时间
	 */
	@ApiField("use_time")
	private String useTime;

	/**
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

	public String getParentOrderId() {
		return this.parentOrderId;
	}
	public void setParentOrderId(String parentOrderId) {
		this.parentOrderId = parentOrderId;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
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

	public String getPrizeSubType() {
		return this.prizeSubType;
	}
	public void setPrizeSubType(String prizeSubType) {
		this.prizeSubType = prizeSubType;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUseTime() {
		return this.useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
