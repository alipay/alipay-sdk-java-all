package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收费申请报送
 *
 * @author auto create
 * @since 1.0, 2019-11-17 23:10:12
 */
public class AlipayOpenOperationBizfeeAftechApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8581567992685727595L;

	/**
	 * 系统/应用名称
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 合约号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 客户信息（JSON对象）
包含principalType主体类型、principalId主体Id、extInfo扩展信息等字段。其中，需要从extInfo透传消费的key有：relEntityId关联主体Id。
	 */
	@ApiField("customer")
	private String customer;

	/**
	 * 费用金额
单位元，最多两位小数。在FEE_SETTLE模式下消费。
	 */
	@ApiField("fee_amount")
	private String feeAmount;

	/**
	 * 费用币种
币种数字编码。在FEE_SETTLE模式下消费。
	 */
	@ApiField("fee_currency")
	private String feeCurrency;

	/**
	 * 生效价格匹配时间
在FEE_SETTLE模式下消费。
	 */
	@ApiField("gmt_charge")
	private String gmtCharge;

	/**
	 * 业务指定的结算应收时间
	 */
	@ApiField("gmt_receive")
	private String gmtReceive;

	/**
	 * 业务发生时间
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * 业务操作模式
FEE_SETTLE: 费用结算
VOL_AMORTIZE: 走量摊销
	 */
	@ApiField("op_mode")
	private String opMode;

	/**
	 * 外部业务流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 扩展属性（Map<String, String>的JSON对象）
key和value中不能有英文逗号及等于符号。
	 */
	@ApiField("properties")
	private String properties;

	/**
	 * 服务量
传天数/次数/服务金额等数值，如不使用传0。
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 结算周期
1#M（按自然月汇总）
在FEE_SETTLE模式下消费。
	 */
	@ApiField("settle_period")
	private String settlePeriod;

	/**
	 * 结算延迟时间
9#D（延迟9日结算，如至下月10日）
在FEE_SETTLE模式下消费。
	 */
	@ApiField("settle_postponed_time")
	private String settlePostponedTime;

	/**
	 * 结算类型
REALTIME: 实时结算
AUTO_CYCLE: 自动周期结算
在FEE_SETTLE模式下消费。
	 */
	@ApiField("settle_type")
	private String settleType;

	/**
	 * 租户Id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCustomer() {
		return this.customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getFeeAmount() {
		return this.feeAmount;
	}
	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeCurrency() {
		return this.feeCurrency;
	}
	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
	}

	public String getGmtCharge() {
		return this.gmtCharge;
	}
	public void setGmtCharge(String gmtCharge) {
		this.gmtCharge = gmtCharge;
	}

	public String getGmtReceive() {
		return this.gmtReceive;
	}
	public void setGmtReceive(String gmtReceive) {
		this.gmtReceive = gmtReceive;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

	public String getOpMode() {
		return this.opMode;
	}
	public void setOpMode(String opMode) {
		this.opMode = opMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getSettlePeriod() {
		return this.settlePeriod;
	}
	public void setSettlePeriod(String settlePeriod) {
		this.settlePeriod = settlePeriod;
	}

	public String getSettlePostponedTime() {
		return this.settlePostponedTime;
	}
	public void setSettlePostponedTime(String settlePostponedTime) {
		this.settlePostponedTime = settlePostponedTime;
	}

	public String getSettleType() {
		return this.settleType;
	}
	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
