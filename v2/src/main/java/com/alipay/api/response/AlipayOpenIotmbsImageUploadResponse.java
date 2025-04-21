package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-23 10:51:52
 */
public class AlipayOpenIotmbsImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4352724165779424893L;

	/** 
	 * 图片审核状态
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 图片在文件存储平台的标识
	 */
	@ApiField("image_id")
	private String imageId;

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getImageId( ) {
		return this.imageId;
	}

}
