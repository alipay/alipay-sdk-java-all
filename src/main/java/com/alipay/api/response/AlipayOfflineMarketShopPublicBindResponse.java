package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.public.bind response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-29 19:57:30
 */
public class AlipayOfflineMarketShopPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 5318357454184471919L;

	/** 
	 * 绑定失败的店铺ID列表
	 */
	@ApiListField("error_binding_shop_ids")
	@ApiField("string")
	private List<String> errorBindingShopIds;

	/** 
	 * 数字类型，标示总的绑定错误总数
	 */
	@ApiField("total_error")
	private Long totalError;

	/** 
	 * 绑定店铺总成功数
	 */
	@ApiField("total_success")
	private Long totalSuccess;

	public void setErrorBindingShopIds(List<String> errorBindingShopIds) {
		this.errorBindingShopIds = errorBindingShopIds;
	}
	public List<String> getErrorBindingShopIds( ) {
		return this.errorBindingShopIds;
	}

	public void setTotalError(Long totalError) {
		this.totalError = totalError;
	}
	public Long getTotalError( ) {
		return this.totalError;
	}

	public void setTotalSuccess(Long totalSuccess) {
		this.totalSuccess = totalSuccess;
	}
	public Long getTotalSuccess( ) {
		return this.totalSuccess;
	}

}
