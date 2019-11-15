package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分场景
 *
 * @author auto create
 * @since 1.0, 2018-05-23 20:58:14
 */
public class MemberPointsScene extends AlipayObject {

	private static final long serialVersionUID = 1116934354951214142L;

	/**
	 * 用户兑换的内容。
type：VOUCHER(券)
type为券时，ids返回的是券ID。
	 */
	@ApiField("exchange_info")
	private PointsExchangeInfo exchangeInfo;

	/**
	 * 口碑订单号
	 */
	@ApiField("kb_trade_no")
	private String kbTradeNo;

	/**
	 * 综合体ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 变化时间：格式"YYYY-MM-DD HH:mm:ss"，24小时制
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 积分变化类型
ADD：增加
DECR：减少
REVERSAL：冲正
	 */
	@ApiField("oper_type")
	private String operType;

	/**
	 * 外部交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 积分余额
	 */
	@ApiField("points_balance")
	private Long pointsBalance;

	public PointsExchangeInfo getExchangeInfo() {
		return this.exchangeInfo;
	}
	public void setExchangeInfo(PointsExchangeInfo exchangeInfo) {
		this.exchangeInfo = exchangeInfo;
	}

	public String getKbTradeNo() {
		return this.kbTradeNo;
	}
	public void setKbTradeNo(String kbTradeNo) {
		this.kbTradeNo = kbTradeNo;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getOperType() {
		return this.operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPointsBalance() {
		return this.pointsBalance;
	}
	public void setPointsBalance(Long pointsBalance) {
		this.pointsBalance = pointsBalance;
	}

}
