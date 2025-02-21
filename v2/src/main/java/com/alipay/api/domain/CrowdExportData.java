package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘人群导出详情数据
 *
 * @author auto create
 * @since 1.0, 2024-06-05 13:38:18
 */
public class CrowdExportData extends AlipayObject {

	private static final long serialVersionUID = 6376899519656912413L;

	/**
	 * 人群的业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 导出说明信息，包含渠道解释
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/**
	 * 人群唯一键
	 */
	@ApiField("crowd_code")
	private String crowdCode;

	/**
	 * 导出的渠道类型
	 */
	@ApiField("export_channel_type")
	private String exportChannelType;

	/**
	 * 导出OSS的bucket
	 */
	@ApiField("oss_bucket")
	private String ossBucket;

	/**
	 * 导出OSS文件的PATH
	 */
	@ApiField("oss_path")
	private String ossPath;

	/**
	 * 导出任务的唯一流水号
	 */
	@ApiField("uniq_biz_id")
	private String uniqBizId;

	/**
	 * 人群的数量
	 */
	@ApiField("user_count")
	private String userCount;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizMsg() {
		return this.bizMsg;
	}
	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}

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

	public String getOssBucket() {
		return this.ossBucket;
	}
	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
	}

	public String getOssPath() {
		return this.ossPath;
	}
	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
	}

	public String getUniqBizId() {
		return this.uniqBizId;
	}
	public void setUniqBizId(String uniqBizId) {
		this.uniqBizId = uniqBizId;
	}

	public String getUserCount() {
		return this.userCount;
	}
	public void setUserCount(String userCount) {
		this.userCount = userCount;
	}

}
