package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemPromoActivityFailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.itempromoactivity.list.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-05 11:03:16
 */
public class AlipayOpenAppItempromoactivityListCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4484467879973138284L;

	/** 
	 * 失败的商品
	 */
	@ApiListField("failed_item_list")
	@ApiField("item_promo_activity_fail_v_o")
	private List<ItemPromoActivityFailVO> failedItemList;

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

	public void setFailedItemList(List<ItemPromoActivityFailVO> failedItemList) {
		this.failedItemList = failedItemList;
	}
	public List<ItemPromoActivityFailVO> getFailedItemList( ) {
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
