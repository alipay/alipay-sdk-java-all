package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻go商户数据回传
 *
 * @author auto create
 * @since 1.0, 2023-11-03 17:19:49
 */
public class ZhimaCreditPeZmgoCumulationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8347225554943675683L;

	/**
	 * 芝麻go协议号，唯一标识一个芝麻go协议。为必传入参。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 金额类型数据。商户回传的数据为金额类型，包括交易金额和优惠金额。累计类型为AMOUNT或AMOUNT_TASK时，为必传入参。也就是cumulate_data_type为AMOUNT或AMOUNT_TASK时，为必传参数。
	 */
	@ApiField("amount_type_data")
	private AmountTypeData amountTypeData;

	/**
	 * 数据回传的动作类型，为枚举值，为必传入参。
可取值：
("ORDER_PAID", "正向支付")，("ORDER_REFUND", "逆向退款")。
其中ORDER_PAID表示回传为正向的，即订单金额累加，优惠累加，任务次数累加；而ORDER_REFUND表示回传为逆向的，即订单金额退款，优惠退款，任务次数回退。
	 */
	@ApiField("biz_action")
	private String bizAction;

	/**
	 * 交易发生时间，包括：订单交易时间，优惠核销时间，以及任务完成时间。为必传入参。
如：用户在【2019-03-08 00:00:00】核销了一个红包，但是【2019-03-10 00:00:00】才进行数据回传，此时biz_time取值红包核销的时间，也就是【2019-03-08 00:00:00】。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 累计类型。为枚举值，为必传入参。
可取值：("AMOUNT", "金额类型")，("TASK", "任务类型")，("AMOUNT_TASK", "额度和任务类型")。
其中，交易解耦模式仅允许AMOUNT或TASK。而交易绑定模式下，仅允许AMOUNT_TASK。
	 */
	@ApiField("cumulate_data_type")
	private String cumulateDataType;

	/**
	 * 扩展字段，格式为Json格式的字符串，非必传。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否为支付宝交易。仅在累计模式为【交易绑定模式】下被消费。当芝麻Go模板配置的累计模式为交易绑定模式时，此时需传入扩展参数是否为支付宝交易。若是支付宝交易，传值true，否则为false。若不传此字段，默认为false。
若为true，则会对交易号trade_no进行校验，校验是否为支付宝交易，以及用户userId和商户partnerId是否一致，若校验不通过，累计失败。
	 */
	@ApiField("has_alipay_trade")
	private Boolean hasAlipayTrade;

	/**
	 * 用户userId，蚂蚁统一会员ID，为必传入参。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号。需保证唯一，为必传入参。
若接口调用失败，提示信息为更换幂等号，商户更换此字段重新发起调用。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户ID，为必传入参。
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 逆向对应的正向外部业务号。逆向场景为必传入参。也就是biz_action为ORDER_REFUND时为必传入参。
逆向时需通过此字段明确对应的正向的外部业务号。
	 */
	@ApiField("pay_out_biz_no")
	private String payOutBizNo;

	/**
	 * 取固定值ExternalMerchantSource，为必传入参。表示数据回传来源为外部商户，数据回传内部逻辑需感知。
	 */
	@ApiField("request_from")
	private String requestFrom;

	/**
	 * 任务类型数据。商户回传的数据为任务类型，包含任务名称。累计类型为TASK时，为必传入参。也就是cumulate_data_type为TASK时为必传参数。
	 */
	@ApiField("task_type_data")
	private TaskTypeData taskTypeData;

	/**
	 * 用户userId，蚂蚁统一会员ID，为必传入参。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public AmountTypeData getAmountTypeData() {
		return this.amountTypeData;
	}
	public void setAmountTypeData(AmountTypeData amountTypeData) {
		this.amountTypeData = amountTypeData;
	}

	public String getBizAction() {
		return this.bizAction;
	}
	public void setBizAction(String bizAction) {
		this.bizAction = bizAction;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getCumulateDataType() {
		return this.cumulateDataType;
	}
	public void setCumulateDataType(String cumulateDataType) {
		this.cumulateDataType = cumulateDataType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Boolean getHasAlipayTrade() {
		return this.hasAlipayTrade;
	}
	public void setHasAlipayTrade(Boolean hasAlipayTrade) {
		this.hasAlipayTrade = hasAlipayTrade;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPayOutBizNo() {
		return this.payOutBizNo;
	}
	public void setPayOutBizNo(String payOutBizNo) {
		this.payOutBizNo = payOutBizNo;
	}

	public String getRequestFrom() {
		return this.requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public TaskTypeData getTaskTypeData() {
		return this.taskTypeData;
	}
	public void setTaskTypeData(TaskTypeData taskTypeData) {
		this.taskTypeData = taskTypeData;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
