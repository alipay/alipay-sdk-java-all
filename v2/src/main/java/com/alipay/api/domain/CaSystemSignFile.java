package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签署文件
 *
 * @author auto create
 * @since 1.0, 2026-03-09 15:00:38
 */
public class CaSystemSignFile extends AlipayObject {

	private static final long serialVersionUID = 8221527224897667264L;

	/**
	 * 签署区域信息（包括印模信息）
	 */
	@ApiListField("ca_system_sign_area_list")
	@ApiField("ca_system_sign_area")
	private List<CaSystemSignArea> caSystemSignAreaList;

	/**
	 * 单次请求文件唯一id，与AntSignFileRequest中的fileId对应
	 */
	@ApiField("file_id")
	private String fileId;

	public List<CaSystemSignArea> getCaSystemSignAreaList() {
		return this.caSystemSignAreaList;
	}
	public void setCaSystemSignAreaList(List<CaSystemSignArea> caSystemSignAreaList) {
		this.caSystemSignAreaList = caSystemSignAreaList;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
