package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询门店是否可以作业商机
 *
 * @author auto create
 * @since 1.0, 2025-03-29 23:01:52
 */
public class AlipayCommerceOperationOpportunityPoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6684244985177524121L;

	/**
	 * 业务主体
	 */
	@ApiField("biz_entity_info")
	private BizEntityInfo bizEntityInfo;

	/**
	 * 收银信息
	 */
	@ApiListField("cashier_info")
	@ApiField("bs_cashier_info")
	private List<BsCashierInfo> cashierInfo;

	/**
	 * 证照信息
	 */
	@ApiField("certificate_info")
	private BsCertificateInfo certificateInfo;

	/**
	 * 定义联系人关联信息对象
	 */
	@ApiField("contact_person_info")
	private BsContactPersonInfo contactPersonInfo;

	/**
	 * 门店关联的支付宝类目
	 */
	@ApiField("mcc_info")
	private BsMccInfo mccInfo;

	/**
	 * 外部业务流水号（业务申请编号；业务自定义，保证唯一）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 一笔支付宝交易单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 服务设备提报给支付宝的门店信息
	 */
	@ApiField("shop_info")
	private BsShopInfoDetail shopInfo;

	public BizEntityInfo getBizEntityInfo() {
		return this.bizEntityInfo;
	}
	public void setBizEntityInfo(BizEntityInfo bizEntityInfo) {
		this.bizEntityInfo = bizEntityInfo;
	}

	public List<BsCashierInfo> getCashierInfo() {
		return this.cashierInfo;
	}
	public void setCashierInfo(List<BsCashierInfo> cashierInfo) {
		this.cashierInfo = cashierInfo;
	}

	public BsCertificateInfo getCertificateInfo() {
		return this.certificateInfo;
	}
	public void setCertificateInfo(BsCertificateInfo certificateInfo) {
		this.certificateInfo = certificateInfo;
	}

	public BsContactPersonInfo getContactPersonInfo() {
		return this.contactPersonInfo;
	}
	public void setContactPersonInfo(BsContactPersonInfo contactPersonInfo) {
		this.contactPersonInfo = contactPersonInfo;
	}

	public BsMccInfo getMccInfo() {
		return this.mccInfo;
	}
	public void setMccInfo(BsMccInfo mccInfo) {
		this.mccInfo = mccInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public BsShopInfoDetail getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(BsShopInfoDetail shopInfo) {
		this.shopInfo = shopInfo;
	}

}
