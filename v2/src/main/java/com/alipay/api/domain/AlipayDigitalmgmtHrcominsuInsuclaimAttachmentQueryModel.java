package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取理赔附件
 *
 * @author auto create
 * @since 1.0, 2023-07-28 17:47:04
 */
public class AlipayDigitalmgmtHrcominsuInsuclaimAttachmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5336236925975363797L;

	/**
	 * attachment_url+不唯一+供应商获取理赔附件+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("attachment_url")
	private String attachmentUrl;

	/**
	 * data_key+唯一+供应商获取理赔附件+枚举值(无)+员工申请理赔+特殊说明(无)
	 */
	@ApiField("data_key")
	private String dataKey;

	public String getAttachmentUrl() {
		return this.attachmentUrl;
	}
	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	public String getDataKey() {
		return this.dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

}
