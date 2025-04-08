package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分组类型的票务SKU信息
 *
 * @author auto create
 * @since 1.0, 2024-09-14 12:12:10
 */
public class GroupTicketSKU extends AlipayObject {

	private static final long serialVersionUID = 2675778853925428619L;

	/**
	 * 分类的名称
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 票种的列表
	 */
	@ApiListField("ticket_products")
	@ApiField("ticket_s_k_u")
	private List<TicketSKU> ticketProducts;

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<TicketSKU> getTicketProducts() {
		return this.ticketProducts;
	}
	public void setTicketProducts(List<TicketSKU> ticketProducts) {
		this.ticketProducts = ticketProducts;
	}

}
