package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C藏品流转申请接口
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:41:21
 */
public class AnttechNftCtocTransferApplyModel extends AlipayObject {

	private static final long serialVersionUID = 4828771646252992736L;

	/**
	 * 藏品上架时间
	 */
	@ApiField("asset_on_sale_time")
	private Date assetOnSaleTime;

	/**
	 * 鲸探授权用户id(已转加密)
	 */
	@ApiField("from_id_no")
	private String fromIdNo;

	/**
	 * 发起账号类型，
鲸探授权用户id(已转加密):OPEN_UID
	 */
	@ApiField("from_id_type")
	private String fromIdType;

	/**
	 * 发起用户注册时间
	 */
	@ApiField("from_user_register_time")
	private Date fromUserRegisterTime;

	/**
	 * 资产nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 调用方交易单号，业务系统用于做幂等校验
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 鲸探授权用户id(已转加密)
	 */
	@ApiField("to_id_no")
	private String toIdNo;

	/**
	 * 接收方id类型
鲸探授权用户id(已转加密):OPEN_UID
	 */
	@ApiField("to_id_type")
	private String toIdType;

	/**
	 * 接收方注册时间
	 */
	@ApiField("to_user_register_time")
	private Date toUserRegisterTime;

	/**
	 * 交易金额，单位: 分
	 */
	@ApiField("trade_cent")
	private Long tradeCent;

	/**
	 * 交易单号，支付单号
	 */
	@ApiField("trade_order_no")
	private String tradeOrderNo;

	/**
	 * 流转操作类型
	 */
	@ApiField("transfer_operate")
	private String transferOperate;

	/**
	 * 流转类型
	 */
	@ApiField("transfer_type")
	private String transferType;

	public Date getAssetOnSaleTime() {
		return this.assetOnSaleTime;
	}
	public void setAssetOnSaleTime(Date assetOnSaleTime) {
		this.assetOnSaleTime = assetOnSaleTime;
	}

	public String getFromIdNo() {
		return this.fromIdNo;
	}
	public void setFromIdNo(String fromIdNo) {
		this.fromIdNo = fromIdNo;
	}

	public String getFromIdType() {
		return this.fromIdType;
	}
	public void setFromIdType(String fromIdType) {
		this.fromIdType = fromIdType;
	}

	public Date getFromUserRegisterTime() {
		return this.fromUserRegisterTime;
	}
	public void setFromUserRegisterTime(Date fromUserRegisterTime) {
		this.fromUserRegisterTime = fromUserRegisterTime;
	}

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getToIdNo() {
		return this.toIdNo;
	}
	public void setToIdNo(String toIdNo) {
		this.toIdNo = toIdNo;
	}

	public String getToIdType() {
		return this.toIdType;
	}
	public void setToIdType(String toIdType) {
		this.toIdType = toIdType;
	}

	public Date getToUserRegisterTime() {
		return this.toUserRegisterTime;
	}
	public void setToUserRegisterTime(Date toUserRegisterTime) {
		this.toUserRegisterTime = toUserRegisterTime;
	}

	public Long getTradeCent() {
		return this.tradeCent;
	}
	public void setTradeCent(Long tradeCent) {
		this.tradeCent = tradeCent;
	}

	public String getTradeOrderNo() {
		return this.tradeOrderNo;
	}
	public void setTradeOrderNo(String tradeOrderNo) {
		this.tradeOrderNo = tradeOrderNo;
	}

	public String getTransferOperate() {
		return this.transferOperate;
	}
	public void setTransferOperate(String transferOperate) {
		this.transferOperate = transferOperate;
	}

	public String getTransferType() {
		return this.transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

}
