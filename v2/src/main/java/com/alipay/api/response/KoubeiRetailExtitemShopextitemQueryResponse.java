package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtitemDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.extitem.shopextitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:46:10
 */
public class KoubeiRetailExtitemShopextitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6889185888939999467L;

	/** 
	 * 标品详情列表
	 */
	@ApiListField("extitem_detail_list")
	@ApiField("extitem_detail_info")
	private List<ExtitemDetailInfo> extitemDetailList;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setExtitemDetailList(List<ExtitemDetailInfo> extitemDetailList) {
		this.extitemDetailList = extitemDetailList;
	}
	public List<ExtitemDetailInfo> getExtitemDetailList( ) {
		return this.extitemDetailList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
