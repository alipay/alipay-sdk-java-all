package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分奖品信息
 *
 * @author auto create
 * @since 1.0, 2019-05-01 11:19:12
 */
public class PointPrizeInfo extends AlipayObject {

	private static final long serialVersionUID = 3524292791273922521L;

	/**
	 * 奖品兑换的结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 兑换奖品所需的积分数，大于0
	 */
	@ApiField("exchange_point")
	private Long exchangePoint;

	/**
	 * 奖品的发放使用规则说明等
	 */
	@ApiField("intro")
	private String intro;

	/**
	 * 奖品图片地址
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 积分奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品编号
	 */
	@ApiField("prize_no")
	private String prizeNo;

	/**
	 * 奖品类型。CONSUME_VOUCHER：消费红包，IN_KIND_PRIZE：实物奖品。全部类型可在财富开放平台查看
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 奖品开始兑换的时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 奖品库存，当前剩余可兑换的库存
	 */
	@ApiField("stock")
	private Long stock;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getExchangePoint() {
		return this.exchangePoint;
	}
	public void setExchangePoint(Long exchangePoint) {
		this.exchangePoint = exchangePoint;
	}

	public String getIntro() {
		return this.intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeNo() {
		return this.prizeNo;
	}
	public void setPrizeNo(String prizeNo) {
		this.prizeNo = prizeNo;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getStock() {
		return this.stock;
	}
	public void setStock(Long stock) {
		this.stock = stock;
	}

}
