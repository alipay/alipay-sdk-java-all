package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费外部交易结果模型
 *
 * @author auto create
 * @since 1.0, 2023-11-09 16:17:18
 */
public class PucExternalOrderDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4591497142165277314L;

	/**
	 * 缴费收费账号, 由收费单位定义
	 */
	@ApiField("billkey")
	private String billkey;

	/**
	 * 缴费业务类型, 默认JF
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 缴费收费单位短名, 由缴费系统生成唯一标识
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/**
	 * 业务受理单号用于唯一标识每一笔交易请求, 和交易订单号1:1对应
	 */
	@ApiField("external_biz_id")
	private String externalBizId;

	/**
	 * 商户侧订单的唯一标识, 商户侧保持唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 缴费子业务类型, 关联费种
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 支付宝交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBillkey() {
		return this.billkey;
	}
	public void setBillkey(String billkey) {
		this.billkey = billkey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChargeInst() {
		return this.chargeInst;
	}
	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}

	public String getExternalBizId() {
		return this.externalBizId;
	}
	public void setExternalBizId(String externalBizId) {
		this.externalBizId = externalBizId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
