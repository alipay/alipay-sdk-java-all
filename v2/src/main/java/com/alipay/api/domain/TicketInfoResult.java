package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2022-12-29 14:05:39
 */
public class TicketInfoResult extends AlipayObject {

	private static final long serialVersionUID = 1471823251692256841L;

	/**
	 * 地址
不同类型下的地址含义不同。若type为MEAL_NUM，address则代表取餐地点；若type为PICKUP_CODE，address则代表取件地点。其他类型查看小程序订单产品文档
	 */
	@ApiField("address")
	private String address;

	/**
	 * 单据号
不同类型下单据号含义不同。若类型为MEAL_NUM，则ticket_no表示取餐号；若类型为PICKUP_CODE，则ticket_no表示取件码；其他类型查看小程序订单产品文档
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 时间
不同类型下的地址含义不同。若type为MEAL_NUM，time则代表取餐时间；若type为PICKUP_CODE，address则代表取件时间。其他类型查看小程序订单产品文档
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 凭证类型
MEAL_NUM：取餐号
PICKUP_CODE：取件号
具体类型查看产品文档
	 */
	@ApiField("type")
	private String type;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
