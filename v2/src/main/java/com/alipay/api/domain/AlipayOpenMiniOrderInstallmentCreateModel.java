package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单分期
 *
 * @author auto create
 * @since 1.0, 2024-04-23 00:21:53
 */
public class AlipayOpenMiniOrderInstallmentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8335464782565836344L;

	/**
	 * 续租场景分期数，当分期类型为RELET时，该字段必填
	 */
	@ApiField("addon_period_num")
	private Long addonPeriodNum;

	/**
	 * 当前分期数
	 */
	@ApiField("installment_no")
	private String installmentNo;

	/**
	 * 分期数类型
	 */
	@ApiField("installment_no_type")
	private String installmentNoType;

	/**
	 * 当分期类型为RENT，
      期数为1时，分期金额=首期金额；
      期数非1时，分期金额=每期金额，如果有尾期金额，最后一期分期金额=尾期金额；
  当分期类型为BUYOUT，分期金额=买断价 buyout_price；
   当分期类型为RELET，分期金额即续租金额；
	 */
	@ApiField("installment_price")
	private String installmentPrice;

	/**
	 * 分期是否已经完结。
false:未完结
true:已完结
	 */
	@ApiField("is_finish_performance")
	private Boolean isFinishPerformance;

	/**
	 * 分期单同步模式请传入true，该模式会直接推进分期单进入结算阶段
	 */
	@ApiField("is_sync_pay")
	private Boolean isSyncPay;

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
	 * 分期单外部请求号。由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
其他请求参数不变时重复请求会幂等返回分期单号。
	 */
	@ApiField("out_installment_order_id")
	private String outInstallmentOrderId;

	/**
	 * 外部商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户分期扣款的支付方式
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 普通分期数，当分期类型为RENT或BUYOUT时，该字段必填
	 */
	@ApiField("period_num")
	private Long periodNum;

	/**
	 * 分期的阶段编码，与创建时的阶段付款计划里的阶段编码对应。
	 */
	@ApiField("stage_no")
	private Long stageNo;

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

	public Long getAddonPeriodNum() {
		return this.addonPeriodNum;
	}
	public void setAddonPeriodNum(Long addonPeriodNum) {
		this.addonPeriodNum = addonPeriodNum;
	}

	public String getInstallmentNo() {
		return this.installmentNo;
	}
	public void setInstallmentNo(String installmentNo) {
		this.installmentNo = installmentNo;
	}

	public String getInstallmentNoType() {
		return this.installmentNoType;
	}
	public void setInstallmentNoType(String installmentNoType) {
		this.installmentNoType = installmentNoType;
	}

	public String getInstallmentPrice() {
		return this.installmentPrice;
	}
	public void setInstallmentPrice(String installmentPrice) {
		this.installmentPrice = installmentPrice;
	}

	public Boolean getIsFinishPerformance() {
		return this.isFinishPerformance;
	}
	public void setIsFinishPerformance(Boolean isFinishPerformance) {
		this.isFinishPerformance = isFinishPerformance;
	}

	public Boolean getIsSyncPay() {
		return this.isSyncPay;
	}
	public void setIsSyncPay(Boolean isSyncPay) {
		this.isSyncPay = isSyncPay;
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

	public String getOutInstallmentOrderId() {
		return this.outInstallmentOrderId;
	}
	public void setOutInstallmentOrderId(String outInstallmentOrderId) {
		this.outInstallmentOrderId = outInstallmentOrderId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Long getPeriodNum() {
		return this.periodNum;
	}
	public void setPeriodNum(Long periodNum) {
		this.periodNum = periodNum;
	}

	public Long getStageNo() {
		return this.stageNo;
	}
	public void setStageNo(Long stageNo) {
		this.stageNo = stageNo;
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
