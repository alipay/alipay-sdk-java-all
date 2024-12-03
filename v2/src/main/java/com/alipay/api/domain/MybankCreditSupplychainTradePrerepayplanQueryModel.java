package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 融租_查询预还款计划
 *
 * @author auto create
 * @since 1.0, 2024-09-10 14:37:18
 */
public class MybankCreditSupplychainTradePrerepayplanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2768667429135864862L;

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
	 * true: 返回订单应还，实还数据
false: 不返回实还数据
	 */
	@ApiField("has_bill_detail")
	private Boolean hasBillDetail;

	/**
	 * 交易创建时的外部订单号，拼接而成
{isv_iprole_id}_${zhifutong_ar_no}
isv_iprole_id：机构ipRoleId
zhifutong_ar_no：直付通签约订单号
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

	public Boolean getHasBillDetail() {
		return this.hasBillDetail;
	}
	public void setHasBillDetail(Boolean hasBillDetail) {
		this.hasBillDetail = hasBillDetail;
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
