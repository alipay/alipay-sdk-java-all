package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 摩卡营销-SRTA活动匿名人群查询
 *
 * @author auto create
 * @since 1.0, 2022-04-26 09:37:19
 */
public class AnttechMorseMarketingSrtaNanonymousQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1146495397456148234L;

	/**
	 * 多个手机号hash后的值，以为逗号分隔
	 */
	@ApiField("anonymous_mobile_sha_256_list")
	private String anonymousMobileSha256List;

	/**
	 * 目标用户一次加密密文信息
	 */
	@ApiField("blind_mobile_sha_256")
	private String blindMobileSha256;

	/**
	 * 扩展字段
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 订单金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * string 必填 调用商户的请求唯一标识，业务唯一标识，最大长度128
	 */
	@ApiField("req_id")
	private String reqId;

	public String getAnonymousMobileSha256List() {
		return this.anonymousMobileSha256List;
	}
	public void setAnonymousMobileSha256List(String anonymousMobileSha256List) {
		this.anonymousMobileSha256List = anonymousMobileSha256List;
	}

	public String getBlindMobileSha256() {
		return this.blindMobileSha256;
	}
	public void setBlindMobileSha256(String blindMobileSha256) {
		this.blindMobileSha256 = blindMobileSha256;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
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

}
