package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销-SRTA活动非匿名人群查询
 *
 * @author auto create
 * @since 1.0, 2022-06-21 15:36:47
 */
public class AnttechMorseMarketingSrtaNonanonymousQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3232931639126179423L;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 手机号 hash后的值；
 uid和mobile_sha_256二选一
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * string	必填	调用商户的请求唯一标识，业务唯一标识，最大长度128
	 */
	@ApiField("req_id")
	private String reqId;

	/**
	 * 用户id，可以使用2088账号，可以使用hash后的匿名用户id是； uid和
mobile_sha256二选一
	 */
	@ApiField("uid")
	private String uid;

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
