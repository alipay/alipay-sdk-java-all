package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcConsumeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.consume.detail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-07 17:31:34
 */
public class AlipayCommerceEcConsumeDetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7865389493815735283L;

	/** 
	 * 账单信息列表
	 */
	@ApiListField("consume_info_list")
	@ApiField("ec_consume_info")
	private List<EcConsumeInfo> consumeInfoList;

	/** 
	 * 当期页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 当期页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	public void setConsumeInfoList(List<EcConsumeInfo> consumeInfoList) {
		this.consumeInfoList = consumeInfoList;
	}
	public List<EcConsumeInfo> getConsumeInfoList( ) {
		return this.consumeInfoList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

}
