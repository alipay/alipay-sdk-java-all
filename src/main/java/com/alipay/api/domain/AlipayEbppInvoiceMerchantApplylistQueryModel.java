package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询开票申请列表
 *
 * @author auto create
 * @since 1.0, 2022-06-22 09:58:47
 */
public class AlipayEbppInvoiceMerchantApplylistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8331417279555792951L;

	/**
	 * 申请状态列表，期望拉取的状态。
申请状态，可选值：
waiting_pull：待拉取 ;
apply_success: 申请成功；
inv_success: 开票成功；
inv_fail：开票失败；
	 */
	@ApiListField("apply_status")
	@ApiField("string")
	private List<String> applyStatus;

	/**
	 * 结束时间
	 */
	@ApiField("biz_end_time")
	private Date bizEndTime;

	/**
	 * 起始时间
	 */
	@ApiField("biz_start_time")
	private Date bizStartTime;

	/**
	 * 品牌名称，全局唯一，接入时约定
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 支付宝商户id
	 */
	@ApiListField("merchant_id")
	@ApiField("string")
	private List<String> merchantId;

	public List<String> getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(List<String> applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getBizEndTime() {
		return this.bizEndTime;
	}
	public void setBizEndTime(Date bizEndTime) {
		this.bizEndTime = bizEndTime;
	}

	public Date getBizStartTime() {
		return this.bizStartTime;
	}
	public void setBizStartTime(Date bizStartTime) {
		this.bizStartTime = bizStartTime;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<String> getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(List<String> merchantId) {
		this.merchantId = merchantId;
	}

}
