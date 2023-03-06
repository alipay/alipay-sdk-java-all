package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商户修改商品代金券
 *
 * @author auto create
 * @since 1.0, 2022-09-19 15:11:18
 */
public class KoubeiMarketingCampaignItemMerchantactivityModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8121414944913981898L;

	/**
	 * 活动Id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部回调地址
	 */
	@ApiField("external_callback_url")
	private String externalCallbackUrl;

	/**
	 * 活动结束日期，只可以延长
格式要求为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 活动商品列表，只可以增加
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 券信息，可修改logo/userIntroductions ，validTimeRangeTo只可延长，validDaysRangeTo只可延长
	 */
	@ApiField("voucher_info")
	private MerchantActivityModifyVoucherInfo voucherInfo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getExternalCallbackUrl() {
		return this.externalCallbackUrl;
	}
	public void setExternalCallbackUrl(String externalCallbackUrl) {
		this.externalCallbackUrl = externalCallbackUrl;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public List<String> getItemIds() {
		return this.itemIds;
	}
	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public MerchantActivityModifyVoucherInfo getVoucherInfo() {
		return this.voucherInfo;
	}
	public void setVoucherInfo(MerchantActivityModifyVoucherInfo voucherInfo) {
		this.voucherInfo = voucherInfo;
	}

}
