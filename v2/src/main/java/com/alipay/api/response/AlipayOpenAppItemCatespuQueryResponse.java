package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SpuInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.item.catespu.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 11:28:11
 */
public class AlipayOpenAppItemCatespuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6682815148424879621L;

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
	 * null
	 */
	@ApiListField("spu_infos")
	@ApiField("spu_info_v_o")
	private List<SpuInfoVO> spuInfos;

	/** 
	 * 查询返回总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setSpuInfos(List<SpuInfoVO> spuInfos) {
		this.spuInfos = spuInfos;
	}
	public List<SpuInfoVO> getSpuInfos( ) {
		return this.spuInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
