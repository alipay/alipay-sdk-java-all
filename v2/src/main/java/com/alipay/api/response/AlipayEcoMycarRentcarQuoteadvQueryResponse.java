package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentCarQuoteInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.rentcar.quoteadv.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-25 10:47:25
 */
public class AlipayEcoMycarRentcarQuoteadvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1556579899849624892L;

	/** 
	 * 报价优势率信息
	 */
	@ApiListField("quote_infos")
	@ApiField("rent_car_quote_info")
	private List<RentCarQuoteInfo> quoteInfos;

	/** 
	 * 报价总数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setQuoteInfos(List<RentCarQuoteInfo> quoteInfos) {
		this.quoteInfos = quoteInfos;
	}
	public List<RentCarQuoteInfo> getQuoteInfos( ) {
		return this.quoteInfos;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
