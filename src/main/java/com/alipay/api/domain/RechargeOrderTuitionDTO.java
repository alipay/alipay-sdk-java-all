package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 学费码充值订单
 *
 * @author auto create
 * @since 1.0, 2020-10-27 10:54:13
 */
public class RechargeOrderTuitionDTO extends AlipayObject {

	private static final long serialVersionUID = 6696112453571837179L;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 已完成的打款数
	 */
	@ApiField("finished_periods")
	private Long finishedPeriods;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 总的分期数
	 */
	@ApiField("periods")
	private Long periods;

	/**
	 * 分期扣款任务列表，未付款状态，打款任务为空
	 */
	@ApiListField("plans")
	@ApiField("instalment_plan_tuition_d_t_o")
	private List<InstalmentPlanTuitionDTO> plans;

	/**
	 * 学费码分期付款扣款计划
	 */
	@ApiField("recharge_config")
	private RechargeConfigTuitionDTO rechargeConfig;

	/**
	 * 退款类型
1, "全部退款"
2, "未到账资金退款"
	 */
	@ApiField("refund_type")
	private String refundType;

	/**
	 * 二级商户
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 订单状态
0, "待付款"

1, "打款流程中"

2, "打款完成"

3, "退款中"

4, "退款完成"

5, "冻结中"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 充值总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户姓名
	 */
	@ApiField("user_display_name")
	private String userDisplayName;

	/**
	 * 缴费用户的支付宝pid
	 */
	@ApiField("user_id")
	private String userId;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getFinishedPeriods() {
		return this.finishedPeriods;
	}
	public void setFinishedPeriods(Long finishedPeriods) {
		this.finishedPeriods = finishedPeriods;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public Long getPeriods() {
		return this.periods;
	}
	public void setPeriods(Long periods) {
		this.periods = periods;
	}

	public List<InstalmentPlanTuitionDTO> getPlans() {
		return this.plans;
	}
	public void setPlans(List<InstalmentPlanTuitionDTO> plans) {
		this.plans = plans;
	}

	public RechargeConfigTuitionDTO getRechargeConfig() {
		return this.rechargeConfig;
	}
	public void setRechargeConfig(RechargeConfigTuitionDTO rechargeConfig) {
		this.rechargeConfig = rechargeConfig;
	}

	public String getRefundType() {
		return this.refundType;
	}
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserDisplayName() {
		return this.userDisplayName;
	}
	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
