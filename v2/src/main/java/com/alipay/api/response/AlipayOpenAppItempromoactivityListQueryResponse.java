package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoActivityItemPageVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.itempromoactivity.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 21:50:59
 */
public class AlipayOpenAppItempromoactivityListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2352363951395638272L;

	/** 
	 * 商品基础信息
	 */
	@ApiListField("data")
	@ApiField("promo_activity_item_page_v_o")
	private List<PromoActivityItemPageVO> data;

	/** 
	 * 当前页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	/** 
	 * 营销活动名称
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 总数量
	 */
	@ApiField("total_number")
	private Long totalNumber;

	public void setData(List<PromoActivityItemPageVO> data) {
		this.data = data;
	}
	public List<PromoActivityItemPageVO> getData( ) {
		return this.data;
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

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getPromotionType( ) {
		return this.promotionType;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}
	public Long getTotalNumber( ) {
		return this.totalNumber;
	}

}
