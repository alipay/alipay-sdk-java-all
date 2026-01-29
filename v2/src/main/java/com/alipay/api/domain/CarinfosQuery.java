package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆备案查询结果列表
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:08
 */
public class CarinfosQuery extends AlipayObject {

	private static final long serialVersionUID = 7489812956821458837L;

	/**
	 * 设备卡号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 备案时间
	 */
	@ApiField("insert_time")
	private String insertTime;

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

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getInsertTime() {
		return this.insertTime;
	}
	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
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

}
