package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户入驻信息
 *
 * @author auto create
 * @since 1.0, 2024-11-06 14:50:18
 */
public class MerchantSettleInInfo extends AlipayObject {

	private static final long serialVersionUID = 8388435217493721915L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 间连周期卡开通状态
	 */
	@ApiField("indirect_period_card_status")
	private String indirectPeriodCardStatus;

	/**
	 * 最新的申请单
	 */
	@ApiListField("last_apply_orders")
	@ApiField("merchant_apply_info")
	private List<MerchantApplyInfo> lastApplyOrders;

	/**
	 * 经营类目
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 周期卡开通状态
	 */
	@ApiField("period_card_status")
	private String periodCardStatus;

	/**
	 * 开通状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 先享次卡开通状态
	 */
	@ApiField("xian_xiang_times_card_status")
	private String xianXiangTimesCardStatus;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIndirectPeriodCardStatus() {
		return this.indirectPeriodCardStatus;
	}
	public void setIndirectPeriodCardStatus(String indirectPeriodCardStatus) {
		this.indirectPeriodCardStatus = indirectPeriodCardStatus;
	}

	public List<MerchantApplyInfo> getLastApplyOrders() {
		return this.lastApplyOrders;
	}
	public void setLastApplyOrders(List<MerchantApplyInfo> lastApplyOrders) {
		this.lastApplyOrders = lastApplyOrders;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPeriodCardStatus() {
		return this.periodCardStatus;
	}
	public void setPeriodCardStatus(String periodCardStatus) {
		this.periodCardStatus = periodCardStatus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getXianXiangTimesCardStatus() {
		return this.xianXiangTimesCardStatus;
	}
	public void setXianXiangTimesCardStatus(String xianXiangTimesCardStatus) {
		this.xianXiangTimesCardStatus = xianXiangTimesCardStatus;
	}

}
