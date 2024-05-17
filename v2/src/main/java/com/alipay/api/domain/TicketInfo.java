package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2021-01-11 16:12:50
 */
public class TicketInfo extends AlipayObject {

	private static final long serialVersionUID = 6779555746932672336L;

	/**
	 * 店铺地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 截止时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 凭证预约类型，一般不需要传入。可选值为INSTANT/RESERVATION，其中INSTANT代表是实时凭证，RESERVATION代表是预约凭证，不传入默认为实时凭证。区别在于预约凭证一般不是当场可取，而是用户下单后的很多天之后才可以凭借凭证提取
	 */
	@ApiField("resv_type")
	private String resvType;

	/**
	 * 凭证可核销门店/货品自提门店，如果自提门店与购买门店不一致，可传入该字段提示用户自提门店
	 */
	@ApiField("shop")
	private String shop;

	/**
	 * 单据号
不同类型下单据号含义不同。若类型为MEAL_NUM，则ticket_no表示取餐号；若类型为PICKUP_CODE，则ticket_no表示取件码；其他类型查看小程序订单产品文档
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 时间
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 凭证类型
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

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getResvType() {
		return this.resvType;
	}
	public void setResvType(String resvType) {
		this.resvType = resvType;
	}

	public String getShop() {
		return this.shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
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
