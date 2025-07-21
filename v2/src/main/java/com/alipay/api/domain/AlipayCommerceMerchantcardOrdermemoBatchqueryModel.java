package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单备注记录查询
 *
 * @author auto create
 * @since 1.0, 2025-06-09 14:17:40
 */
public class AlipayCommerceMerchantcardOrdermemoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1513269186152755927L;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
