package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CropsComplexInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.cropbase.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-03 18:21:32
 */
public class AnttechBlockchainDefinDataserviceCropbaseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3698375345382423362L;

	/** 
	 * 农作物基础信息列表
	 */
	@ApiListField("data_list")
	@ApiField("crops_complex_info")
	private List<CropsComplexInfo> dataList;

	/** 
	 * 页码，默认0
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总量
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<CropsComplexInfo> dataList) {
		this.dataList = dataList;
	}
	public List<CropsComplexInfo> getDataList( ) {
		return this.dataList;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
