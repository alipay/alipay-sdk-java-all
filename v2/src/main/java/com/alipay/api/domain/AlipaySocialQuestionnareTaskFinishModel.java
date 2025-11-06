package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布用研投放任务取消投放
 *
 * @author auto create
 * @since 1.0, 2020-07-29 11:11:18
 */
public class AlipaySocialQuestionnareTaskFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6538659714773156148L;

	/**
	 * 业务扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

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

}
