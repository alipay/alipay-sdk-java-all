package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶梯优惠折扣幅度模型
 *
 * @author auto create
 * @since 1.0, 2017-03-03 16:47:49
 */
public class DiscountRateModel extends AlipayObject {

	private static final long serialVersionUID = 6629497757248348214L;

	/**
	 * 折扣方式
	 */
	@ApiField("discount_dst_camp_prize_model")
	private DiscountDstCampPrizeModel discountDstCampPrizeModel;

	/**
	 * 交易金额下限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("lower_trade_fee")
	private String lowerTradeFee;

	/**
	 * 奖品类型. 打折   满减   单笔减   阶梯优惠   抹零优惠    随机立减   订单金额减至 
     折扣方式
   REDUCE_TO_AMT("reduce_to_amt","优惠后价格")
   DISCOUNT("discount", "折扣方式"),
  REDUCE("reduce", "满立减"),
   SINGLE("single", "单笔减"),
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 满立减
	 */
	@ApiField("reduce_dst_camp_prize_model")
	private ReduceDstCampPrizeModel reduceDstCampPrizeModel;

	/**
	 * 优惠后价格 如果type选了reduce_to_amt 必填
	 */
	@ApiField("reduce_to_amt_dst_camp_prize_model")
	private ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel;

	/**
	 * 单笔减
	 */
	@ApiField("single_dst_camp_prize_model")
	private SingleDstCampPrizeModel singleDstCampPrizeModel;

	/**
	 * 交易金额上限必须为数字，大于0，最多2位小数，整数部分不能超过8位
	 */
	@ApiField("upper_trade_fee")
	private String upperTradeFee;

	public DiscountDstCampPrizeModel getDiscountDstCampPrizeModel() {
		return this.discountDstCampPrizeModel;
	}
	public void setDiscountDstCampPrizeModel(DiscountDstCampPrizeModel discountDstCampPrizeModel) {
		this.discountDstCampPrizeModel = discountDstCampPrizeModel;
	}

	public String getLowerTradeFee() {
		return this.lowerTradeFee;
	}
	public void setLowerTradeFee(String lowerTradeFee) {
		this.lowerTradeFee = lowerTradeFee;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public ReduceDstCampPrizeModel getReduceDstCampPrizeModel() {
		return this.reduceDstCampPrizeModel;
	}
	public void setReduceDstCampPrizeModel(ReduceDstCampPrizeModel reduceDstCampPrizeModel) {
		this.reduceDstCampPrizeModel = reduceDstCampPrizeModel;
	}

	public ReduceToAmtDstCampPrizeModel getReduceToAmtDstCampPrizeModel() {
		return this.reduceToAmtDstCampPrizeModel;
	}
	public void setReduceToAmtDstCampPrizeModel(ReduceToAmtDstCampPrizeModel reduceToAmtDstCampPrizeModel) {
		this.reduceToAmtDstCampPrizeModel = reduceToAmtDstCampPrizeModel;
	}

	public SingleDstCampPrizeModel getSingleDstCampPrizeModel() {
		return this.singleDstCampPrizeModel;
	}
	public void setSingleDstCampPrizeModel(SingleDstCampPrizeModel singleDstCampPrizeModel) {
		this.singleDstCampPrizeModel = singleDstCampPrizeModel;
	}

	public String getUpperTradeFee() {
		return this.upperTradeFee;
	}
	public void setUpperTradeFee(String upperTradeFee) {
		this.upperTradeFee = upperTradeFee;
	}

}
