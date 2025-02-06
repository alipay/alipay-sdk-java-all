package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: techrisk.innovate.mpcpromo.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-05 15:56:56
 */
public class TechriskInnovateMpcpromoItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3863792931843955133L;

	/** 
	 * 商品推荐查询结果
	 */
	@ApiListField("item_list")
	@ApiField("item_query_info")
	private List<ItemQueryInfo> itemList;

	/** 
	 * 推荐请求的标识id，用于关联推荐结果和用户行为
	 */
	@ApiField("recommend_id")
	private String recommendId;

	public void setItemList(List<ItemQueryInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ItemQueryInfo> getItemList( ) {
		return this.itemList;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

}
