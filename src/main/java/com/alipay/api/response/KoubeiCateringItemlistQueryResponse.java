package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CaterItemListInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.itemlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-19 20:20:56
 */
public class KoubeiCateringItemlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4687835194577599285L;

	/** 
	 * 商品摘要信息列表
	 */
	@ApiListField("item_list")
	@ApiField("cater_item_list_info")
	private List<CaterItemListInfo> itemList;

	/** 
	 * 请求id。支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 当前可查询商品总条目数
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	public void setItemList(List<CaterItemListInfo> itemList) {
		this.itemList = itemList;
	}
	public List<CaterItemListInfo> getItemList( ) {
		return this.itemList;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount( ) {
		return this.totalAmount;
	}

}
