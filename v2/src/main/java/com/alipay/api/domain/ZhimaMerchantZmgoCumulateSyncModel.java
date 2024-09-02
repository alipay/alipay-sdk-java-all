package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家芝麻GO数据回传接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 10:36:59
 */
public class ZhimaMerchantZmgoCumulateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7744794956893644882L;

	/**
	 * 芝麻go协议号，唯一标识一个芝麻go协议。
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 任务金额型数据，当模版配置为付费模式或金额任务模式时传入
	 */
	@ApiField("amount_type_sync_data")
	private AmountTypeSyncData amountTypeSyncData;

	/**
	 * 数据回传的动作类型。枚举如下：
* POSITIVE：正向回传，即订单金额累加，优惠累加，任务次数累加。
* REVERSE：逆向回传，即订单金额退款，优惠退款，任务次数回退。
	 */
	@ApiField("biz_action")
	private String bizAction;

	/**
	 * 回传数据发生的实际时间，包括：订单交易时间，优惠核销时间，以及任务完成时间。为必传入参。 如：用户在【2019-03-08 00:00:00】核销了一个红包，但是【2019-03-10 00:00:00】才进行数据回传，此时biz_time取值红包核销的时间，也就是【2019-03-08 00:00:00】。
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 回传数据类型，枚举：
TASK - 进度型，影响进度
DISCOUNT - 优惠型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 优惠数据，仅回传优惠数据时传入
	 */
	@ApiField("discount_type_sync_data")
	private DiscountTypeSyncData discountTypeSyncData;

	/**
	 * 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，唯一标识一笔回传数据。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 数据回传的商户 ID，即和用户发生业务来往的 PID 主体。商户账号在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。
	 */
	@ApiField("provider_pid")
	private String providerPid;

	/**
	 * 逆向对应的正向外部业务号。逆向场景为必传入参。也就是biz_action为REVERSE时为必传入参。 逆向时需通过此字段明确对应的正向的外部业务号。
	 */
	@ApiField("refer_out_biz_no")
	private String referOutBizNo;

	/**
	 * 数据回传动作子类型，枚举值，为必传入参。
ADD - 新增数据
UPDATE - 修改数据
备注：UPDATE只能更新金额信息。
	 */
	@ApiField("sub_biz_action")
	private String subBizAction;

	/**
	 * 任务次数型数据，当选择次数任务时传入
	 */
	@ApiField("times_type_sync_data")
	private TimesTypeSyncData timesTypeSyncData;

	/**
	 * 用户 id，用户在支付宝的唯一标识，以 2088 开头的 16 位纯数字组成。

	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public AmountTypeSyncData getAmountTypeSyncData() {
		return this.amountTypeSyncData;
	}
	public void setAmountTypeSyncData(AmountTypeSyncData amountTypeSyncData) {
		this.amountTypeSyncData = amountTypeSyncData;
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

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public DiscountTypeSyncData getDiscountTypeSyncData() {
		return this.discountTypeSyncData;
	}
	public void setDiscountTypeSyncData(DiscountTypeSyncData discountTypeSyncData) {
		this.discountTypeSyncData = discountTypeSyncData;
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

	public String getProviderPid() {
		return this.providerPid;
	}
	public void setProviderPid(String providerPid) {
		this.providerPid = providerPid;
	}

	public String getReferOutBizNo() {
		return this.referOutBizNo;
	}
	public void setReferOutBizNo(String referOutBizNo) {
		this.referOutBizNo = referOutBizNo;
	}

	public String getSubBizAction() {
		return this.subBizAction;
	}
	public void setSubBizAction(String subBizAction) {
		this.subBizAction = subBizAction;
	}

	public TimesTypeSyncData getTimesTypeSyncData() {
		return this.timesTypeSyncData;
	}
	public void setTimesTypeSyncData(TimesTypeSyncData timesTypeSyncData) {
		this.timesTypeSyncData = timesTypeSyncData;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
