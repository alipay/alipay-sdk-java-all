package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsReturnOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.querygoodsreturnorde.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-25 18:05:01
 */
public class KoubeiSalesKbassetStuffQuerygoodsreturnordeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5899745974293923635L;

	/** 
	 * 异常码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 异常描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 退货单
	 */
	@ApiListField("goods_return_orders")
	@ApiField("goods_return_order")
	private List<GoodsReturnOrder> goodsReturnOrders;

	/** 
	 * 分页查询当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页查询每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 本次调用是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 查询数据总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getErrorDesc( ) {
		return this.errorDesc;
	}

	public void setGoodsReturnOrders(List<GoodsReturnOrder> goodsReturnOrders) {
		this.goodsReturnOrders = goodsReturnOrders;
	}
	public List<GoodsReturnOrder> getGoodsReturnOrders( ) {
		return this.goodsReturnOrders;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
