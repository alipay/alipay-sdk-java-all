package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcLMItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-10 18:07:04
 */
public class AlipayCloudCloudpromoMallItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7189826921752185655L;

	/** 
	 * 商品详情列表
	 */
	@ApiListField("item_list")
	@ApiField("mpc_l_m_item_v_o")
	private List<MpcLMItemVO> itemList;

	/** 
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 圈选商品总数
	 */
	@ApiField("total")
	private Long total;

	public void setItemList(List<MpcLMItemVO> itemList) {
		this.itemList = itemList;
	}
	public List<MpcLMItemVO> getItemList( ) {
		return this.itemList;
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
