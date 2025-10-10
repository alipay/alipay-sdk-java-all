package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ETC行程卡交易上传
 *
 * @author auto create
 * @since 1.0, 2025-03-14 16:52:20
 */
public class AlipayCommerceTransportEtccardTradeSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7745238679885262511L;

	/**
	 * ETC卡编号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 入口收费站id（GID编码）
	 */
	@ApiField("en_station_id")
	private String enStationId;

	/**
	 * 入口收费站名称
	 */
	@ApiField("en_station_name")
	private String enStationName;

	/**
	 * 入口时间
	 */
	@ApiField("en_time")
	private Date enTime;

	/**
	 * 出口收费站id（GID编码）
	 */
	@ApiField("ex_station_id")
	private String exStationId;

	/**
	 * 出口收费站名称
	 */
	@ApiField("ex_station_name")
	private String exStationName;

	/**
	 * 交易时间
	 */
	@ApiField("ex_time")
	private Date exTime;

	/**
	 * 交易金额,单位元
	 */
	@ApiField("fee")
	private String fee;

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
	 * 通行省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/**
	 * 通行省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/**
	 * 通行记录唯一标识
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getEnStationId() {
		return this.enStationId;
	}
	public void setEnStationId(String enStationId) {
		this.enStationId = enStationId;
	}

	public String getEnStationName() {
		return this.enStationName;
	}
	public void setEnStationName(String enStationName) {
		this.enStationName = enStationName;
	}

	public Date getEnTime() {
		return this.enTime;
	}
	public void setEnTime(Date enTime) {
		this.enTime = enTime;
	}

	public String getExStationId() {
		return this.exStationId;
	}
	public void setExStationId(String exStationId) {
		this.exStationId = exStationId;
	}

	public String getExStationName() {
		return this.exStationName;
	}
	public void setExStationName(String exStationName) {
		this.exStationName = exStationName;
	}

	public Date getExTime() {
		return this.exTime;
	}
	public void setExTime(Date exTime) {
		this.exTime = exTime;
	}

	public String getFee() {
		return this.fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
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

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
