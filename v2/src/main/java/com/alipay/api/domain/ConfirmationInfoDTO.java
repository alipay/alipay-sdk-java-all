package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-订单状态信息查询-确认信息
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:21
 */
public class ConfirmationInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7135975561829719986L;

	/**
	 * 酒店确认号
	 */
	@ApiField("confirm_num")
	private String confirmNum;

	/**
	 * 已确认:CONFIRMED
确认失败：CONFIRMED_FAIL
确认中：CONFIRING
	 */
	@ApiField("confirm_result")
	private String confirmResult;

	/**
	 * 订单确认时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("confirm_time")
	private String confirmTime;

	/**
	 * 售卖房型是否为“立即确认”房型：True-是；False-否；
	 */
	@ApiField("instant_confirm")
	private Boolean instantConfirm;

	public String getConfirmNum() {
		return this.confirmNum;
	}
	public void setConfirmNum(String confirmNum) {
		this.confirmNum = confirmNum;
	}

	public String getConfirmResult() {
		return this.confirmResult;
	}
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}

	public String getConfirmTime() {
		return this.confirmTime;
	}
	public void setConfirmTime(String confirmTime) {
		this.confirmTime = confirmTime;
	}

	public Boolean getInstantConfirm() {
		return this.instantConfirm;
	}
	public void setInstantConfirm(Boolean instantConfirm) {
		this.instantConfirm = instantConfirm;
	}

}
