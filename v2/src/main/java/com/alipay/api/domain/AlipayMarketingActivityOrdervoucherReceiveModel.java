package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家券批量发券
 *
 * @author auto create
 * @since 1.0, 2026-04-15 00:47:44
 */
public class AlipayMarketingActivityOrdervoucherReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 1259989571487514832L;

	/**
	 * null
	 */
	@ApiListField("receive_info_list")
	@ApiField("order_voucher_receive_info")
	private List<OrderVoucherReceiveInfo> receiveInfoList;

	/**
	 * 发券商户支付宝账号id
	 */
	@ApiField("send_merchant_id")
	private String sendMerchantId;

	/**
	 * 发券商户支付宝账号id
	 */
	@ApiField("send_merchant_open_id")
	private String sendMerchantOpenId;

	/**
	 * 领券用户支付宝id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 领券用户支付宝id
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	public List<OrderVoucherReceiveInfo> getReceiveInfoList() {
		return this.receiveInfoList;
	}
	public void setReceiveInfoList(List<OrderVoucherReceiveInfo> receiveInfoList) {
		this.receiveInfoList = receiveInfoList;
	}

	public String getSendMerchantId() {
		return this.sendMerchantId;
	}
	public void setSendMerchantId(String sendMerchantId) {
		this.sendMerchantId = sendMerchantId;
	}

	public String getSendMerchantOpenId() {
		return this.sendMerchantOpenId;
	}
	public void setSendMerchantOpenId(String sendMerchantOpenId) {
		this.sendMerchantOpenId = sendMerchantOpenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

}
