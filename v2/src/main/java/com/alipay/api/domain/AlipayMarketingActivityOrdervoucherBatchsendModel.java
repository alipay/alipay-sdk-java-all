package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量发放商家兑换券
 *
 * @author auto create
 * @since 1.0, 2023-11-01 14:32:55
 */
public class AlipayMarketingActivityOrdervoucherBatchsendModel extends AlipayObject {

	private static final long serialVersionUID = 5254947473279981343L;

	/**
	 * 在用户购买完成商家兑换券之后，通过此接口发放 用户购买订单之后需要发放的商家兑换券
	 */
	@ApiListField("activity_send_voucher_info_list")
	@ApiField("activity_send_voucher_info")
	private List<ActivitySendVoucherInfo> activitySendVoucherInfoList;

	/**
	 * 发放时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 投放埋点信息。由支付宝公私域跳转到服务商小程序时带入。例如alipays://platformapi/startapp?appId=2021002140648450&query=promoTraceInfo%3DUFJPTU9fU0NFTkVfSUQ9OkNCMTExOTk3MDBAO0BQT1NJVElPTl9DT0RFPTptb3JwaG9fYzQxYWY2，其中promoTraceInfo由支付宝带入投放埋点信息，需要在调用批量发券接口时传入
	 */
	@ApiField("promo_trace_info")
	private String promoTraceInfo;

	/**
	 * 商家券售卖交易渠道，用于安全审核。 如 支付宝交易渠道:ZHIFUBAO_TRADE_CHANNEL
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	/**
	 * 该交易在支付宝/其他交易系统中的交易流水号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 买家的支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public List<ActivitySendVoucherInfo> getActivitySendVoucherInfoList() {
		return this.activitySendVoucherInfoList;
	}
	public void setActivitySendVoucherInfoList(List<ActivitySendVoucherInfo> activitySendVoucherInfoList) {
		this.activitySendVoucherInfoList = activitySendVoucherInfoList;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPromoTraceInfo() {
		return this.promoTraceInfo;
	}
	public void setPromoTraceInfo(String promoTraceInfo) {
		this.promoTraceInfo = promoTraceInfo;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
