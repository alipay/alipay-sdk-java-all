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
 * @since 1.0, 2023-05-29 20:46:50
 */
public class TechriskInnovateMpcpromoItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1797939652971251881L;

	/** 
	 * 商品推荐查询结果
	 */
	@ApiListField("item_list")
	@ApiField("item_query_info")
	private List<ItemQueryInfo> itemList;

	public void setItemList(List<ItemQueryInfo> itemList) {
		this.itemList = itemList;
	}
	public List<ItemQueryInfo> getItemList( ) {
		return this.itemList;
	}

}
