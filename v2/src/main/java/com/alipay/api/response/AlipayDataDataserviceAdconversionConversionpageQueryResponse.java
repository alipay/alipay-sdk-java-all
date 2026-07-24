package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AdConversion;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adconversion.conversionpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-23 17:18:53
 */
public class AlipayDataDataserviceAdconversionConversionpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6129479391538188941L;

	/** 
	 * 当前页数
	 */
	@ApiField("current")
	private Long current;

	/** 
	 * 转化信息
	 */
	@ApiField("list")
	private AdConversion list;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 返回总数
	 */
	@ApiField("total")
	private Long total;

	public void setCurrent(Long current) {
		this.current = current;
	}
	public Long getCurrent( ) {
		return this.current;
	}

	public void setList(AdConversion list) {
		this.list = list;
	}
	public AdConversion getList( ) {
		return this.list;
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
