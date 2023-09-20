package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSpuVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:41:42
 */
public class AlipayOpenAppItemListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2714915854782241481L;

	/** 
	 * 商品spu列表
	 */
	@ApiListField("items")
	@ApiField("item_spu_v_o")
	private List<ItemSpuVO> items;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 符合条件的商品SPU总数
	 */
	@ApiField("total")
	private Long total;

	public void setItems(List<ItemSpuVO> items) {
		this.items = items;
	}
	public List<ItemSpuVO> getItems( ) {
		return this.items;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
