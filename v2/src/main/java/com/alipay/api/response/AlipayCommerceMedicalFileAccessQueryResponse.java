package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.file.access.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-15 11:02:01
 */
public class AlipayCommerceMedicalFileAccessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7782474497981517161L;

	/** 
	 * 文件临时可访问地址列表
	 */
	@ApiListField("file_url_list")
	@ApiField("string")
	private List<String> fileUrlList;

	public void setFileUrlList(List<String> fileUrlList) {
		this.fileUrlList = fileUrlList;
	}
	public List<String> getFileUrlList( ) {
		return this.fileUrlList;
	}

}
