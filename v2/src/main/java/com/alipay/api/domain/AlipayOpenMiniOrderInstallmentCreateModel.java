package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单分期
 *
 * @author auto create
 * @since 1.0, 2023-08-11 08:41:37
 */
public class AlipayOpenMiniOrderInstallmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5659899638789159993L;

	/**
	 * 分期是否已经完结。
false:未完结
true:已完结
	 */
	@ApiField("is_finish_performance")
	private Boolean isFinishPerformance;

	/**
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 交易组件订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部商户订单号，与order_id二者选一
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 期数
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 支付宝收单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 分期类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 2088开头的16位纯数字，小程序场景下获取用户ID请参考：用户授权; 其它场景下获取用户ID请参考：网页授权获取用户信息;
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getIsFinishPerformance() {
		return this.isFinishPerformance;
	}
	public void setIsFinishPerformance(Boolean isFinishPerformance) {
		this.isFinishPerformance = isFinishPerformance;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
