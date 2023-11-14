package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询商品营销活动信息
 *
 * @author auto create
 * @since 1.0, 2023-09-12 19:07:12
 */
public class AlipayOpenAppItempromoactivityListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2342936257776617595L;

	/**
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页最多显示多少
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 营销活动类型
	 */
	@ApiField("promotion_type")
	private String promotionType;

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPromotionType() {
		return this.promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

}
