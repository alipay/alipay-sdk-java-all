package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 未备案成功车辆列表
 *
 * @author auto create
 * @since 1.0, 2025-12-19 14:03:06
 */
public class FailCarInfos extends AlipayObject {

	private static final long serialVersionUID = 6421159269962169753L;

	/**
	 * 设备卡号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 备案失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

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

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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
