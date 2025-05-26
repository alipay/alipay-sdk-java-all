package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心付状态查询——最新的申请单
 *
 * @author auto create
 * @since 1.0, 2024-08-20 18:01:36
 */
public class MerchantApplyInfo extends AlipayObject {

	private static final long serialVersionUID = 4431311852195819239L;

	/**
	 * 安心付商户入驻申请人
	 */
	@ApiField("applier")
	private String applier;

	/**
	 * 安心付商户入驻申请单
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 申请明细
	 */
	@ApiListField("item_infos")
	@ApiField("merchant_apply_item_info")
	private List<MerchantApplyItemInfo> itemInfos;

	/**
	 * 履约明细
	 */
	@ApiListField("perform_record_infos")
	@ApiField("merchant_apply_perform_record_info")
	private List<MerchantApplyPerformRecordInfo> performRecordInfos;

	/**
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	public String getApplier() {
		return this.applier;
	}
	public void setApplier(String applier) {
		this.applier = applier;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public List<MerchantApplyItemInfo> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<MerchantApplyItemInfo> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public List<MerchantApplyPerformRecordInfo> getPerformRecordInfos() {
		return this.performRecordInfos;
	}
	public void setPerformRecordInfos(List<MerchantApplyPerformRecordInfo> performRecordInfos) {
		this.performRecordInfos = performRecordInfos;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
