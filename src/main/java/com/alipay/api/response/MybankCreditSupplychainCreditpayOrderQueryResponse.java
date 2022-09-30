package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-15 16:59:09
 */
public class MybankCreditSupplychainCreditpayOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7585924774634789565L;

	/** 
	 * 每页的条目数量
	 */
	@ApiField("items_per_page")
	private Long itemsPerPage;

	/** 
	 * 是否存在下一页数据
	 */
	@ApiField("next_page")
	private Boolean nextPage;

	/** 
	 * 订单列表
	 */
	@ApiListField("order_vo_list")
	@ApiField("order_v_o")
	private List<OrderVO> orderVoList;

	/** 
	 * 当前页
	 */
	@ApiListField("page")
	@ApiField("number")
	private List<Long> page;

	public void setItemsPerPage(Long itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}
	public Long getItemsPerPage( ) {
		return this.itemsPerPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}
	public Boolean getNextPage( ) {
		return this.nextPage;
	}

	public void setOrderVoList(List<OrderVO> orderVoList) {
		this.orderVoList = orderVoList;
	}
	public List<OrderVO> getOrderVoList( ) {
		return this.orderVoList;
	}

	public void setPage(List<Long> page) {
		this.page = page;
	}
	public List<Long> getPage( ) {
		return this.page;
	}

}
