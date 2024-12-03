package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈积分结果回调通知
 *
 * @author auto create
 * @since 1.0, 2022-11-03 10:56:16
 */
public class AlipayBusinessMallPointsNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 1748623615526165946L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * buyer_open_id是用户（UserId）在应用（AppId）下的唯一用户标识
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

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

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
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
