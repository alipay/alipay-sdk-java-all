package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作渠道可通过该接口补登单笔圈存确认扣款请求，以帮助支付宝将用户的资金结算给指定的渠道，不支持单笔拆分
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorDepositConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1888474459526531219L;

	/**
	 * 传递确认的终端信息，终端编号等
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 交通卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 交通卡卡类型，一个城市只有一个固定的值
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 核销时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 商户的交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该笔请求的唯一编号，强校验，控制幂等性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizInfoExt() {
		return this.bizInfoExt;
	}
	public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
