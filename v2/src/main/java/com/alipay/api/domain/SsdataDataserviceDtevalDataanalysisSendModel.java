package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据报告服务数据传输接口
 *
 * @author auto create
 * @since 1.0, 2017-02-06 12:07:51
 */
public class SsdataDataserviceDtevalDataanalysisSendModel extends AlipayObject {

	private static final long serialVersionUID = 4643154888519358451L;

	/**
	 * 业务编号, 唯一流水标识
	 */
	@ApiField("biz_number")
	private String bizNumber;

	/**
	 * 业务来源，暂只支持上数来源数据流入
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 授权采集数据，爬取的完整数据加部分业务标识信息
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 处理业务类型，包括运营商、公积金等
	 */
	@ApiField("process_biz_type")
	private String processBizType;

	public String getBizNumber() {
		return this.bizNumber;
	}
	public void setBizNumber(String bizNumber) {
		this.bizNumber = bizNumber;
	}

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getProcessBizType() {
		return this.processBizType;
	}
	public void setProcessBizType(String processBizType) {
		this.processBizType = processBizType;
	}

}
