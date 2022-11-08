package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票商家扩展信息
 *
 * @author auto create
 * @since 1.0, 2022-10-11 17:38:53
 */
public class ReceiptMerchantExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 2834274517373776175L;

	/**
	 * 收银机ID
	 */
	@ApiField("cash_register_id")
	private String cashRegisterId;

	/**
	 * 收银员ID
	 */
	@ApiField("cashier_id")
	private String cashierId;

	/**
	 * 收银员名
	 */
	@ApiField("cashier_name")
	private String cashierName;

	/**
	 * 字体颜色，传入色号
	 */
	@ApiField("font_colour")
	private String fontColour;

	/**
	 * 服务热线，电话号码
	 */
	@ApiField("hot_line")
	private String hotLine;

	/**
	 * 商户标语文案，限制在20字以内
	 */
	@ApiField("slogan")
	private String slogan;

	/**
	 * 小票流水号
	 */
	@ApiField("ticket_record_no")
	private String ticketRecordNo;

	/**
	 * 温馨提示, 限制在40字以内
	 */
	@ApiField("tips")
	private String tips;

	public String getCashRegisterId() {
		return this.cashRegisterId;
	}
	public void setCashRegisterId(String cashRegisterId) {
		this.cashRegisterId = cashRegisterId;
	}

	public String getCashierId() {
		return this.cashierId;
	}
	public void setCashierId(String cashierId) {
		this.cashierId = cashierId;
	}

	public String getCashierName() {
		return this.cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getFontColour() {
		return this.fontColour;
	}
	public void setFontColour(String fontColour) {
		this.fontColour = fontColour;
	}

	public String getHotLine() {
		return this.hotLine;
	}
	public void setHotLine(String hotLine) {
		this.hotLine = hotLine;
	}

	public String getSlogan() {
		return this.slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getTicketRecordNo() {
		return this.ticketRecordNo;
	}
	public void setTicketRecordNo(String ticketRecordNo) {
		this.ticketRecordNo = ticketRecordNo;
	}

	public String getTips() {
		return this.tips;
	}
	public void setTips(String tips) {
		this.tips = tips;
	}

}
