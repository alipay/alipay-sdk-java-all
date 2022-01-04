package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProductInviteStatusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.invite.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-28 10:33:17
 */
public class AlipayOpenInviteOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6622976253141598348L;

	/** 
	 * 商家支付宝账号对应的ID，2088开头
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 产品签约状态对象
	 */
	@ApiListField("sign_status_list")
	@ApiField("product_invite_status_info")
	private List<ProductInviteStatusInfo> signStatusList;

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setSignStatusList(List<ProductInviteStatusInfo> signStatusList) {
		this.signStatusList = signStatusList;
	}
	public List<ProductInviteStatusInfo> getSignStatusList( ) {
		return this.signStatusList;
	}

}
