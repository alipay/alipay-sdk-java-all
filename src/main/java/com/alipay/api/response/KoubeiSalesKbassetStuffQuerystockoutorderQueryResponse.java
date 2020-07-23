package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StuffStockOutOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.querystockoutorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-25 21:10:01
 */
public class KoubeiSalesKbassetStuffQuerystockoutorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3357813974591639361L;

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
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 出库单
	 */
	@ApiListField("stock_out_orders")
	@ApiField("stuff_stock_out_order")
	private List<StuffStockOutOrder> stockOutOrders;

	/** 
	 * 调用结果
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 数据总数
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

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
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

	public void setStockOutOrders(List<StuffStockOutOrder> stockOutOrders) {
		this.stockOutOrders = stockOutOrders;
	}
	public List<StuffStockOutOrder> getStockOutOrders( ) {
		return this.stockOutOrders;
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
