package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建结果信息
 *
 * @author auto create
 * @since 1.0, 2023-02-28 15:41:53
 */
public class ImportSignerInfo extends AlipayObject {

	private static final long serialVersionUID = 8687885634359828224L;

	/**
	 * 创建失败原因
	 */
	@ApiField("import_fail_message")
	private String importFailMessage;

	/**
	 * 创建结果，true表示创建成功,false表示创建失败
	 */
	@ApiField("import_status")
	private Boolean importStatus;

	/**
	 * 签约人通知失败原因
	 */
	@ApiField("signer_notice_message")
	private String signerNoticeMessage;

	/**
	 * 协议签约人员工号
	 */
	@ApiField("staff_id")
	private String staffId;

	public String getImportFailMessage() {
		return this.importFailMessage;
	}
	public void setImportFailMessage(String importFailMessage) {
		this.importFailMessage = importFailMessage;
	}

	public Boolean getImportStatus() {
		return this.importStatus;
	}
	public void setImportStatus(Boolean importStatus) {
		this.importStatus = importStatus;
	}

	public String getSignerNoticeMessage() {
		return this.signerNoticeMessage;
	}
	public void setSignerNoticeMessage(String signerNoticeMessage) {
		this.signerNoticeMessage = signerNoticeMessage;
	}

	public String getStaffId() {
		return this.staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

}
