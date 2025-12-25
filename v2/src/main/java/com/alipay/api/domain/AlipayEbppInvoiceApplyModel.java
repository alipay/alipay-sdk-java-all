package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请开具发票
 *
 * @author auto create
 * @since 1.0, 2022-11-23 10:06:50
 */
public class AlipayEbppInvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2554639863947139614L;

	/**
	 * 执行动作：申请开票/申请红冲
可选取值：
BLUE:申请开票;RED:申请红冲
	 */
	@ApiField("action")
	private String action;

	/**
	 * 申请发起方，描述开票申请的发起角色，
可选取值：
PAYEE:销售方;PAYER:购买方
	 */
	@ApiField("apply_from")
	private String applyFrom;

	/**
	 * 发票申请内容
	 */
	@ApiField("invoice_apply_model")
	private InvoiceApplyOpenModel invoiceApplyModel;

	/**
	 * 定义商户的一级简称,用于标识商户品牌，对应于商户入驻时填写的"商户品牌简称"。
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 定义商户的二级简称,用于标识商户品牌下的分支机构，如门店，对应于商户入驻时填写的"商户门店简称"。
如：肯德基-杭州西湖区文一西路店：KFC-HZ-19003
要求："商户品牌简称+商户门店简称"作为确定商户及其下属机构的唯一标识，不可重复。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	/**
	 * 支付宝用户id，支付宝用户的唯一标识。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getApplyFrom() {
		return this.applyFrom;
	}
	public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
	}

	public InvoiceApplyOpenModel getInvoiceApplyModel() {
		return this.invoiceApplyModel;
	}
	public void setInvoiceApplyModel(InvoiceApplyOpenModel invoiceApplyModel) {
		this.invoiceApplyModel = invoiceApplyModel;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
