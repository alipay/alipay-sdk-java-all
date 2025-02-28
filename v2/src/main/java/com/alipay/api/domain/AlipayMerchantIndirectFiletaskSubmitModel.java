package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连数据文件提交
 *
 * @author auto create
 * @since 1.0, 2023-01-05 22:56:18
 */
public class AlipayMerchantIndirectFiletaskSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5232838933395913259L;

	/**
	 * 业务场景，根据具体接入的业务确定，由平台分配而来。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务分类，属于业务场景下的具体业务子类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 通过alipay.open.file.upload接口上传文件后得到的文件ID
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 服务商在支付宝的PID
	 */
	@ApiField("source_pid")
	private String sourcePid;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getSourcePid() {
		return this.sourcePid;
	}
	public void setSourcePid(String sourcePid) {
		this.sourcePid = sourcePid;
	}

}
