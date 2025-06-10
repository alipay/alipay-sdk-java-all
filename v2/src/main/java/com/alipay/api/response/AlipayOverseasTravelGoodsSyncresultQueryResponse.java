package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.goods.syncresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-17 17:48:14
 */
public class AlipayOverseasTravelGoodsSyncresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2323516494368996141L;

	/** 
	 * 商品状态，NORMAL表示如正在售卖，CLOSED表示下架；当syncStatus为SUCCESS时该值一定存在，其他状态不一定存在。
	 */
	@ApiField("goods_biz_status")
	private String goodsBizStatus;

	/** 
	 * 商品信息处理失败的错误码，如转链错误，风控审核错误等
	 */
	@ApiField("sync_failed_code")
	private String syncFailedCode;

	/** 
	 * 商品信息处理失败时的错误描述
	 */
	@ApiField("sync_failed_msg")
	private String syncFailedMsg;

	/** 
	 * 商品数据同步请求处理状态： SUCCESS表示成功； FAILED表示商品信息处理失败，如商品信息审核失败；PROCESSING表示商品信息处理中。
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setGoodsBizStatus(String goodsBizStatus) {
		this.goodsBizStatus = goodsBizStatus;
	}
	public String getGoodsBizStatus( ) {
		return this.goodsBizStatus;
	}

	public void setSyncFailedCode(String syncFailedCode) {
		this.syncFailedCode = syncFailedCode;
	}
	public String getSyncFailedCode( ) {
		return this.syncFailedCode;
	}

	public void setSyncFailedMsg(String syncFailedMsg) {
		this.syncFailedMsg = syncFailedMsg;
	}
	public String getSyncFailedMsg( ) {
		return this.syncFailedMsg;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public String getSyncStatus( ) {
		return this.syncStatus;
	}

}
