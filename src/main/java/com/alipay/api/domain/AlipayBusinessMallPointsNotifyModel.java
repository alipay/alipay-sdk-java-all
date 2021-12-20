package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈积分结果回调通知
 *
 * @author auto create
 * @since 1.0, 2021-03-05 10:35:48
 */
public class AlipayBusinessMallPointsNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 4338664565279229657L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 用于标明此单是否获得积分，
true为获得积分，
false为未获得
	 */
	@ApiField("earn_points")
	private Boolean earnPoints;

	/**
	 * 当未获得积分时，提供未获得积分的原因等备注信息
	 */
	@ApiField("no_points_remarks")
	private String noPointsRemarks;

	/**
	 * 此单获得积分数
	 */
	@ApiField("obtain_points")
	private Long obtainPoints;

	/**
	 * 此笔订单积分处理成功的时间
	 */
	@ApiField("points_update_time")
	private Date pointsUpdateTime;

	/**
	 * 顾客积分总额
	 */
	@ApiField("total_points")
	private Long totalPoints;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public Boolean getEarnPoints() {
		return this.earnPoints;
	}
	public void setEarnPoints(Boolean earnPoints) {
		this.earnPoints = earnPoints;
	}

	public String getNoPointsRemarks() {
		return this.noPointsRemarks;
	}
	public void setNoPointsRemarks(String noPointsRemarks) {
		this.noPointsRemarks = noPointsRemarks;
	}

	public Long getObtainPoints() {
		return this.obtainPoints;
	}
	public void setObtainPoints(Long obtainPoints) {
		this.obtainPoints = obtainPoints;
	}

	public Date getPointsUpdateTime() {
		return this.pointsUpdateTime;
	}
	public void setPointsUpdateTime(Date pointsUpdateTime) {
		this.pointsUpdateTime = pointsUpdateTime;
	}

	public Long getTotalPoints() {
		return this.totalPoints;
	}
	public void setTotalPoints(Long totalPoints) {
		this.totalPoints = totalPoints;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
