package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcContractInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.contract.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 22:31:58
 */
public class AlipayCommerceEcContractPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5887634716641222714L;

	/** 
	 * 合约信息列表
	 */
	@ApiListField("contract_info_list")
	@ApiField("ec_contract_info")
	private List<EcContractInfo> contractInfoList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setContractInfoList(List<EcContractInfo> contractInfoList) {
		this.contractInfoList = contractInfoList;
	}
	public List<EcContractInfo> getContractInfoList( ) {
		return this.contractInfoList;
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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
