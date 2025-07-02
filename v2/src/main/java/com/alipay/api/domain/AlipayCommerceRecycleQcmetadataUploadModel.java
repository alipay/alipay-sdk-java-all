package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 质检元数据上传
 *
 * @author auto create
 * @since 1.0, 2025-06-20 16:07:53
 */
public class AlipayCommerceRecycleQcmetadataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 3162459429265953893L;

	/**
	 * 支付宝文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 元数据
	 */
	@ApiListField("metadata_list")
	@ApiField("recycle_qc_metadata")
	private List<RecycleQcMetadata> metadataList;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public List<RecycleQcMetadata> getMetadataList() {
		return this.metadataList;
	}
	public void setMetadataList(List<RecycleQcMetadata> metadataList) {
		this.metadataList = metadataList;
	}

}
