package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.cancelstockoutorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-30 23:35:01
 */
public class KoubeiSalesKbassetStuffCancelstockoutorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4177813338932339933L;

	/** 
	 * 待取消的入库单
	 */
	@ApiField("erp_orders")
	private String erpOrders;

	/** 
	 * 报错码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 报错描述
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
	 * 调用结果
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 数据总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setErpOrders(String erpOrders) {
		this.erpOrders = erpOrders;
	}
	public String getErpOrders( ) {
		return this.erpOrders;
	}

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
