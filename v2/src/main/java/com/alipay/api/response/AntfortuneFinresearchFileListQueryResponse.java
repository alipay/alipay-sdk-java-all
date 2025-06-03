package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZXZFileDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.file.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:37:02
 */
public class AntfortuneFinresearchFileListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7599145295324183561L;

	/** 
	 * 文件详情
	 */
	@ApiListField("file_list")
	@ApiField("z_x_z_file_detail")
	private List<ZXZFileDetail> fileList;

	public void setFileList(List<ZXZFileDetail> fileList) {
		this.fileList = fileList;
	}
	public List<ZXZFileDetail> getFileList( ) {
		return this.fileList;
	}

}
