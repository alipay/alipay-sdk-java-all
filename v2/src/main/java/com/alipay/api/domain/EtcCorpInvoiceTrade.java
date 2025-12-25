package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业开票场景下,可以开发票的运单
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:09
 */
public class EtcCorpInvoiceTrade extends AlipayObject {

	private static final long serialVersionUID = 6537871192861924523L;

	/**
	 * 虚拟运单编码
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请单状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 行云卡号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 运单结束地址
	 */
	@ApiField("end_address")
	private String endAddress;

	/**
	 * 运单结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 高速费用,单位分
	 */
	@ApiField("highway_fee")
	private Long highwayFee;

	/**
	 * 开票状态
	 */
	@ApiField("invoice_status")
	private String invoiceStatus;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 运单开始地址
	 */
	@ApiField("start_address")
	private String startAddress;

	/**
	 * 运单开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 交易信息列表
	 */
	@ApiListField("trade_list")
	@ApiField("etc_inovice_trade_list")
	private List<EtcInoviceTradeList> tradeList;

	/**
	 * 运单费用,单位分
	 */
	@ApiField("waybill_fee")
	private Long waybillFee;

	/**
	 * 外部企业运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getEndAddress() {
		return this.endAddress;
	}
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getHighwayFee() {
		return this.highwayFee;
	}
	public void setHighwayFee(Long highwayFee) {
		this.highwayFee = highwayFee;
	}

	public String getInvoiceStatus() {
		return this.invoiceStatus;
	}
	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getStartAddress() {
		return this.startAddress;
	}
	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<EtcInoviceTradeList> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<EtcInoviceTradeList> tradeList) {
		this.tradeList = tradeList;
	}

	public Long getWaybillFee() {
		return this.waybillFee;
	}
	public void setWaybillFee(Long waybillFee) {
		this.waybillFee = waybillFee;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
