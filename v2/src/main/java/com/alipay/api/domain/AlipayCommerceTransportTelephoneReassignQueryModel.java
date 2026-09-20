package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二次放号疑似账号查询
 *
 * @author auto create
 * @since 1.0, 2026-08-26 11:02:51
 */
public class AlipayCommerceTransportTelephoneReassignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6839678736191899325L;

	/**
	 * 用户签约协议号，传入时必须与记录 usage_agreementid 完全一致，不一致判不命中
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 查询是否疑似二次放号的目标用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * null
	 */
	@ApiListField("pid_list")
	@ApiField("string")
	private List<String> pidList;

	/**
	 * 查询是否疑似二次放号的目标用户id
	 */
	@ApiField("target_uid")
	private String targetUid;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getPidList() {
		return this.pidList;
	}
	public void setPidList(List<String> pidList) {
		this.pidList = pidList;
	}

	public String getTargetUid() {
		return this.targetUid;
	}
	public void setTargetUid(String targetUid) {
		this.targetUid = targetUid;
	}

}
