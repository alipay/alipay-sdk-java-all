package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署文件列表（包含印模和签署区域）
 *
 * @author auto create
 * @since 1.0, 2023-05-15 09:39:05
 */
public class CaSystemSignFileRequest extends AlipayObject {

	private static final long serialVersionUID = 8811711572556646444L;

	/**
	 * 签署区域信息（包括印模信息）
	 */
	@ApiListField("ca_system_sign_area_request_list")
	@ApiField("ca_system_sign_area_request")
	private List<CaSystemSignAreaRequest> caSystemSignAreaRequestList;

	/**
	 * 和签署文件列表fileId呼应，必传字段
	 */
	@ApiField("file_id")
	private String fileId;

	public List<CaSystemSignAreaRequest> getCaSystemSignAreaRequestList() {
		return this.caSystemSignAreaRequestList;
	}
	public void setCaSystemSignAreaRequestList(List<CaSystemSignAreaRequest> caSystemSignAreaRequestList) {
		this.caSystemSignAreaRequestList = caSystemSignAreaRequestList;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
