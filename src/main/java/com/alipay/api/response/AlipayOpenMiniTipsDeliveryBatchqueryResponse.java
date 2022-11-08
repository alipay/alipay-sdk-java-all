package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TipsDelivery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.tips.delivery.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-25 21:31:41
 */
public class AlipayOpenMiniTipsDeliveryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8388211649416778428L;

	/** 
	 * 收藏引导活动信息列表。根据活动状态排序，顺序为：生效中，暂停，审核中，白名单生效中，初始化，审核失败，结束。相同状态优先展示状态更新时间最迟的活动。
	 */
	@ApiListField("tips_delivery_list")
	@ApiField("tips_delivery")
	private List<TipsDelivery> tipsDeliveryList;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 收藏引导数据总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setTipsDeliveryList(List<TipsDelivery> tipsDeliveryList) {
		this.tipsDeliveryList = tipsDeliveryList;
	}
	public List<TipsDelivery> getTipsDeliveryList( ) {
		return this.tipsDeliveryList;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
