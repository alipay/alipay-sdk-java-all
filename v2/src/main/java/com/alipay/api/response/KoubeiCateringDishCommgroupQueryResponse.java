package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationCommGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.commgroup.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:19:41
 */
public class KoubeiCateringDishCommgroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4346152718172357343L;

	/** 
	 * 客制化组分页信息
	 */
	@ApiField("kb_dish_group_page_info")
	private PaginationCommGroup kbDishGroupPageInfo;

	public void setKbDishGroupPageInfo(PaginationCommGroup kbDishGroupPageInfo) {
		this.kbDishGroupPageInfo = kbDishGroupPageInfo;
	}
	public PaginationCommGroup getKbDishGroupPageInfo( ) {
		return this.kbDishGroupPageInfo;
	}

}
