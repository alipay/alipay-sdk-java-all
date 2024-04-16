package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布用研投入任务发布
 *
 * @author auto create
 * @since 1.0, 2020-07-29 11:09:40
 */
public class AlipaySocialQuestionnareTaskPublishModel extends AlipayObject {

	private static final long serialVersionUID = 3173411967887582423L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

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

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
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
