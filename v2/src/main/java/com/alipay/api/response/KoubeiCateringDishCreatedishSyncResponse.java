package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.createdish.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:36:30
 */
public class KoubeiCateringDishCreatedishSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1154635553222752426L;

	/** 
	 * 口碑菜品id
	 */
	@ApiField("dish_id")
	private String dishId;

	/** 
	 * 反查失败的菜品信息
	 */
	@ApiListField("fail_group_detail_list")
	@ApiField("kbdish_detail_info")
	private List<KbdishDetailInfo> failGroupDetailList;

	/** 
	 * 是否需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/** 
	 * 口碑菜品库skuId列表
	 */
	@ApiListField("sku_id_list")
	@ApiField("string")
	private List<String> skuIdList;

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	public String getDishId( ) {
		return this.dishId;
	}

	public void setFailGroupDetailList(List<KbdishDetailInfo> failGroupDetailList) {
		this.failGroupDetailList = failGroupDetailList;
	}
	public List<KbdishDetailInfo> getFailGroupDetailList( ) {
		return this.failGroupDetailList;
	}

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

	public void setSkuIdList(List<String> skuIdList) {
		this.skuIdList = skuIdList;
	}
	public List<String> getSkuIdList( ) {
		return this.skuIdList;
	}

}
