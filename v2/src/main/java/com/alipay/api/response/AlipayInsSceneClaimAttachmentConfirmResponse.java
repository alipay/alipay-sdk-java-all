package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.claim.attachment.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:56
 */
public class AlipayInsSceneClaimAttachmentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4355264235495657379L;

	/** 
	 * 差异的文件清单列表
	 */
	@ApiListField("lost_files")
	@ApiField("string")
	private List<String> lostFiles;

	/** 
	 * 文件上传的状态,清单和实际文件一致的返回SUCCEED，不一致的返回FAIL，同时给出lost_files清单
	 */
	@ApiField("status")
	private String status;

	public void setLostFiles(List<String> lostFiles) {
		this.lostFiles = lostFiles;
	}
	public List<String> getLostFiles( ) {
		return this.lostFiles;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
