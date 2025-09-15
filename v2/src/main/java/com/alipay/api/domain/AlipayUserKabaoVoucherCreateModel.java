package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建支付宝卡包优惠券
 *
 * @author auto create
 * @since 1.0, 2023-11-30 19:17:56
 */
public class AlipayUserKabaoVoucherCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1815528811677351811L;

	/**
	 * 1、每批优惠券用一个唯一的批次id。
2、异常情况下，可以根据批次id对所有的优惠券进行订正。
3、不可为空。确保不同批次的优惠券的批次号不同，否则异常情况下将无法合理的进行数据订正。
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 业务使用场景
	 */
	@ApiField("biz_use_scene")
	private String bizUseScene;

	/**
	 * 代金券的价值模型
	 */
	@ApiField("cash_voucher_value_info")
	private CashVoucherValueInfo cashVoucherValueInfo;

	/**
	 * 优惠券有效期结束的时间点
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 兑换券的价值模型
	 */
	@ApiField("exchange_voucher_value_info")
	private ExchangeVoucherValueInfo exchangeVoucherValueInfo;

	/**
	 * 给支付宝用户发券的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户侧优惠券的唯一标识
	 */
	@ApiField("out_instance_id")
	private String outInstanceId;

	/**
	 * 优惠券归属的信息，比如归属的小程序id，品牌名称等。
	 */
	@ApiField("principal_info")
	private VoucherPrincipalInfo principalInfo;

	/**
	 * 优惠券规则信息
	 */
	@ApiField("rule_info")
	private VoucherRuleInfo ruleInfo;

	/**
	 * 优惠券有效期的开始时间点
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 优惠券类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 优惠券使用信息
	 */
	@ApiField("usage_info")
	private VoucherUsageInfo usageInfo;

	/**
	 * 给支付宝用户发券的2088uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBizUseScene() {
		return this.bizUseScene;
	}
	public void setBizUseScene(String bizUseScene) {
		this.bizUseScene = bizUseScene;
	}

	public CashVoucherValueInfo getCashVoucherValueInfo() {
		return this.cashVoucherValueInfo;
	}
	public void setCashVoucherValueInfo(CashVoucherValueInfo cashVoucherValueInfo) {
		this.cashVoucherValueInfo = cashVoucherValueInfo;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public ExchangeVoucherValueInfo getExchangeVoucherValueInfo() {
		return this.exchangeVoucherValueInfo;
	}
	public void setExchangeVoucherValueInfo(ExchangeVoucherValueInfo exchangeVoucherValueInfo) {
		this.exchangeVoucherValueInfo = exchangeVoucherValueInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutInstanceId() {
		return this.outInstanceId;
	}
	public void setOutInstanceId(String outInstanceId) {
		this.outInstanceId = outInstanceId;
	}

	public VoucherPrincipalInfo getPrincipalInfo() {
		return this.principalInfo;
	}
	public void setPrincipalInfo(VoucherPrincipalInfo principalInfo) {
		this.principalInfo = principalInfo;
	}

	public VoucherRuleInfo getRuleInfo() {
		return this.ruleInfo;
	}
	public void setRuleInfo(VoucherRuleInfo ruleInfo) {
		this.ruleInfo = ruleInfo;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public VoucherUsageInfo getUsageInfo() {
		return this.usageInfo;
	}
	public void setUsageInfo(VoucherUsageInfo usageInfo) {
		this.usageInfo = usageInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
