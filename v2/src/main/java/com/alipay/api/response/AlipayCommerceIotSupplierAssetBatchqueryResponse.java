package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupplierAssetResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class AlipayCommerceIotSupplierAssetBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6658859964867953847L;

	/** 
	 * 当前页码
	 */
	@ApiField("cur_page_num")
	private String curPageNum;

	/** 
	 * 查询分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 供应商设备信息列表
	 */
	@ApiListField("result_list")
	@ApiField("supplier_asset_response")
	private List<SupplierAssetResponse> resultList;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setCurPageNum(String curPageNum) {
		this.curPageNum = curPageNum;
	}
	public String getCurPageNum( ) {
		return this.curPageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setResultList(List<SupplierAssetResponse> resultList) {
		this.resultList = resultList;
	}
	public List<SupplierAssetResponse> getResultList( ) {
		return this.resultList;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
