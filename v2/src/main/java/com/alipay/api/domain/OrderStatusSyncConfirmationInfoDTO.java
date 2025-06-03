package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒旅项目-服务商履约状态同步接口-确认信息
 *
 * @author auto create
 * @since 1.0, 2025-03-26 10:34:24
 */
public class OrderStatusSyncConfirmationInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2613763756119839194L;

	/**
	 * 当推送确认状态时，可传酒店确认号
	 */
	@ApiField("confirm_num")
	private String confirmNum;

	/**
	 * 已确认:CONFIRMED
确认失败：CONFIRMED_FAIL
	 */
	@ApiField("confirm_result")
	private String confirmResult;

	/**
	 * INFO_ERROR：预订信息错误（入住日期、个人信息等）
PRODUCT_DISAVAILBILE:产品下架不可用
FULLY_BOOKED:满房
PRICE_CHANGED:变价
OTHER：其他
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 确认失败或酒店服务商发起取消原因
	 */
	@ApiField("fail_reason")
	private String failReason;

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

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public Boolean getInstantConfirm() {
		return this.instantConfirm;
	}
	public void setInstantConfirm(Boolean instantConfirm) {
		this.instantConfirm = instantConfirm;
	}

}
