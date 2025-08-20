package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.aosshop.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-25 11:17:05
 */
public class AlipayOpenMiniCloudAosshopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1493434819653766525L;

	/** 
	 * 结果总量
	 */
	@ApiField("item_total_count")
	private Long itemTotalCount;

	/** 
	 * 搜索的item结果列表
	 */
	@ApiListField("result")
	@ApiField("shop_item")
	private List<ShopItem> result;

	/** 
	 * 埋点上报序列
	 */
	@ApiField("sequence")
	private String sequence;

	public void setItemTotalCount(Long itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}
	public Long getItemTotalCount( ) {
		return this.itemTotalCount;
	}

	public void setResult(List<ShopItem> result) {
		this.result = result;
	}
	public List<ShopItem> getResult( ) {
		return this.result;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getSequence( ) {
		return this.sequence;
	}

}
