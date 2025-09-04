package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.brand.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 11:42:37
 */
public class AlipayOpenAppItemBrandQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8364468398225456429L;

	/** 
	 * null
	 */
	@ApiListField("brand_info_list")
	@ApiField("brand_info_v_o")
	private List<BrandInfoVO> brandInfoList;

	/** 
	 * 分页查询的页码。默认从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询的每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询返回总数
	 */
	@ApiField("total")
	private Long total;

	public void setBrandInfoList(List<BrandInfoVO> brandInfoList) {
		this.brandInfoList = brandInfoList;
	}
	public List<BrandInfoVO> getBrandInfoList( ) {
		return this.brandInfoList;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
