package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户宠物档案转移
 *
 * @author auto create
 * @since 1.0, 2024-09-03 15:51:19
 */
public class AlipayCommercePetMerchantarchiveTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2883634773528634647L;

	/**
	 * 支付宝宠物档案Id，与external_pet_id二选一
	 */
	@ApiField("archive_id")
	private String archiveId;

	/**
	 * 商户宠物Id
	 */
	@ApiField("external_pet_id")
	private String externalPetId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务请求流水，用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getArchiveId() {
		return this.archiveId;
	}
	public void setArchiveId(String archiveId) {
		this.archiveId = archiveId;
	}

	public String getExternalPetId() {
		return this.externalPetId;
	}
	public void setExternalPetId(String externalPetId) {
		this.externalPetId = externalPetId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
