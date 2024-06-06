package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 餐饮pos业务订单支付
 *
 * @author auto create
 * @since 1.0, 2022-07-01 16:23:56
 */
public class KoubeiCateringOrderPayDisburseModel extends AlipayObject {

	private static final long serialVersionUID = 7371726356428287725L;

	/**
	 * 支付授权码，25~30开头的长度为16~24位的数字，实际字符串长度以开发者获取的付款码长度为准
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 是否享受会员价。如果为true，菜明细里面会按照会员价（没有改价情况下）作为单品价格咨询单品券优惠
	 */
	@ApiField("member_flag")
	private Boolean memberFlag;

	/**
	 * 外部支付订单号，唯一标识本次支付的requestID
	 */
	@ApiField("out_pay_no")
	private String outPayNo;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 交易超时时间  选填，默认3分钟.透传给交易，设置可支持如下格式：d:天，h:小时,m:分钟。 示例：5d,1h,3m
	 */
	@ApiField("timeout")
	private String timeout;

	/**
	 * 订单付款金额，以元为单位，精确到分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 是否整单不可打折
	 */
	@ApiField("undiscountable")
	private Boolean undiscountable;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public Boolean getMemberFlag() {
		return this.memberFlag;
	}
	public void setMemberFlag(Boolean memberFlag) {
		this.memberFlag = memberFlag;
	}

	public String getOutPayNo() {
		return this.outPayNo;
	}
	public void setOutPayNo(String outPayNo) {
		this.outPayNo = outPayNo;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

	public String getTimeout() {
		return this.timeout;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Boolean getUndiscountable() {
		return this.undiscountable;
	}
	public void setUndiscountable(Boolean undiscountable) {
		this.undiscountable = undiscountable;
	}

}
