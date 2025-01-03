package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 票务信息
 *
 * @author auto create
 * @since 1.0, 2024-09-20 12:06:07
 */
public class TicketProduct extends AlipayObject {

	private static final long serialVersionUID = 5247442218117393634L;

	/**
	 * 返回的票务分组类型
	 */
	@ApiField("group")
	private Boolean group;

	/**
	 * 按照分组的票务SKU信息
	 */
	@ApiListField("group_ticket_products")
	@ApiField("group_ticket_s_k_u")
	private List<GroupTicketSKU> groupTicketProducts;

	/**
	 * 如果不需要分类的情况下的票种列表
	 */
	@ApiListField("ticket_products")
	@ApiField("ticket_s_k_u")
	private List<TicketSKU> ticketProducts;

	/**
	 * 门票
	 */
	@ApiField("ticket_type")
	private String ticketType;

	public Boolean getGroup() {
		return this.group;
	}
	public void setGroup(Boolean group) {
		this.group = group;
	}

	public List<GroupTicketSKU> getGroupTicketProducts() {
		return this.groupTicketProducts;
	}
	public void setGroupTicketProducts(List<GroupTicketSKU> groupTicketProducts) {
		this.groupTicketProducts = groupTicketProducts;
	}

	public List<TicketSKU> getTicketProducts() {
		return this.ticketProducts;
	}
	public void setTicketProducts(List<TicketSKU> ticketProducts) {
		this.ticketProducts = ticketProducts;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

}
