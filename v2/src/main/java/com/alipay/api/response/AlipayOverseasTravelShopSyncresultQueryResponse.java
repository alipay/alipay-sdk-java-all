package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.shop.syncresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 01:58:51
 */
public class AlipayOverseasTravelShopSyncresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594989741649215688L;

	/** 
	 * 当前店铺业务状态。NORMAL：正常开业中；CLOSED ：已停业
	 */
	@ApiField("shop_biz_status")
	private String shopBizStatus;

	/** 
	 * 店铺信息处理失败的错误码，如转链错误，风控审核错误等
	 */
	@ApiField("sync_failed_code")
	private String syncFailedCode;

	/** 
	 * 店铺信息处理失败时的错误描述
	 */
	@ApiField("sync_failed_msg")
	private String syncFailedMsg;

	/** 
	 * 同步返回的请求处理结果。PROCESSING：处理中；SUCCESS:处理成功；FAILED:处理失败。
轮询查询时基于此结果判断店铺是否同步成功。
	 */
	@ApiField("sync_status")
	private String syncStatus;

	public void setShopBizStatus(String shopBizStatus) {
		this.shopBizStatus = shopBizStatus;
	}
	public String getShopBizStatus( ) {
		return this.shopBizStatus;
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
