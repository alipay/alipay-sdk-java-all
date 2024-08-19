package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 附件撤回(服务商->支付宝) API
 *
 * @author auto create
 * @since 1.0, 2023-06-09 18:04:23
 */
public class AlipayInsSceneInsserviceprodSerattachmentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5234267857681111965L;

	/**
	 * 待撤回的文件编号
（本字段也就是上传附件接口返回的那个附件ID）
	 */
	@ApiField("attachment_no")
	private String attachmentNo;

	public String getAttachmentNo() {
		return this.attachmentNo;
	}
	public void setAttachmentNo(String attachmentNo) {
		this.attachmentNo = attachmentNo;
	}

}
