package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetEcoIotOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.iot.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-13 10:22:40
 */
public class AntMerchantExpandEcoIotQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6578335519682736423L;

	/** 
	 * 生态供应商音箱订单信息
	 */
	@ApiListField("eco_iot_orders")
	@ApiField("asset_eco_iot_order_info")
	private List<AssetEcoIotOrderInfo> ecoIotOrders;

	/** 
	 * 是否还有下一页 true:是;false:否
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 生态供应商音箱订单数据总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setEcoIotOrders(List<AssetEcoIotOrderInfo> ecoIotOrders) {
		this.ecoIotOrders = ecoIotOrders;
	}
	public List<AssetEcoIotOrderInfo> getEcoIotOrders( ) {
		return this.ecoIotOrders;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
