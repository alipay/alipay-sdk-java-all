package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家给用户赠送彩票，由亚博科技提供服务
 *
 * @author auto create
 * @since 1.0, 2023-01-11 20:07:44
 */
public class AlipayCommerceLotteryPresentSendModel extends AlipayObject {

	private static final long serialVersionUID = 8632351943427258879L;

	/**
	 * 被赠送彩票的支付宝用户的ID，不支持一次赠送给多个用户
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 彩种ID
	 */
	@ApiField("lottery_type_id")
	private Long lotteryTypeId;

	/**
	 * 外部订单号，不超过255字符，可包含英文和数字，需保证在商户端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 彩票注数，大于0，最大为100
	 */
	@ApiField("stake_count")
	private Long stakeCount;

	/**
	 * 赠言，不超过20个汉字
	 */
	@ApiField("swety_words")
	private String swetyWords;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public Long getLotteryTypeId() {
		return this.lotteryTypeId;
	}
	public void setLotteryTypeId(Long lotteryTypeId) {
		this.lotteryTypeId = lotteryTypeId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public Long getStakeCount() {
		return this.stakeCount;
	}
	public void setStakeCount(Long stakeCount) {
		this.stakeCount = stakeCount;
	}

	public String getSwetyWords() {
		return this.swetyWords;
	}
	public void setSwetyWords(String swetyWords) {
		this.swetyWords = swetyWords;
	}

}
