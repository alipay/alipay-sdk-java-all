package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndirectPromoTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 16:46:46
 */
public class AlipayMerchantIndirectPromotaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6612348216836292613L;

	/** 
	 * 任务列表，存储符合查询条件的任务对象
	 */
	@ApiListField("item_list")
	@ApiField("indirect_promo_task")
	private List<IndirectPromoTask> itemList;

	/** 
	 * 符合查询条件的数据总条数
	 */
	@ApiField("total")
	private Long total;

	public void setItemList(List<IndirectPromoTask> itemList) {
		this.itemList = itemList;
	}
	public List<IndirectPromoTask> getItemList( ) {
		return this.itemList;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
