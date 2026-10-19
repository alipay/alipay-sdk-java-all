package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 好大夫公开桶附件同步
 *
 * @author auto create
 * @since 1.0, 2026-10-14 15:37:57
 */
public class AlipayCommerceMedicalPublicAttachSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4655742314895527432L;

	/**
	 * null
	 */
	@ApiListField("file_path_list")
	@ApiField("string")
	private List<String> filePathList;

	public List<String> getFilePathList() {
		return this.filePathList;
	}
	public void setFilePathList(List<String> filePathList) {
		this.filePathList = filePathList;
	}

}
