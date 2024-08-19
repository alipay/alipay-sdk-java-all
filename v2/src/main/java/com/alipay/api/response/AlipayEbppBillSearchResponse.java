package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryInstBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.search response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayEbppBillSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 8684576596357576262L;

	/** 
	 * 已经缓存的的key
	 */
	@ApiField("cachekey")
	private String cachekey;

	/** 
	 * 实时查询欠费单返回对象
	 */
	@ApiListField("inst_bill_info_list")
	@ApiField("query_inst_bill_info")
	private List<QueryInstBillInfo> instBillInfoList;

	public void setCachekey(String cachekey) {
		this.cachekey = cachekey;
	}
	public String getCachekey( ) {
		return this.cachekey;
	}

	public void setInstBillInfoList(List<QueryInstBillInfo> instBillInfoList) {
		this.instBillInfoList = instBillInfoList;
	}
	public List<QueryInstBillInfo> getInstBillInfoList( ) {
		return this.instBillInfoList;
	}

}
