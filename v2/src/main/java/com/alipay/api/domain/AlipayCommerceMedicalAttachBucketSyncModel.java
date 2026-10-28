package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 域外附件OSS同步到域内
 *
 * @author auto create
 * @since 1.0, 2026-10-14 13:57:53
 */
public class AlipayCommerceMedicalAttachBucketSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4638691357611835416L;

	/**
	 * null
	 */
	@ApiListField("hdf_attachments")
	@ApiField("hdf_attachment")
	private List<HdfAttachment> hdfAttachments;

	public List<HdfAttachment> getHdfAttachments() {
		return this.hdfAttachments;
	}
	public void setHdfAttachments(List<HdfAttachment> hdfAttachments) {
		this.hdfAttachments = hdfAttachments;
	}

}
