package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易收款方案查询
 *
 * @author auto create
 * @since 1.0, 2018-07-05 15:53:47
 */
public class MybankCreditSupplychainTradeRecvschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2634185831516131418L;

	/**
	 * 支用申请金额，单位元，只支持全额提前收款，会强校验与订单金额是否一致。
	 */
	@ApiField("apply_amt")
	private String applyAmt;

	/**
	 * 支用申请时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("apply_date")
	private String applyDate;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，CNBILL：菜鸟电票，CHENGYISHE：诚e赊
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 卖家身份信息
	 */
	@ApiField("seller")
	private Member seller;

	public String getApplyAmt() {
		return this.applyAmt;
	}
	public void setApplyAmt(String applyAmt) {
		this.applyAmt = applyAmt;
	}

	public String getApplyDate() {
		return this.applyDate;
	}
	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

}
