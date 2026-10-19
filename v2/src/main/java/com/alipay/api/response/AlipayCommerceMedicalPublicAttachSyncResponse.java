package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.public.attach.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-14 15:37:57
 */
public class AlipayCommerceMedicalPublicAttachSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7664843589264936887L;

	/** 
	 * null
	 */
	@ApiListField("file_path_list")
	@ApiField("string")
	private List<String> filePathList;

	public void setFilePathList(List<String> filePathList) {
		this.filePathList = filePathList;
	}
	public List<String> getFilePathList( ) {
		return this.filePathList;
	}

}
