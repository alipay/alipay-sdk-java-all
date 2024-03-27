package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动券信息
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:25:26
 */
public class ActivityVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 7788921288444858229L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动状态： 草稿(INIT),已提交审核(P_AUDIT),已审核(AUDIT),待激活(WAIT_ACTIVE),激活(ACTIVE),暂停(PAUSE),已结束(FINISHED),已废弃(DISCARD)
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 商户logo
	 */
	@ApiField("merchant_logo")
	private String merchantLogo;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 券列表
	 */
	@ApiListField("voucher_list")
	@ApiField("voucher_item")
	private List<VoucherItem> voucherList;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getMerchantLogo() {
		return this.merchantLogo;
	}
	public void setMerchantLogo(String merchantLogo) {
		this.merchantLogo = merchantLogo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public List<VoucherItem> getVoucherList() {
		return this.voucherList;
	}
	public void setVoucherList(List<VoucherItem> voucherList) {
		this.voucherList = voucherList;
	}

}
