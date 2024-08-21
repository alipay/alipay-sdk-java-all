package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融租_查询预还款计划
 *
 * @author auto create
 * @since 1.0, 2024-06-11 16:52:22
 */
public class MybankCreditSupplychainTradePrerepayplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6236738577975224692L;

	/**
	 * ISV 身份信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道类型
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 接口扩展信息
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * {isv_iprole_id}_${zhifutong_ar_no}
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 融租销售产品code
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

}
