package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 评价状态更新
 *
 * @author auto create
 * @since 1.0, 2020-07-02 17:30:50
 */
public class AlipayOpenAppAraterRatestatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6534556691845988543L;

	/**
	 * 业务扩展字段，传json字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 集团统一会员ID
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 业务来源
	 */
	@ApiField("rate_biz_source")
	private String rateBizSource;

	/**
	 * 评价id
	 */
	@ApiField("rate_id")
	private String rateId;

	/**
	 * * 状态说明:
     * CAN_NOT_RATE 不可评
     * WAIT_FOR_RATE 待评价
     * RATED_CAN_APPEND 已评价可追评
     * RATED_CAN_NOT_APPEND 已评价不可追评
	 */
	@ApiField("rate_status")
	private String rateStatus;

	/**
	 * 支付宝userId倒数2-3位
	 */
	@ApiField("route_uid")
	private String routeUid;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRateBizSource() {
		return this.rateBizSource;
	}
	public void setRateBizSource(String rateBizSource) {
		this.rateBizSource = rateBizSource;
	}

	public String getRateId() {
		return this.rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public String getRateStatus() {
		return this.rateStatus;
	}
	public void setRateStatus(String rateStatus) {
		this.rateStatus = rateStatus;
	}

	public String getRouteUid() {
		return this.routeUid;
	}
	public void setRouteUid(String routeUid) {
		this.routeUid = routeUid;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
