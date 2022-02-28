package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中奖信息
 *
 * @author auto create
 * @since 1.0, 2018-11-23 10:36:40
 */
public class PrizeDetail extends AlipayObject {

	private static final long serialVersionUID = 8224543759856867522L;

	/**
	 * 中奖时间
	 */
	@ApiField("gmt_time")
	private String gmtTime;

	/**
	 * 外部奖品id（如果是券，就是券id）
	 */
	@ApiField("out_prize_id")
	private String outPrizeId;

	/**
	 * 奖品价值,单位分，如支付宝优惠券等类型奖品，可能为0
	 */
	@ApiField("price")
	private String price;

	/**
	 * 奖品Id
	 */
	@ApiField("prize_id")
	private String prizeId;

	public String getGmtTime() {
		return this.gmtTime;
	}
	public void setGmtTime(String gmtTime) {
		this.gmtTime = gmtTime;
	}

	public String getOutPrizeId() {
		return this.outPrizeId;
	}
	public void setOutPrizeId(String outPrizeId) {
		this.outPrizeId = outPrizeId;
	}

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

}
