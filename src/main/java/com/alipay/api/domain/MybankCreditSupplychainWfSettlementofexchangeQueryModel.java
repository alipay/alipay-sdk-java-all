package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * wf结汇通知（店铺维度）
 *
 * @author auto create
 * @since 1.0, 2022-05-17 10:42:18
 */
public class MybankCreditSupplychainWfSettlementofexchangeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6241131926427455975L;

	/**
	 * WF结汇金额
	 */
	@ApiField("exchangeamount")
	private AmountWf exchangeamount;

	/**
	 * 幂等请求id
	 */
	@ApiField("requestid")
	private String requestid;

	/**
	 * 固定，WF提前收款个人
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 店铺id
	 */
	@ApiField("sellerid")
	private String sellerid;

	/**
	 * 站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点id
	 */
	@ApiField("siteuserid")
	private String siteuserid;

	public AmountWf getExchangeamount() {
		return this.exchangeamount;
	}
	public void setExchangeamount(AmountWf exchangeamount) {
		this.exchangeamount = exchangeamount;
	}

	public String getRequestid() {
		return this.requestid;
	}
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerid() {
		return this.sellerid;
	}
	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteuserid() {
		return this.siteuserid;
	}
	public void setSiteuserid(String siteuserid) {
		this.siteuserid = siteuserid;
	}

}
