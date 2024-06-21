package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.goods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:28
 */
public class AlipayOverseasTravelGoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4662135122437249118L;

	/** 
	 * 商品状态，NORMAL表示如正在售卖，CLOSED表示下架；当syncStatus为SUCCESS时该值一定存在，其他状态不一定存在。
	 */
	@ApiField("goods_biz_status")
	private String goodsBizStatus;

	/** 
	 * 同步单据id
	 */
	@ApiField("sync_order_id")
	private String syncOrderId;

	/** 
	 * 商品数据同步请求处理状态：
SUCCESS表示成功；
FAILED表示商品信息处理失败，如商品信息审核失败；PROCESSING表示商品信息处理中。
对于同一个商品信息更新时，当返回状态为PROCESSING时需要等到最终处理成功再发起同步请求进行更新操作。
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setGoodsBizStatus(String goodsBizStatus) {
		this.goodsBizStatus = goodsBizStatus;
	}
	public String getGoodsBizStatus( ) {
		return this.goodsBizStatus;
	}

	public void setSyncOrderId(String syncOrderId) {
		this.syncOrderId = syncOrderId;
	}
	public String getSyncOrderId( ) {
		return this.syncOrderId;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getSyncStatus( ) {
		return this.syncStatus;
	}

}
