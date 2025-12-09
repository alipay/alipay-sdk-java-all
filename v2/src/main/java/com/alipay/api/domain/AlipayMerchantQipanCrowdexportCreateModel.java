package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群创建渠道导出接口
 *
 * @author auto create
 * @since 1.0, 2024-06-04 19:53:31
 */
public class AlipayMerchantQipanCrowdexportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2514891953591943881L;

	/**
	 * 棋盘侧定义的人群code
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 导出渠道类型
	 */
	@ApiField("export_channel_type")
	private String exportChannelType;

	/**
	 * 外部业务号，用于幂等控制
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getCrowdCode() {
		return this.crowdCode;
	}
	public void setCrowdCode(String crowdCode) {
		this.crowdCode = crowdCode;
	}

	public String getExportChannelType() {
		return this.exportChannelType;
	}
	public void setExportChannelType(String exportChannelType) {
		this.exportChannelType = exportChannelType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
