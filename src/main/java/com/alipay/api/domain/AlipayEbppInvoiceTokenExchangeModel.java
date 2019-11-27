package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标准开票页开票参数换取token接口
 *
 * @author auto create
 * @since 1.0, 2019-07-29 10:57:51
 */
public class AlipayEbppInvoiceTokenExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 7853492782776686595L;

	/**
	 * 开票金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/**
	 * 品牌简称
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 门店简称
	 */
	@ApiField("sub_short_name")
	private String subShortName;

	/**
	 * 子订单信息
	 */
	@ApiListField("sub_trade_info")
	@ApiField("sub_invoice_trade_model")
	private List<SubInvoiceTradeModel> subTradeInfo;

	/**
	 * 交易订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户唯一标识
	 */
	@ApiField("user_id")
	private String userId;

	public String getInvoiceAmount() {
		return this.invoiceAmount;
	}
	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getSubShortName() {
		return this.subShortName;
	}
	public void setSubShortName(String subShortName) {
		this.subShortName = subShortName;
	}

	public List<SubInvoiceTradeModel> getSubTradeInfo() {
		return this.subTradeInfo;
	}
	public void setSubTradeInfo(List<SubInvoiceTradeModel> subTradeInfo) {
		this.subTradeInfo = subTradeInfo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
