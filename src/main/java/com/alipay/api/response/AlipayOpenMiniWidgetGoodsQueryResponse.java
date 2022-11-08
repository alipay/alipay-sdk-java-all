package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.widget.goods.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 19:36:37
 */
public class AlipayOpenMiniWidgetGoodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7463681221424654445L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("data_list")
	@ApiField("goods_query_response")
	private List<GoodsQueryResponse> dataList;

	/** 
	 * 查询第几页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 查询页面数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询结果总数
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<GoodsQueryResponse> dataList) {
		this.dataList = dataList;
	}
	public List<GoodsQueryResponse> getDataList( ) {
		return this.dataList;
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
