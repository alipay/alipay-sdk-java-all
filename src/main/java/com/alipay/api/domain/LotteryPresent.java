package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 彩票赠送订单
 *
 * @author auto create
 * @since 1.0, 2017-07-24 14:37:51
 */
public class LotteryPresent extends AlipayObject {

	private static final long serialVersionUID = 1731237967773629386L;

	/**
	 * 用户的支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 彩种名称
	 */
	@ApiField("lottery_type_name")
	private String lotteryTypeName;

	/**
	 * 赠送时间，格式yyyy-MM-dd hh:mm:ss
	 */
	@ApiField("present_date")
	private String presentDate;

	/**
	 * 订单ID
	 */
	@ApiField("present_id")
	private Long presentId;

	/**
	 * 彩票注数
	 */
	@ApiField("stake_count")
	private Long stakeCount;

	/**
	 * 订单状态，含义如下：0-卖家资金未冻结;1-买家未领取;2-买家己领取;3-己创建彩票订单;4-彩票订单出票成功;5-资金己转交代理商;6-订单己过期，待退款;7-冻结资金己退款;8-订单取消。
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 订单状态描述，参见status描述。
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 赠言，不超过20个汉字
	 */
	@ApiField("sweety_words")
	private String sweetyWords;

	/**
	 * 中奖金额，单位：分，为0表示未中奖
	 */
	@ApiField("win_fee")
	private Long winFee;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getLotteryTypeName() {
		return this.lotteryTypeName;
	}
	public void setLotteryTypeName(String lotteryTypeName) {
		this.lotteryTypeName = lotteryTypeName;
	}

	public String getPresentDate() {
		return this.presentDate;
	}
	public void setPresentDate(String presentDate) {
		this.presentDate = presentDate;
	}

	public Long getPresentId() {
		return this.presentId;
	}
	public void setPresentId(Long presentId) {
		this.presentId = presentId;
	}

	public Long getStakeCount() {
		return this.stakeCount;
	}
	public void setStakeCount(Long stakeCount) {
		this.stakeCount = stakeCount;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getSweetyWords() {
		return this.sweetyWords;
	}
	public void setSweetyWords(String sweetyWords) {
		this.sweetyWords = sweetyWords;
	}

	public Long getWinFee() {
		return this.winFee;
	}
	public void setWinFee(Long winFee) {
		this.winFee = winFee;
	}

}
