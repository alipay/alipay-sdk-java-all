package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询凭证
 *
 * @author auto create
 * @since 1.0, 2023-06-28 15:19:17
 */
public class AlipayMarketingCertificateCertificationBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3163228717574343474L;

	/**
	 * 三方码列表。取值为支付宝调用三方凭证发放spi时商户返回的三方码 当前字段已废弃(统一平台码与三方码字段，后续使用凭证id)
	 */
	@ApiListField("code_list")
	@ApiField("string")
	@Deprecated
	private List<String> codeList;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购买商品的订单id。通过下单接口获取订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 凭证归属的支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCodeList() {
		return this.codeList;
	}
	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
