package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除内容
 *
 * @author auto create
 * @since 1.0, 2025-04-23 22:13:35
 */
public class AlipayCommerceMedicalSupplierContentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8348631826411861138L;

	/**
	 * 医疗内容ID，调用发布内容返回的ID
	 */
	@ApiField("med_content_id")
	private String medContentId;

	/**
	 * 归属者的ID，当类型为生活号ID时，传支付宝生活号ID，当类型为作者ID时，传好大夫医生ID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 归属者的类型：PUBLISH_ID|AUTHOR_ID
	 */
	@ApiField("owner_type")
	private String ownerType;

	public String getMedContentId() {
		return this.medContentId;
	}
	public void setMedContentId(String medContentId) {
		this.medContentId = medContentId;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerType() {
		return this.ownerType;
	}
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

}
