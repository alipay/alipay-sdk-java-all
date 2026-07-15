package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:22:57
 */
public class FulfillmentReportInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7521789482472988158L;

	/**
	 * 文件流OSS上传接口返回的fileId
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * null
	 */
	@ApiListField("item_infos")
	@ApiField("fulfillment_item_info_d_t_o")
	private List<FulfillmentItemInfoDTO> itemInfos;

	/**
	 * 多预约人场景使用
	 */
	@ApiField("patient_id")
	private String patientId;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public List<FulfillmentItemInfoDTO> getItemInfos() {
		return this.itemInfos;
	}
	public void setItemInfos(List<FulfillmentItemInfoDTO> itemInfos) {
		this.itemInfos = itemInfos;
	}

	public String getPatientId() {
		return this.patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

}
