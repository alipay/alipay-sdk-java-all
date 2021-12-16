package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布用研投放任务灰度比例调整
 *
 * @author auto create
 * @since 1.0, 2020-07-29 11:10:10
 */
public class AlipaySocialQuestionnareGrayUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 4196315349164265351L;

	/**
	 * 业务扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 灰度比例
	 */
	@ApiField("gray_percent")
	private String grayPercent;

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

	public String getGrayPercent() {
		return this.grayPercent;
	}
	public void setGrayPercent(String grayPercent) {
		this.grayPercent = grayPercent;
	}

	public String getQstnId() {
		return this.qstnId;
	}
	public void setQstnId(String qstnId) {
		this.qstnId = qstnId;
	}

}
