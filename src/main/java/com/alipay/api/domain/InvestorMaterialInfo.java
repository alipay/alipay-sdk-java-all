package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户合投认证的材料信息
 *
 * @author auto create
 * @since 1.0, 2021-11-09 16:56:43
 */
public class InvestorMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 8216688484326431996L;

	/**
	 * 材料文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 材料文件链接
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 用户材料类型
INVEST_EXPERIENCE——投资经历
INCOME_CERTIFICATE——收入证明
FIN_ASSET_CERTIFICATE——金融资产证明
	 */
	@ApiField("type")
	private String type;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
