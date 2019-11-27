package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 买家订单支付
 *
 * @author auto create
 * @since 1.0, 2017-08-16 11:57:09
 */
public class MybankCreditSupplychainOrderPayModel extends AlipayObject {

	private static final long serialVersionUID = 1452487452766456281L;

	/**
	 * 买家的IpId
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 买家的IpRoleId
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 请求id，用于幂等性保障
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品代码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 买家会员站点
	 */
	@ApiField("site")
	private String site;

	/**
	 * 2088100110011001
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 订单信息
	 */
	@ApiListField("trade_list")
	@ApiField("trade_info")
	private List<TradeInfo> tradeList;

	/**
	 * 交易发起的来源 tmall 1688 类似这样的枚举
	 */
	@ApiField("trade_source")
	private String tradeSource;

	/**
	 * 交易类型
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public List<TradeInfo> getTradeList() {
		return this.tradeList;
	}
	public void setTradeList(List<TradeInfo> tradeList) {
		this.tradeList = tradeList;
	}

	public String getTradeSource() {
		return this.tradeSource;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
