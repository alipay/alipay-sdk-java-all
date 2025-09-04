package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C藏品秒转接口
 *
 * @author auto create
 * @since 1.0, 2025-07-02 21:07:02
 */
public class AnttechNftCtocRealtimeTransferModel extends AlipayObject {

	private static final long serialVersionUID = 8898933565352375353L;

	/**
	 * 藏品上架时间
	 */
	@ApiField("asset_on_sale_time")
	private Date assetOnSaleTime;

	/**
	 * 流转来源用户ID
	 */
	@ApiField("from_id_no")
	private String fromIdNo;

	/**
	 * 流转来源用户ID类型
	 */
	@ApiField("from_id_type")
	private String fromIdType;

	/**
	 * 流转来源用户合作方内部用户ID
	 */
	@ApiField("from_partner_id_no")
	private String fromPartnerIdNo;

	/**
	 * 流转来源用户合作方内部用户手机号
	 */
	@ApiField("from_partner_phone_no")
	private String fromPartnerPhoneNo;

	/**
	 * 卖家注册3方账号时间
	 */
	@ApiField("from_partner_register_time")
	private Date fromPartnerRegisterTime;

	/**
	 * 资产nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 外部发起唯一业务单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部请求的ip
	 */
	@ApiField("out_client_ip")
	private String outClientIp;

	/**
	 * 支付渠道
	 */
	@ApiField("pay_channel")
	private String payChannel;

	/**
	 * 合作方交易支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/**
	 * 预校验Id
	 */
	@ApiField("pre_check_id")
	private String preCheckId;

	/**
	 * 流转目标用户ID类型
	 */
	@ApiField("to_id_no")
	private String toIdNo;

	/**
	 * 流转目标用户ID类型
	 */
	@ApiField("to_id_type")
	private String toIdType;

	/**
	 * 流转目标用户合作方内部用户ID
	 */
	@ApiField("to_partner_id_no")
	private String toPartnerIdNo;

	/**
	 * 流转目标用户合作方内部用户手机号
	 */
	@ApiField("to_partner_phone_no")
	private String toPartnerPhoneNo;

	/**
	 * 买家注册3方账号时间
	 */
	@ApiField("to_partner_register_time")
	private Date toPartnerRegisterTime;

	/**
	 * 流转金额，单位: 分
	 */
	@ApiField("trade_cent")
	private Long tradeCent;

	/**
	 * 交易订单号（三方支付机构订单号）
	 */
	@ApiField("trade_order_no")
	private String tradeOrderNo;

	/**
	 * 上架确认id
	 */
	@ApiField("verify_confirm_id")
	private String verifyConfirmId;

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

	public String getFromPartnerIdNo() {
		return this.fromPartnerIdNo;
	}
	public void setFromPartnerIdNo(String fromPartnerIdNo) {
		this.fromPartnerIdNo = fromPartnerIdNo;
	}

	public String getFromPartnerPhoneNo() {
		return this.fromPartnerPhoneNo;
	}
	public void setFromPartnerPhoneNo(String fromPartnerPhoneNo) {
		this.fromPartnerPhoneNo = fromPartnerPhoneNo;
	}

	public Date getFromPartnerRegisterTime() {
		return this.fromPartnerRegisterTime;
	}
	public void setFromPartnerRegisterTime(Date fromPartnerRegisterTime) {
		this.fromPartnerRegisterTime = fromPartnerRegisterTime;
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

	public String getOutClientIp() {
		return this.outClientIp;
	}
	public void setOutClientIp(String outClientIp) {
		this.outClientIp = outClientIp;
	}

	public String getPayChannel() {
		return this.payChannel;
	}
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public Date getPayTime() {
		return this.payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public String getPreCheckId() {
		return this.preCheckId;
	}
	public void setPreCheckId(String preCheckId) {
		this.preCheckId = preCheckId;
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

	public String getToPartnerIdNo() {
		return this.toPartnerIdNo;
	}
	public void setToPartnerIdNo(String toPartnerIdNo) {
		this.toPartnerIdNo = toPartnerIdNo;
	}

	public String getToPartnerPhoneNo() {
		return this.toPartnerPhoneNo;
	}
	public void setToPartnerPhoneNo(String toPartnerPhoneNo) {
		this.toPartnerPhoneNo = toPartnerPhoneNo;
	}

	public Date getToPartnerRegisterTime() {
		return this.toPartnerRegisterTime;
	}
	public void setToPartnerRegisterTime(Date toPartnerRegisterTime) {
		this.toPartnerRegisterTime = toPartnerRegisterTime;
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

	public String getVerifyConfirmId() {
		return this.verifyConfirmId;
	}
	public void setVerifyConfirmId(String verifyConfirmId) {
		this.verifyConfirmId = verifyConfirmId;
	}

}
