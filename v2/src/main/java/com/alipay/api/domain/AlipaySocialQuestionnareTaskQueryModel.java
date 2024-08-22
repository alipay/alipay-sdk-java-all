package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 哥伦布问卷配置查询
 *
 * @author auto create
 * @since 1.0, 2020-07-29 11:10:52
 */
public class AlipaySocialQuestionnareTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6253847967847726799L;

	/**
	 * 业务类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 哥伦布问券任务Id
	 */
	@ApiField("qstn_id")
	private String qstnId;

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
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

}
