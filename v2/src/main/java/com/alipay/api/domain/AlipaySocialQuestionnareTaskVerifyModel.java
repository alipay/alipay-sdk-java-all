package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布用研投入任务测试
 *
 * @author auto create
 * @since 1.0, 2020-07-29 11:11:36
 */
public class AlipaySocialQuestionnareTaskVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6197569584577992942L;

	/**
	 * 用户Id，多个以逗号分割
	 */
	@ApiField("buyer_user_ids")
	private String buyerUserIds;

	/**
	 * 业务扩展字段JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	/**
	 * UONE问券ID
	 */
	@ApiField("rmt_qstn_id")
	private String rmtQstnId;

	public String getBuyerUserIds() {
		return this.buyerUserIds;
	}
	public void setBuyerUserIds(String buyerUserIds) {
		this.buyerUserIds = buyerUserIds;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getQstnId() {
		return this.qstnId;
	}
	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}

	public String getRmtQstnId() {
		return this.rmtQstnId;
	}
	public void setRmtQstnId(String rmtQstnId) {
		this.rmtQstnId = rmtQstnId;
	}

}
