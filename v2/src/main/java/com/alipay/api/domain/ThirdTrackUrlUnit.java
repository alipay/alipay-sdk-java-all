package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * admgr三方监控链接数据单元
 *
 * @author auto create
 * @since 1.0, 2024-05-23 20:37:50
 */
public class ThirdTrackUrlUnit extends AlipayObject {

	private static final long serialVersionUID = 8732777529175162116L;

	/**
	 * 业务类型。COMMON：通用；MIAO_ZHEN：秒针；ReachMax：ReachMax
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 上报方式： S2S：S2S C2S：C2S
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 监测类型。IMPRESSION：曝光；CLICK：点击；DEEPLINK_CLICK：唤端点击同步；TARGETURL_CLICK：落地页点击同步
	 */
	@ApiField("track_type")
	private String trackType;

	/**
	 * 监测链接：
当track_type选择DEEPLINK_CLICK、TARGETURL_CLICK时，不需要额外传入
	 */
	@ApiField("track_url")
	private String trackUrl;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getTrackType() {
		return this.trackType;
	}
	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}

	public String getTrackUrl() {
		return this.trackUrl;
	}
	public void setTrackUrl(String trackUrl) {
		this.trackUrl = trackUrl;
	}

}
