package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收平台订单分账关系修改
 *
 * @author auto create
 * @since 1.0, 2025-08-11 22:47:23
 */
public class AlipayCommerceRecycleRoyaltyRelationModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1856229765189468968L;

	/**
	 * 回收商订单ID
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分账信息
	 */
	@ApiListField("royalty_info_list")
	@ApiField("recycle_royalty_info")
	private List<RecycleRoyaltyInfo> royaltyInfoList;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<RecycleRoyaltyInfo> getRoyaltyInfoList() {
		return this.royaltyInfoList;
	}
	public void setRoyaltyInfoList(List<RecycleRoyaltyInfo> royaltyInfoList) {
		this.royaltyInfoList = royaltyInfoList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
