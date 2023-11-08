package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板投放渠道
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:05:50
 */
public class PubChannelDTO extends AlipayObject {

	private static final long serialVersionUID = 1738725218554468579L;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 投放渠道类型
	 */
	@ApiField("pub_channel")
	private String pubChannel;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPubChannel() {
		return this.pubChannel;
	}
	public void setPubChannel(String pubChannel) {
		this.pubChannel = pubChannel;
	}

}
