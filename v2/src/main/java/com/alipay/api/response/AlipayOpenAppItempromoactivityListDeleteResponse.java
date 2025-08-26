package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ItemPromoActivityFailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.itempromoactivity.list.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 11:02:42
 */
public class AlipayOpenAppItempromoactivityListDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 4567816538493476155L;

	/** 
	 * 失败商品列表
	 */
	@ApiField("failed_item_list")
	private ItemPromoActivityFailVO failedItemList;

	/** 
	 * 成功的数量
	 */
	@ApiField("success_num")
	private Long successNum;

	/** 
	 * 提交的所有数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setFailedItemList(ItemPromoActivityFailVO failedItemList) {
		this.failedItemList = failedItemList;
	}
	public ItemPromoActivityFailVO getFailedItemList( ) {
		return this.failedItemList;
	}

	public void setSuccessNum(Long successNum) {
		this.successNum = successNum;
	}
	public Long getSuccessNum( ) {
		return this.successNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
