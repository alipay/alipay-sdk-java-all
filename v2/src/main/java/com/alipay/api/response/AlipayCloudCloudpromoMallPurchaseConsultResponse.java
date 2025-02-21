package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpcAddressInfo;
import com.alipay.api.domain.SingleOrderVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.purchase.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 10:49:45
 */
public class AlipayCloudCloudpromoMallPurchaseConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4419734281424978978L;

	/** 
	 * 地址列表
	 */
	@ApiField("address_list")
	private MpcAddressInfo addressList;

	/** 
	 * 是否可售
	 */
	@ApiField("can_sell")
	private Boolean canSell;

	/** 
	 * 备注
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 可售列表
	 */
	@ApiListField("order_list")
	@ApiField("single_order_v_o")
	private List<SingleOrderVO> orderList;

	/** 
	 * 不可售列表
	 */
	@ApiField("unsellable_order_list")
	private SingleOrderVO unsellableOrderList;

	public void setAddressList(MpcAddressInfo addressList) {
		this.addressList = addressList;
	}
	public MpcAddressInfo getAddressList( ) {
		return this.addressList;
	}

	public void setCanSell(Boolean canSell) {
		this.canSell = canSell;
	}
	public Boolean getCanSell( ) {
		return this.canSell;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setOrderList(List<SingleOrderVO> orderList) {
		this.orderList = orderList;
	}
	public List<SingleOrderVO> getOrderList( ) {
		return this.orderList;
	}

	public void setUnsellableOrderList(SingleOrderVO unsellableOrderList) {
		this.unsellableOrderList = unsellableOrderList;
	}
	public SingleOrderVO getUnsellableOrderList( ) {
		return this.unsellableOrderList;
	}

}
