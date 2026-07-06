package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceApplyExpressInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.orderlogistics.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-03 15:32:57
 */
public class AlipayCommerceIotDapplyOrderlogisticsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5433452516628367675L;

	/** 
	 * 供应链订单号内部称AO单
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	/** 
	 * 发货数量机具数量，单位：台
	 */
	@ApiField("deliver_count")
	private Long deliverCount;

	/** 
	 * 快递包裹信息，如果是多个包裹发货会有多个包裹信息
	 */
	@ApiListField("express_list")
	@ApiField("device_apply_express_info")
	private List<DeviceApplyExpressInfo> expressList;

	/** 
	 * 商户下单时传入的收货人手机号脱敏返回
	 */
	@ApiField("receiver_mobile")
	private String receiverMobile;

	/** 
	 * 下单时传入的收货人姓名脱敏返回
	 */
	@ApiField("receiver_name")
	private String receiverName;

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

	public void setDeliverCount(Long deliverCount) {
		this.deliverCount = deliverCount;
	}
	public Long getDeliverCount( ) {
		return this.deliverCount;
	}

	public void setExpressList(List<DeviceApplyExpressInfo> expressList) {
		this.expressList = expressList;
	}
	public List<DeviceApplyExpressInfo> getExpressList( ) {
		return this.expressList;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	public String getReceiverMobile( ) {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverName( ) {
		return this.receiverName;
	}

}
