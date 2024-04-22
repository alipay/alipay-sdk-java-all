package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.sales.kbasset.stuff.cancelstockinorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:55:45
 */
public class KoubeiSalesKbassetStuffCancelstockinorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262276959923749996L;

	/** 
	 * 待取消的入库单号
	 */
	@ApiListField("erp_orders")
	@ApiField("string")
	private List<String> erpOrders;

	/** 
	 * 异常码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 报错描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/** 
	 * 扩展字段，保留
	 */
	@ApiField("ext_info")
	private String extInfo;

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
	 * 调用结果
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 查询数据总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setErpOrders(List<String> erpOrders) {
		this.erpOrders = erpOrders;
	}
	public List<String> getErpOrders( ) {
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
